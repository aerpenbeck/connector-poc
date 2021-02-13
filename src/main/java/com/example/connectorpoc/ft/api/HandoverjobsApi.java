package com.example.connectorpoc.ft.api;

import com.example.connectorpoc.ft.invoker.ApiClient;

import com.example.connectorpoc.ft.model.Handoverjob;
import com.example.connectorpoc.ft.model.HandoverjobPatchActions;
import com.example.connectorpoc.ft.model.StrippedHandoverjobs;

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
@Component("com.example.connectorpoc.ft.api.HandoverjobsApi")
public class HandoverjobsApi {
    private ApiClient apiClient;

    public HandoverjobsApi() {
        this(new ApiClient());
    }

    @Autowired
    public HandoverjobsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Return all handoverjobs
     * 
     * <p><b>200</b> - Handoverjobs are found.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * @param page requested page number (optional, default to 1)
     * @param size number of entities to show (optional, default to 25)
     * @param pickJobRef This query can be used to find handoverjobs for a referenced pickjob (optional)
     * @param shipmentRef This query can be used to find handoverjobs for a referenced shipment (optional)
     * @return StrippedHandoverjobs
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StrippedHandoverjobs getAllHandoverjobs(Integer page, Integer size, String pickJobRef, String shipmentRef) throws RestClientException {
        return getAllHandoverjobsWithHttpInfo(page, size, pickJobRef, shipmentRef).getBody();
    }

    /**
     * Return all handoverjobs
     * 
     * <p><b>200</b> - Handoverjobs are found.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * @param page requested page number (optional, default to 1)
     * @param size number of entities to show (optional, default to 25)
     * @param pickJobRef This query can be used to find handoverjobs for a referenced pickjob (optional)
     * @param shipmentRef This query can be used to find handoverjobs for a referenced shipment (optional)
     * @return ResponseEntity&lt;StrippedHandoverjobs&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StrippedHandoverjobs> getAllHandoverjobsWithHttpInfo(Integer page, Integer size, String pickJobRef, String shipmentRef) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/handoverjobs", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pickJobRef", pickJobRef));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "shipmentRef", shipmentRef));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "firebase" };

        ParameterizedTypeReference<StrippedHandoverjobs> returnType = new ParameterizedTypeReference<StrippedHandoverjobs>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get a Handoverjob with the given ID
     * 
     * <p><b>200</b> - Handoverjob was found &amp; you were allowed to access it. The result is in the body.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Entity not found
     * @param handoverjobId ID of the handoverjob you want to get (required)
     * @return Handoverjob
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Handoverjob getHandoverjob(String handoverjobId) throws RestClientException {
        return getHandoverjobWithHttpInfo(handoverjobId).getBody();
    }

    /**
     * Get a Handoverjob with the given ID
     * 
     * <p><b>200</b> - Handoverjob was found &amp; you were allowed to access it. The result is in the body.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Entity not found
     * @param handoverjobId ID of the handoverjob you want to get (required)
     * @return ResponseEntity&lt;Handoverjob&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Handoverjob> getHandoverjobWithHttpInfo(String handoverjobId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'handoverjobId' is set
        if (handoverjobId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'handoverjobId' when calling getHandoverjob");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("handoverjobId", handoverjobId);
        String path = apiClient.expandPath("/api/handoverjobs/{handoverjobId}", uriVariables);

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

        ParameterizedTypeReference<Handoverjob> returnType = new ParameterizedTypeReference<Handoverjob>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Patches a handoverjob with the given ID
     * 
     * <p><b>200</b> - Handoverjob was found &amp; patch-set has been applied. The patched entity is in the body.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Entity not found
     * <p><b>409</b> - Entity version conflict
     * @param handoverjobId ID of handoverjob you want to patch (required)
     * @param body Patch set (required)
     * @return Handoverjob
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Handoverjob patchHandoverjob(String handoverjobId, HandoverjobPatchActions body) throws RestClientException {
        return patchHandoverjobWithHttpInfo(handoverjobId, body).getBody();
    }

    /**
     * Patches a handoverjob with the given ID
     * 
     * <p><b>200</b> - Handoverjob was found &amp; patch-set has been applied. The patched entity is in the body.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Entity not found
     * <p><b>409</b> - Entity version conflict
     * @param handoverjobId ID of handoverjob you want to patch (required)
     * @param body Patch set (required)
     * @return ResponseEntity&lt;Handoverjob&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Handoverjob> patchHandoverjobWithHttpInfo(String handoverjobId, HandoverjobPatchActions body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'handoverjobId' is set
        if (handoverjobId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'handoverjobId' when calling patchHandoverjob");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchHandoverjob");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("handoverjobId", handoverjobId);
        String path = apiClient.expandPath("/api/handoverjobs/{handoverjobId}", uriVariables);

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

        ParameterizedTypeReference<Handoverjob> returnType = new ParameterizedTypeReference<Handoverjob>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
