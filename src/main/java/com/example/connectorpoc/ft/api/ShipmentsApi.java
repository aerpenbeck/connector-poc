package com.example.connectorpoc.ft.api;

import com.example.connectorpoc.ft.invoker.ApiClient;

import com.example.connectorpoc.ft.model.Shipment;
import com.example.connectorpoc.ft.model.ShipmentForCreation;
import com.example.connectorpoc.ft.model.ShipmentPatchActions;
import com.example.connectorpoc.ft.model.StrippedShipments;

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
@Component("com.example.connectorpoc.ft.api.ShipmentsApi")
public class ShipmentsApi {
    private ApiClient apiClient;

    public ShipmentsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ShipmentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add a new Shipment
     * 
     * <p><b>201</b> - The Shipment was successfully created. The Location header contains the URL of the Shipment.
     * <p><b>303</b> - The Shipment already exists. The Location header contains the URL of the Shipment.
     * <p><b>400</b> - Invalid input. See response for details
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * @param body Shipment object supplied by your picking app (required)
     * @return Shipment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Shipment addShipment(ShipmentForCreation body) throws RestClientException {
        return addShipmentWithHttpInfo(body).getBody();
    }

    /**
     * Add a new Shipment
     * 
     * <p><b>201</b> - The Shipment was successfully created. The Location header contains the URL of the Shipment.
     * <p><b>303</b> - The Shipment already exists. The Location header contains the URL of the Shipment.
     * <p><b>400</b> - Invalid input. See response for details
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * @param body Shipment object supplied by your picking app (required)
     * @return ResponseEntity&lt;Shipment&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Shipment> addShipmentWithHttpInfo(ShipmentForCreation body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling addShipment");
        }
        
        String path = apiClient.expandPath("/api/shipments", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<Shipment> returnType = new ParameterizedTypeReference<Shipment>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Return all shipments
     * 
     * <p><b>200</b> - Shipments are found.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * @param page requested page number (optional, default to 1)
     * @param size number of entities to show (optional, default to 25)
     * @param pickJobRef This query can be used to find shipments for a referenced pickjob (optional)
     * @return StrippedShipments
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StrippedShipments getAllShipments(Integer page, Integer size, String pickJobRef) throws RestClientException {
        return getAllShipmentsWithHttpInfo(page, size, pickJobRef).getBody();
    }

    /**
     * Return all shipments
     * 
     * <p><b>200</b> - Shipments are found.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * @param page requested page number (optional, default to 1)
     * @param size number of entities to show (optional, default to 25)
     * @param pickJobRef This query can be used to find shipments for a referenced pickjob (optional)
     * @return ResponseEntity&lt;StrippedShipments&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StrippedShipments> getAllShipmentsWithHttpInfo(Integer page, Integer size, String pickJobRef) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/shipments", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pickJobRef", pickJobRef));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "firebase" };

        ParameterizedTypeReference<StrippedShipments> returnType = new ParameterizedTypeReference<StrippedShipments>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get a Shipment with the given ID
     * 
     * <p><b>200</b> - Shipment was found &amp; you were allowed to access it. The result is in the body.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Shipment not found
     * @param shipmentId ID of Shipment you want to get (required)
     * @return Shipment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Shipment getShipment(String shipmentId) throws RestClientException {
        return getShipmentWithHttpInfo(shipmentId).getBody();
    }

    /**
     * Get a Shipment with the given ID
     * 
     * <p><b>200</b> - Shipment was found &amp; you were allowed to access it. The result is in the body.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Shipment not found
     * @param shipmentId ID of Shipment you want to get (required)
     * @return ResponseEntity&lt;Shipment&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Shipment> getShipmentWithHttpInfo(String shipmentId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shipmentId' when calling getShipment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("shipmentId", shipmentId);
        String path = apiClient.expandPath("/api/shipments/{shipmentId}", uriVariables);

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

        ParameterizedTypeReference<Shipment> returnType = new ParameterizedTypeReference<Shipment>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Patches a shipment with the given ID
     * 
     * <p><b>200</b> - Shipment was found &amp; patch-set has been applied. The patched entity is in the body.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Entity not found
     * <p><b>409</b> - Entity version conflict
     * @param shipmentId ID of shipment you want to patch (required)
     * @param body Patch set (required)
     * @return Shipment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Shipment patchShipment(String shipmentId, ShipmentPatchActions body) throws RestClientException {
        return patchShipmentWithHttpInfo(shipmentId, body).getBody();
    }

    /**
     * Patches a shipment with the given ID
     * 
     * <p><b>200</b> - Shipment was found &amp; patch-set has been applied. The patched entity is in the body.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Entity not found
     * <p><b>409</b> - Entity version conflict
     * @param shipmentId ID of shipment you want to patch (required)
     * @param body Patch set (required)
     * @return ResponseEntity&lt;Shipment&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Shipment> patchShipmentWithHttpInfo(String shipmentId, ShipmentPatchActions body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shipmentId' when calling patchShipment");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchShipment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("shipmentId", shipmentId);
        String path = apiClient.expandPath("/api/shipments/{shipmentId}", uriVariables);

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

        ParameterizedTypeReference<Shipment> returnType = new ParameterizedTypeReference<Shipment>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
