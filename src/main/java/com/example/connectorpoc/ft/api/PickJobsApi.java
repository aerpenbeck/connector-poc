package com.example.connectorpoc.ft.api;

import com.example.connectorpoc.ft.invoker.ApiClient;

import com.example.connectorpoc.ft.model.PickJob;
import com.example.connectorpoc.ft.model.PickJobForCreation;
import com.example.connectorpoc.ft.model.PickingPatchActions;
import com.example.connectorpoc.ft.model.StrippedPickJobs;

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
@Component("com.example.connectorpoc.ft.api.PickJobsApi")
public class PickJobsApi {
    private ApiClient apiClient;

    public PickJobsApi() {
        this(new ApiClient());
    }

    @Autowired
    public PickJobsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add a new pick job for fulfillment
     * 
     * <p><b>201</b> - The pick job was successfully created. The Location header contains the URL of the pickjob.
     * <p><b>400</b> - Invalid input. See response for details
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * @param body Pick job object (required)
     * @return PickJob
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PickJob addPickJob(PickJobForCreation body) throws RestClientException {
        return addPickJobWithHttpInfo(body).getBody();
    }

    /**
     * Add a new pick job for fulfillment
     * 
     * <p><b>201</b> - The pick job was successfully created. The Location header contains the URL of the pickjob.
     * <p><b>400</b> - Invalid input. See response for details
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * @param body Pick job object (required)
     * @return ResponseEntity&lt;PickJob&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PickJob> addPickJobWithHttpInfo(PickJobForCreation body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling addPickJob");
        }
        
        String path = apiClient.expandPath("/api/pickjobs", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "firebase" };

        ParameterizedTypeReference<PickJob> returnType = new ParameterizedTypeReference<PickJob>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get a pick job with the given ID
     * 
     * <p><b>200</b> - PickJob was found &amp; you were allowed to access it. The result is in the body.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Entity not found
     * @param pickJobId ID of the pickjob you want to get (required)
     * @return PickJob
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PickJob getPickJob(String pickJobId) throws RestClientException {
        return getPickJobWithHttpInfo(pickJobId).getBody();
    }

    /**
     * Get a pick job with the given ID
     * 
     * <p><b>200</b> - PickJob was found &amp; you were allowed to access it. The result is in the body.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Entity not found
     * @param pickJobId ID of the pickjob you want to get (required)
     * @return ResponseEntity&lt;PickJob&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PickJob> getPickJobWithHttpInfo(String pickJobId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'pickJobId' is set
        if (pickJobId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pickJobId' when calling getPickJob");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pickJobId", pickJobId);
        String path = apiClient.expandPath("/api/pickjobs/{pickJobId}", uriVariables);

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

        ParameterizedTypeReference<PickJob> returnType = new ParameterizedTypeReference<PickJob>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Patches a pick job with the given ID
     * 
     * <p><b>200</b> - PickJob was found &amp; patch-set has been applied. The patched pick job is in the body.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - PickJob not found
     * <p><b>409</b> - PickJob version conflict
     * @param pickJobId ID of the pickjob you want to get (required)
     * @param body Patch set (required)
     * @return PickJob
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PickJob pathPickJob(String pickJobId, PickingPatchActions body) throws RestClientException {
        return pathPickJobWithHttpInfo(pickJobId, body).getBody();
    }

    /**
     * Patches a pick job with the given ID
     * 
     * <p><b>200</b> - PickJob was found &amp; patch-set has been applied. The patched pick job is in the body.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - PickJob not found
     * <p><b>409</b> - PickJob version conflict
     * @param pickJobId ID of the pickjob you want to get (required)
     * @param body Patch set (required)
     * @return ResponseEntity&lt;PickJob&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PickJob> pathPickJobWithHttpInfo(String pickJobId, PickingPatchActions body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'pickJobId' is set
        if (pickJobId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pickJobId' when calling pathPickJob");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling pathPickJob");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pickJobId", pickJobId);
        String path = apiClient.expandPath("/api/pickjobs/{pickJobId}", uriVariables);

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

        ParameterizedTypeReference<PickJob> returnType = new ParameterizedTypeReference<PickJob>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Simple query interface to find pickjobs
     * 
     * <p><b>200</b> - PickJobs were found. The results are in the body.
     * <p><b>204</b> - No PickJobs were found as a result to the given query.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * @param orderRef Reference to the order you want to get the corresponding pickjobs (optional)
     * @param page requested page number (optional, default to 1)
     * @param size number of entities to show (optional, default to 25)
     * @return StrippedPickJobs
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StrippedPickJobs queryPickJobs(String orderRef, Integer page, Integer size) throws RestClientException {
        return queryPickJobsWithHttpInfo(orderRef, page, size).getBody();
    }

    /**
     * Simple query interface to find pickjobs
     * 
     * <p><b>200</b> - PickJobs were found. The results are in the body.
     * <p><b>204</b> - No PickJobs were found as a result to the given query.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * @param orderRef Reference to the order you want to get the corresponding pickjobs (optional)
     * @param page requested page number (optional, default to 1)
     * @param size number of entities to show (optional, default to 25)
     * @return ResponseEntity&lt;StrippedPickJobs&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StrippedPickJobs> queryPickJobsWithHttpInfo(String orderRef, Integer page, Integer size) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/pickjobs", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "orderRef", orderRef));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "firebase" };

        ParameterizedTypeReference<StrippedPickJobs> returnType = new ParameterizedTypeReference<StrippedPickJobs>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
