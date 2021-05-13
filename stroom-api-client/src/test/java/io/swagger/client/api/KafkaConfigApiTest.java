/*
 * Stroom API
 * Various APIs for interacting with Stroom and its data
 *
 * OpenAPI spec version: v1/v2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.DocRef;
import io.swagger.client.model.KafkaConfigDoc;
import io.swagger.client.model.ResourceGeneration;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for KafkaConfigApi
 */
@Ignore
public class KafkaConfigApiTest {

    private final KafkaConfigApi api = new KafkaConfigApi();

    /**
     * Download a kafkaConfig doc
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadKafkaConfigTest() throws ApiException {
        DocRef body = null;
        ResourceGeneration response = api.downloadKafkaConfig(body);

        // TODO: test validations
    }
    /**
     * Fetch a kafkaConfig doc by its UUID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchKafkaConfigTest() throws ApiException {
        String uuid = null;
        KafkaConfigDoc response = api.fetchKafkaConfig(uuid);

        // TODO: test validations
    }
    /**
     * Update a kafkaConfig doc
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateKafkaConfigTest() throws ApiException {
        KafkaConfigDoc body = null;
        String uuid = null;
        KafkaConfigDoc response = api.updateKafkaConfig(body, uuid);

        // TODO: test validations
    }
}