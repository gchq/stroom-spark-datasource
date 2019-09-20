package stroom.spark.datasource;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.spark.sql.types.StructType;
import org.apache.spark.unsafe.types.UTF8String;
import stroom.query.api.v2.*;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static stroom.spark.datasource.StroomDataSource.*;

public class StroomSearcher {


    private String host;
    private String url;
    private String destroyURL;
    private String token;
    private String protocol;



    public StroomSearcher(StructType schema, String protocol, String host, String url, String destroyURL, String token) {
        this.host = host;
        this.url = url;
        this.token = token;
        this.protocol = protocol;
        this.destroyURL = destroyURL;

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

        } while ((result = performSearch(searchRequest)).moreExpected);

        return result.rows;
    }


    private boolean firstRequest = true;

    public static class StroomSearchResult{
        public boolean moreExpected = false;
        public List<Row> rows = null;
    }

    /**
     *
     * @param searchRequest
     * @return true if there are more results anticipated for this request
     */
    public StroomSearchResult performSearch(final SearchRequest searchRequest) {
        StroomSearchResult result = new StroomSearchResult();

        long maxIndex = searchRequest.getResultRequests().get(0).getRequestedRange().getOffset() +
                searchRequest.getResultRequests().get(0).getRequestedRange().getLength() - 1;

        Client client = ClientBuilder.newClient();


        String fullUrl = protocol + "://"+ host + "/" + url;

        if (VERBOSE_DEBUG)
            System.out.println("Connecting to " + fullUrl);

        final ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);
        mapper.configure(SerializationFeature.INDENT_OUTPUT, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        // Enabling default typing adds type information where it would otherwise be ambiguous, i.e. for abstract classes
//        mapper.enableDefaultTyping();
        //   mapper.writeValue(outputStream, objectModel);

        String json = null;

        try {
            json = mapper.writeValueAsString(searchRequest);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Unable to serialize the search request");
        }
        if (firstRequest){
            System.out.println ("Request follows...");
            System.out.println (json);
            firstRequest = false;
        }


        Response response = client.target(fullUrl)

                .request()
                .header("Authorization", "Bearer " + token)
                .accept(MediaType.APPLICATION_JSON_TYPE)
                .post(Entity.json(json));
        //       .post(Entity.json(searchRequest));
        //   .post(Entity.json(json));
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
        if (VERBOSE_DEBUG) {
            System.out.println ("Response follows...");
            System.out.println (responseBody);
        }

        SearchResponse searchResponse;

        try {
            searchResponse = mapper.readValue(responseBody, SearchResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Unable to read response");

        }
        //assume one Result object in the response

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
            result.moreExpected = tableResult.getTotalResults() < maxIndex && !searchResponse.complete();
        }
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
