package spark.datasource;


import org.assertj.core.util.Lists;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.api.DataSourcesApi;
import org.openapitools.client.api.StroomIndexQueriesApi;
import org.openapitools.client.api.WelcomeApi;
import org.openapitools.client.auth.ApiKeyAuth;


import org.openapitools.client.model.Welcome;
import stroom.datasource.api.v2.AbstractField;
import stroom.docref.DocRef;
import stroom.query.api.v2.ExpressionOperator;
import stroom.query.api.v2.ExpressionTerm;
import stroom.query.api.v2.Field;
import stroom.query.api.v2.OffsetRange;
import stroom.query.api.v2.Query;
import stroom.query.api.v2.QueryKey;
import stroom.query.api.v2.ResultRequest;
import stroom.query.api.v2.SearchRequest;
import stroom.query.api.v2.SearchResponse;
import stroom.query.api.v2.TableResult;
import stroom.query.api.v2.TableSettings;

import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
import static stroom.spark.datasource.StroomDataSource.EXTRACTION_PIPELINE_DOCREF_TYPEID;
import static stroom.spark.datasource.StroomDataSource.EXTRACTION_PIPELINE_NAME;
import static stroom.spark.datasource.StroomDataSource.INDEX_DOCREF_TYPE_ID;
import static stroom.spark.datasource.StroomDataSource.INDEX_NAME;


public class TestSwaggerClient {

    private static final String BASE_PATH="https://127.0.0.1/api";

    //The Stroom Family Events Index from stroom-logs.zip standard content pack
    private static final String INDEX_UUID="3e72379d-403f-4757-88d5-bfae4d724b55";
    private static final String EXTRACTION_PIPELINE_UUID="2ac7b541-293d-4d9e-bb8d-f081dd631c7c";

    @BeforeAll
    static void setUp() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(BASE_PATH);
        defaultClient.setDebugging(true);

        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
//        ApiKeyAuth.setApiKey(
//               "eyJhbGciOiJSUzI1NiIsImtpZCI6IjFlYzdhOTgzLTMxN2QtNDZjZS1hZTkzLWNlNDJiYzIxN2U1MiJ9." +
//                       "eyJleHAiOjE2NTQzNDA4MzYsInN1YiI6ImFkbWluIiwiaXNzIjoic3Ryb29tIiwiYXVkIjoiZXhpVEZ3VWp" +
//                       "BWXVybmxNVkV5VXJZNDdDUDJHeGdVZnhmZ1BkRUU2OC5jbGllbnQtaWQuYXBwcy5zdHJvb20taWRwIn0.OJpVk" +
//                       "-xwdQuLIsJP5nRG6qY6oTGRaCXCb4cX_w0bASMNiBTQ_kgjOTpSmtHYsDAHzRzJE_N8Ef_svVPNj7UjTk5_sstd5bZZhXD" +
//                       "B50wP71QUN-MEsX-LGlzJG-2e9CcNEoXTbD2kjuLMYMCg6r7_esC-iaVvHJBIhfJHOnh3zvgqTWfEM2B3Qwx1eXCwZ" +
//                       "NzDHcMZvwR2Z-K3ny_Trm1HngJYCWI2DQ6HvukrVoRCm6vbNGyQ8WkRNoElJjOOZF3ErJAUJLqrnI2X" +
//                       "PE444jamXlWJAJQhljm2rGsZEEhFXo8CMzV-70vBRPhxV7iSpwr2kboFgnpVePPXBCupdN8NjA"
//        );

        ApiKeyAuth.setApiKey("eyJhbGciOiJSUzI1NiIsImtpZCI6IjhhM2I1OGNhLTk2ZTctNGFhNC05ZjA3" +
                "LTQ0MDBhYWVkMTQ3MSJ9.eyJleHAiOjE2NDEzMTYyODMsInN1YiI6ImFkbWluIiwiaXNzIjoic3Ry" +
                "b29tIiwiYXVkIjoiTlhDbXJyTGpQR2VBMVN4NWNEZkF6OUV2ODdXaTNucHRUbzZSdzVmTC5jbGllbnQta" +
                "WQuYXBwcy5zdHJvb20taWRwIn0.mU7gfhvbNFVzQ5RX86zcnvS6XZeNpYDZRJ5Zx2rPOuZsha15kJjMKw0P" +
                "EH2T1Ucs2JEuhrj5P0Vu7pi_i7CtWSLNsmjZYrYL-udugijhEN9dxjuze5lnuOxb1LENrNoPaRvHpBiFyO3" +
                "yIYO4Y9UcRdcAj-9Yt8zgqLP208KOU36n3dl0ErKXAKFyUbuu--1sDCnpSq4fxCMWfUhgENIkhUm6EnI8s51" +
                "0QdDxIeK95nHcM0H_I7cV0YXfpL4HgnsCCPJUJkYT1x71FQGuACi9Ba0JKdVF8PwdH4k4ryoK_b3ObFS" +
                "ueGpq2fBcFy385r6lDLUu91MODoY7yh9gagK-gw");
    }

    @Test
    public void testConnectWithInvalidApiKey() {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(BASE_PATH);
        apiClient.setDebugging(true);

        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) apiClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("Let me in purlease!");

        WelcomeApi apiInstance = new WelcomeApi(apiClient);

        Welcome result = null;
        ApiException e = null;
        try {
            result = apiInstance.fetchWelcome();
        }catch (ApiException ex){
            e = ex;
        }
        assertThat(e).withFailMessage("No exception thrown by API").isNotNull();
        assertThat(e.getCode()).withFailMessage("Expected 401 unauthorized response code").isEqualTo(401);
        assertThat(result).isNull();
    }

    @Test
    public void testConnection() throws Exception {
        WelcomeApi apiInstance = new WelcomeApi();

        Welcome result = apiInstance.fetchWelcome();

        assertThat(result.getHtml()).isNotNull().withFailMessage(()->"No HTML returned from Stroom - unexpected");
        System.out.println ("Result received");
        System.out.println(result);
    }

    private DocRef createIndexDocRef() {
        DocRef indexDocRef = new DocRef();
        indexDocRef.setType(INDEX_DOCREF_TYPE_ID);
        indexDocRef.setUuid(INDEX_UUID);
        indexDocRef.setName(INDEX_NAME);

        return indexDocRef;
    }

    @Test
    public void testFindDatasources() throws Exception {
        DataSourcesApi dataSourcesApi = new DataSourcesApi();

        List<AbstractField> fields = dataSourcesApi.fetchDataSourceFields(createIndexDocRef());

        assertThat(fields).withFailMessage("Cannot find index " +
                "Have you imported stroom-logs-v3.0-beta.1.zip").isNotNull();
        assertThat(fields).withFailMessage("Unexpected number of columns (" + fields.size() + ")" +
                "Have you imported stroom-logs-v3.0-beta.1.zip").hasSize(21);
    }

    private TableSettings createTableSettings() {
        DocRef pipeline = new DocRef();
        pipeline.setName(EXTRACTION_PIPELINE_NAME);
        pipeline.setUuid(EXTRACTION_PIPELINE_UUID);
        pipeline.setType(EXTRACTION_PIPELINE_DOCREF_TYPEID);

        TableSettings tableSettings = TableSettings.builder()
        .queryId("myQuery")
        .extractionPipeline(pipeline)
                .addFields(Field.builder()
                        .expression("${EventId}")
                        .build())
        .addMaxResults(100)
        .extractValues(true)
                .build();

        return tableSettings;
    }

    private SearchRequest createSearchRequest() {
        TableSettings tableSettings = createTableSettings();
        OffsetRange range = new OffsetRange(0l,100l);

        ResultRequest resultRequest = ResultRequest.builder()
        .componentId("mainResult")
        .resultStyle(ResultRequest.ResultStyle.TABLE)
        .requestedRange(range)
        .addMappings(tableSettings).build();



        ExpressionOperator expression = ExpressionOperator.builder()
        .op(ExpressionOperator.Op.AND)
                .addTerm(
                        ExpressionTerm.builder()
        .field("Event Time")
        .condition(ExpressionTerm.Condition.GREATER_THAN)
        .value("2000-01-01T00:00:00.000Z").build()
                ).build();

        Query query = Query.builder()
                .dataSource(createIndexDocRef())
                .expression(expression)
                .build();

        SearchRequest searchRequest = new SearchRequest();
        searchRequest.setQuery(query);
        searchRequest.setIncremental(false);

        QueryKey key = new QueryKey();
        key.setUuid(UUID.randomUUID().toString());
        searchRequest.setKey(key);
        searchRequest.setResultRequests(Lists.list(resultRequest));

        return searchRequest;
    }

    @Test
    public void testSearch() throws Exception {
        StroomIndexQueriesApi searchApi = new StroomIndexQueriesApi();

        SearchRequest request = createSearchRequest();

        SearchResponse initialResponse = searchApi.searchStroomIndex(request);

        assertThat(initialResponse).isNotNull();
        assertThat(initialResponse.getComplete()).withFailMessage("Search has not completed").isTrue();
        assertThat(initialResponse.getErrors()).isNullOrEmpty();
        assertThat(initialResponse.getResults()).isNotNull();
        assertThat(initialResponse.getResults().get(0)).isInstanceOf(TableResult.class);
        TableResult tableResult = (TableResult) initialResponse.getResults().get(0);
        assertThat(tableResult.getRows()).hasSize(100);

    }



}
