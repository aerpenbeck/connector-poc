package com.example.connectorpoc.ft.api;

import com.example.connectorpoc.ft.invoker.ApiClient;

import com.example.connectorpoc.ft.model.Carrier;
import com.example.connectorpoc.ft.model.CarrierForCreation;
import com.example.connectorpoc.ft.model.CarrierPatchActions;

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
@Component("com.example.connectorpoc.ft.api.CarriersApi")
public class CarriersApi {
    private ApiClient apiClient;

    public CarriersApi() {
        this(new ApiClient());
    }

    @Autowired
    public CarriersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add a new carrier as a CEP partner
     * 
     * <p><b>201</b> - The carrier was successfully created. The Location header contains the URL of the carrier.
     * <p><b>400</b> - Invalid input. See response for details
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * @param body Carrier object (required)
     * @return Carrier
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Carrier addCarrier(CarrierForCreation body) throws RestClientException {
        return addCarrierWithHttpInfo(body).getBody();
    }

    /**
     * Add a new carrier as a CEP partner
     * 
     * <p><b>201</b> - The carrier was successfully created. The Location header contains the URL of the carrier.
     * <p><b>400</b> - Invalid input. See response for details
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * @param body Carrier object (required)
     * @return ResponseEntity&lt;Carrier&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Carrier> addCarrierWithHttpInfo(CarrierForCreation body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling addCarrier");
        }
        
        String path = apiClient.expandPath("/api/carriers", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<Carrier> returnType = new ParameterizedTypeReference<Carrier>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get a carrier with the given ID
     * 
     * <p><b>200</b> - Carrier was found &amp; you were allowed to access it. The result is in the body.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - User not found
     * @param carrierId ID of the carrier you want to get (required)
     * @return Carrier
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Carrier getCarrier(String carrierId) throws RestClientException {
        return getCarrierWithHttpInfo(carrierId).getBody();
    }

    /**
     * Get a carrier with the given ID
     * 
     * <p><b>200</b> - Carrier was found &amp; you were allowed to access it. The result is in the body.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - User not found
     * @param carrierId ID of the carrier you want to get (required)
     * @return ResponseEntity&lt;Carrier&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Carrier> getCarrierWithHttpInfo(String carrierId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'carrierId' is set
        if (carrierId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'carrierId' when calling getCarrier");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("carrierId", carrierId);
        String path = apiClient.expandPath("/api/carriers/{carrierId}", uriVariables);

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

        ParameterizedTypeReference<Carrier> returnType = new ParameterizedTypeReference<Carrier>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Patches a carrier with the given ID
     * 
     * <p><b>200</b> - Carrier was found &amp; patch-set has been applied. The patched entity is in the body.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Entity not found
     * <p><b>409</b> - Entity version conflict
     * @param carrierId ID of carrier you want to patch (required)
     * @param body Patch set (required)
     * @return Carrier
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Carrier patchCarrier(String carrierId, CarrierPatchActions body) throws RestClientException {
        return patchCarrierWithHttpInfo(carrierId, body).getBody();
    }

    /**
     * Patches a carrier with the given ID
     * 
     * <p><b>200</b> - Carrier was found &amp; patch-set has been applied. The patched entity is in the body.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Entity not found
     * <p><b>409</b> - Entity version conflict
     * @param carrierId ID of carrier you want to patch (required)
     * @param body Patch set (required)
     * @return ResponseEntity&lt;Carrier&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Carrier> patchCarrierWithHttpInfo(String carrierId, CarrierPatchActions body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'carrierId' is set
        if (carrierId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'carrierId' when calling patchCarrier");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchCarrier");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("carrierId", carrierId);
        String path = apiClient.expandPath("/api/carriers/{carrierId}", uriVariables);

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

        ParameterizedTypeReference<Carrier> returnType = new ParameterizedTypeReference<Carrier>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
