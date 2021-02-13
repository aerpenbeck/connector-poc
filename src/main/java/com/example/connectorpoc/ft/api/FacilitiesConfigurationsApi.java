package com.example.connectorpoc.ft.api;

import com.example.connectorpoc.ft.invoker.ApiClient;

import com.example.connectorpoc.ft.model.FacilityStockConfiguration;
import com.example.connectorpoc.ft.model.LinkedConfiguration;
import com.example.connectorpoc.ft.model.StockConfigurationPatchActions;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T17:37:48.618828+01:00[Europe/Berlin]")
@Component("com.example.connectorpoc.ft.api.FacilitiesConfigurationsApi")
public class FacilitiesConfigurationsApi {
    private ApiClient apiClient;

    public FacilitiesConfigurationsApi() {
        this(new ApiClient());
    }

    @Autowired
    public FacilitiesConfigurationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Gets the list of currently available and applied configurations for the given facility. 
     * The response will merely supply a list of links that lead to configurations - for changing them please refer to the resources below. The contents of this list depends on the layout of your system, entries can appear and disappear based on configuration or internal processing
     * <p><b>200</b> - Configurations were found. A link list can be found in the response.
     * <p><b>404</b> - No active configurations found for this facility
     * @param facilityId ID of facility you want to retrieve the configurations for (required)
     * @return List&lt;LinkedConfiguration&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<LinkedConfiguration> getFacilityConfigurations(String facilityId) throws RestClientException {
        return getFacilityConfigurationsWithHttpInfo(facilityId).getBody();
    }

    /**
     * Gets the list of currently available and applied configurations for the given facility. 
     * The response will merely supply a list of links that lead to configurations - for changing them please refer to the resources below. The contents of this list depends on the layout of your system, entries can appear and disappear based on configuration or internal processing
     * <p><b>200</b> - Configurations were found. A link list can be found in the response.
     * <p><b>404</b> - No active configurations found for this facility
     * @param facilityId ID of facility you want to retrieve the configurations for (required)
     * @return ResponseEntity&lt;List&lt;LinkedConfiguration&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<LinkedConfiguration>> getFacilityConfigurationsWithHttpInfo(String facilityId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'facilityId' is set
        if (facilityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'facilityId' when calling getFacilityConfigurations");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("facilityId", facilityId);
        String path = apiClient.expandPath("/api/facilities/{facilityId}/configurations", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "firebase" };

        ParameterizedTypeReference<List<LinkedConfiguration>> returnType = new ParameterizedTypeReference<List<LinkedConfiguration>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Gets the facility&#39;s current configuration for stock related order distribution
     * 
     * <p><b>200</b> - Configuration for stock routing was found.
     * <p><b>404</b> - No active configurations found for this facility
     * @param facilityId ID of facility you want to retrieve the configurations for (required)
     * @return FacilityStockConfiguration
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FacilityStockConfiguration getFacilityStockConfiguration(String facilityId) throws RestClientException {
        return getFacilityStockConfigurationWithHttpInfo(facilityId).getBody();
    }

    /**
     * Gets the facility&#39;s current configuration for stock related order distribution
     * 
     * <p><b>200</b> - Configuration for stock routing was found.
     * <p><b>404</b> - No active configurations found for this facility
     * @param facilityId ID of facility you want to retrieve the configurations for (required)
     * @return ResponseEntity&lt;FacilityStockConfiguration&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FacilityStockConfiguration> getFacilityStockConfigurationWithHttpInfo(String facilityId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'facilityId' is set
        if (facilityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'facilityId' when calling getFacilityStockConfiguration");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("facilityId", facilityId);
        String path = apiClient.expandPath("/api/facilities/{facilityId}/configurations/stock", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "firebase" };

        ParameterizedTypeReference<FacilityStockConfiguration> returnType = new ParameterizedTypeReference<FacilityStockConfiguration>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Patches a facility configuration with the given ID
     * 
     * <p><b>200</b> - Facility was found &amp; patch-set has been applied. The patched facility configuration is in the body.
     * <p><b>400</b> - Invalid input. See response for details
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Facility Configuration not found
     * <p><b>409</b> - Facility version conflict
     * @param facilityId ID of facility you want to get (required)
     * @param body Patch set (required)
     * @return FacilityStockConfiguration
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FacilityStockConfiguration patchFacilityConfiguration(String facilityId, StockConfigurationPatchActions body) throws RestClientException {
        return patchFacilityConfigurationWithHttpInfo(facilityId, body).getBody();
    }

    /**
     * Patches a facility configuration with the given ID
     * 
     * <p><b>200</b> - Facility was found &amp; patch-set has been applied. The patched facility configuration is in the body.
     * <p><b>400</b> - Invalid input. See response for details
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Facility Configuration not found
     * <p><b>409</b> - Facility version conflict
     * @param facilityId ID of facility you want to get (required)
     * @param body Patch set (required)
     * @return ResponseEntity&lt;FacilityStockConfiguration&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FacilityStockConfiguration> patchFacilityConfigurationWithHttpInfo(String facilityId, StockConfigurationPatchActions body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'facilityId' is set
        if (facilityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'facilityId' when calling patchFacilityConfiguration");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchFacilityConfiguration");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("facilityId", facilityId);
        String path = apiClient.expandPath("/api/facilities/{facilityId}/configurations/stock", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "firebase" };

        ParameterizedTypeReference<FacilityStockConfiguration> returnType = new ParameterizedTypeReference<FacilityStockConfiguration>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
