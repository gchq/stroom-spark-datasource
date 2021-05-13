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
import io.swagger.client.model.AuthenticationState;
import io.swagger.client.model.ChangePasswordRequest;
import io.swagger.client.model.ChangePasswordResponse;
import io.swagger.client.model.ConfirmPasswordRequest;
import io.swagger.client.model.ConfirmPasswordResponse;
import io.swagger.client.model.LoginRequest;
import io.swagger.client.model.LoginResponse;
import io.swagger.client.model.PasswordPolicyConfig;
import io.swagger.client.model.ResetPasswordRequest;
import io.swagger.client.model.TokenRequest;
import io.swagger.client.model.TokenResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthenticationApi
 */
@Ignore
public class AuthenticationApiTest {

    private final AuthenticationApi api = new AuthenticationApi();

    /**
     * Change a user&#x27;s password.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void changePasswordTest() throws ApiException {
        ChangePasswordRequest body = null;
        ChangePasswordResponse response = api.changePassword(body);

        // TODO: test validations
    }
    /**
     * Confirm an authenticated user&#x27;s current password.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void confirmPasswordTest() throws ApiException {
        ConfirmPasswordRequest body = null;
        ConfirmPasswordResponse response = api.confirmPassword(body);

        // TODO: test validations
    }
    /**
     * Get the password policy
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchPasswordPolicyTest() throws ApiException {
        PasswordPolicyConfig response = api.fetchPasswordPolicy();

        // TODO: test validations
    }
    /**
     * Get the current authentication state
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuthenticationStateTest() throws ApiException {
        AuthenticationState response = api.getAuthenticationState();

        // TODO: test validations
    }
    /**
     * Handle a login request made using username and password credentials.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void loginTest() throws ApiException {
        LoginRequest body = null;
        LoginResponse response = api.login(body);

        // TODO: test validations
    }
    /**
     * Log a user out of their session
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void logoutTest() throws ApiException {
        String redirectUri = null;
        Boolean response = api.logout(redirectUri);

        // TODO: test validations
    }
    /**
     * Check if a user&#x27;s password needs changing.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void needsPasswordChangeTest() throws ApiException {
        String email = null;
        Boolean response = api.needsPasswordChange(email);

        // TODO: test validations
    }
    /**
     * Submit an OpenId AuthenticationRequest.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void openIdAuthTest() throws ApiException {
        String scope = null;
        String responseType = null;
        String clientId = null;
        String redirectUri = null;
        String nonce = null;
        String state = null;
        String prompt = null;
        api.openIdAuth(scope, responseType, clientId, redirectUri, nonce, state, prompt);

        // TODO: test validations
    }
    /**
     * Provides access to this service&#x27;s current public key. A client may use these keys to verify JWTs issued by this service.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void openIdCertsTest() throws ApiException {
        Map<String, List<Map<String, Object>>> response = api.openIdCerts();

        // TODO: test validations
    }
    /**
     * Provides discovery for openid configuration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void openIdConfigurationTest() throws ApiException {
        String response = api.openIdConfiguration();

        // TODO: test validations
    }
    /**
     * Get a token from an access code
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void openIdTokenTest() throws ApiException {
        TokenRequest body = null;
        TokenResponse response = api.openIdToken(body);

        // TODO: test validations
    }
    /**
     * Reset a user account using an email address.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resetEmailTest() throws ApiException {
        String email = null;
        Boolean response = api.resetEmail(email);

        // TODO: test validations
    }
    /**
     * Reset an authenticated user&#x27;s password.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resetPasswordTest() throws ApiException {
        ResetPasswordRequest body = null;
        ChangePasswordResponse response = api.resetPassword(body);

        // TODO: test validations
    }
}
