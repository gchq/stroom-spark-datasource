/*
 * Copyright 2019 Crown Copyright
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package stroom.spark.datasource;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import org.apache.spark.sql.types.StructType;
import org.apache.spark.unsafe.types.UTF8String;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import stroom.query.api.v2.Row;
import stroom.query.api.v2.SearchRequest;
import stroom.query.api.v2.SearchResponse;
import stroom.query.api.v2.TableResult;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;


public class StroomSearcher {
    private static final int MAX_SEARCH_INTERVAL = 60000;
    private static final Logger LOGGER = LoggerFactory.getLogger(StroomSearcher.class);

    private String host;
    private String url;
    private String destroyURL;
    private String token;
    private String protocol;

    private Random random = new Random();
    private int traceLevel = 0;


    public StroomSearcher(StructType schema, String protocol, String host, String url, String destroyURL, String token) {
        this.host = host;
        this.url = url;
        this.token = token;
        this.protocol = protocol;
        this.destroyURL = destroyURL;

    }

    /**
     * Change what request/response information is output to stdout (for diagnostic purposes)
     * @param level 0=none;1=1st request only;2=1st request and response;3=All initial requests and 1st response;4=All initial only;5=All
     */
    public void setTraceLevel(int level){
        traceLevel = level;
    }

    public List<Row> searchAndReadResults (final SearchRequest searchRequest) {

        StroomSearchResult result = null;
        long sleepMs = 10;

        do{
            try {
                Thread.sleep(sleepMs);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            sleepMs = 5 * sleepMs;
            if (sleepMs > MAX_SEARCH_INTERVAL){
                sleepMs = MAX_SEARCH_INTERVAL;
            }
        } while ((result = performSearch(searchRequest)).moreExpected);

        return result.rows;
    }


    private boolean firstRequest = true;

    public static class StroomSearchResult{
        public boolean moreExpected = false;
        public List<Row> rows = null;
    }

    private void trace (String type, String details){
        System.out.println (type + " follows:");
        System.out.println (details);
    }
    private void traceRequest (String request, boolean queryProvided){
        if (firstRequest)
            LOGGER.debug ("Request made", request);

        if (traceLevel < 1)
            return;

        if ((traceLevel < 5) && !firstRequest)
            return;

        if ((traceLevel < 3) && !queryProvided)
            return;

        trace("Request", request);
    }
    private void traceResponse (String response, boolean queryProvided){
        if (firstRequest)
            LOGGER.debug ("Response received", response);

        if (traceLevel < 2)
            return;

        if ((traceLevel < 5) && !firstRequest)
            return;

        if ((traceLevel < 4) && !queryProvided)
            return;

        trace("Response", response);
    }

    //Todo use the swagger client api call as well as its model.
    public StroomSearchResult performSearch(final SearchRequest searchRequest) {
        StroomSearchResult result = new StroomSearchResult();

        long maxIndex = searchRequest.getResultRequests().get(0).getRequestedRange().getOffset() +
                searchRequest.getResultRequests().get(0).getRequestedRange().getLength() - 1;

        Client client = ClientBuilder.newClient();


        String fullUrl = protocol + "://"+ host + "/" + url;

        LOGGER.debug("Connecting to " + fullUrl);

        final ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        mapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);
        mapper.configure(SerializationFeature.INDENT_OUTPUT, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        String json = null;

        try {
            json = mapper.writeValueAsString(searchRequest);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Unable to serialize the search request");
        }

        boolean searchProvided = (searchRequest.getQuery() == null);

        traceRequest(json, searchProvided);

        Response response = client.target(fullUrl)

                .request()
                .header("Authorization", "Bearer " + token)
                .accept(MediaType.APPLICATION_JSON_TYPE)
                .post(Entity.json(json));

        if (response.getStatus() != 200) {
            System.err.println("Output...");
            System.err.println(response.readEntity(String.class));

            try{
                String responseBody = response.readEntity(String.class);
                if (responseBody.length() > 0) {
                    throw new IllegalArgumentException("Got non 200 response from Stroom search API: "
                            + response.getStatus() + " " + responseBody);
                }
            }catch (Exception ex) {
                throw new IllegalArgumentException("Got non 200 response from Stroom search API: "
                        + response.getStatus() + " " + response.getStatusInfo().getReasonPhrase());
            }
        }

        String responseBody = response.readEntity(String.class);
        traceResponse(responseBody, searchProvided);

        SearchResponse searchResponse;

        try {
            searchResponse = mapper.readValue(responseBody, SearchResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Unable to read response");

        }

        TableResult tableResult = null;
        if (searchResponse != null && searchResponse.getResults() != null &&
                searchResponse.getResults().size() > 0) {
            if (searchResponse.getResults().size() != 1){
                throw new IllegalArgumentException("Only single result expected.  Got " +
                        searchResponse.getResults().size());
            }
            if (!(searchResponse.getResults().get(0) instanceof TableResult)) {
                throw new IllegalArgumentException("TableResult expected but given " +
                        searchResponse.getResults().get(0));
            }

            tableResult = ((TableResult) searchResponse.getResults().get(0));
            result.rows = tableResult.getRows();
            result.moreExpected = tableResult.getTotalResults() < maxIndex && !searchResponse.getComplete();
        }

        firstRequest = false;

        return result;
    }


    public void destroy(StroomQuery stroomQuery) throws IOException {

        Client client = ClientBuilder.newClient();


        String fullUrl = protocol + "://"+ host + "/" + destroyURL;

        if (true)
            System.out.println("Connecting to " + fullUrl);


        String json = "{ \"uuid\": \"" + stroomQuery.getQueryRequestKey() + "\" }";

        if (true){
            System.out.println ("Destruction request follows...");
            System.out.println (json);
        }

        Response response = client.target(fullUrl)
                .request()
                .header("Authorization", "Bearer " + token)
                .accept(MediaType.APPLICATION_JSON_TYPE)
                .post(Entity.json(json));

        if (response.getStatus() != 200) {
            System.err.println("Output...");
            System.err.println(response.readEntity(String.class));
            throw new IllegalArgumentException("Got non 200 response from Stroom destroy API: "
                    + response.getStatus() + " " + response.getStatusInfo().getReasonPhrase());
        }

        String responseBody = response.readEntity(String.class);
        if (responseBody.length() > 0) {
            System.out.println ("Response follows...");
            System.out.println (responseBody);
        }

    }

    private static Object[] convertVals (List <String> original){
        if (original == null)
            return new Object[0];
        Object [] output = new Object [original.size()];
        int i = 0;
        for (String val : original){

            if (val == null){
                output[i] = UTF8String.blankString(0);
            } else {
                output[i] = UTF8String.fromBytes(val.getBytes(StandardCharsets.UTF_8));
            }
            i++;
        }
        return output;
    }
}
