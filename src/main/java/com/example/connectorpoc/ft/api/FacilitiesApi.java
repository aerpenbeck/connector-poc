package com.example.connectorpoc.ft.api;

import com.example.connectorpoc.ft.invoker.ApiClient;

import com.example.connectorpoc.ft.model.Facility;
import com.example.connectorpoc.ft.model.FacilityCarrierConnection;
import com.example.connectorpoc.ft.model.FacilityForCreation;
import com.example.connectorpoc.ft.model.FacilityPatchActions;
import java.time.OffsetDateTime;
import com.example.connectorpoc.ft.model.StrippedFacilities;

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
@Component("com.example.connectorpoc.ft.api.FacilitiesApi")
public class FacilitiesApi {
    private ApiClient apiClient;

    public FacilitiesApi() {
        this(new ApiClient());
    }

    @Autowired
    public FacilitiesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add a new facility
     * 
     * <p><b>201</b> - The facility was successfully created. The Location header contains the URL of the facility.
     * <p><b>400</b> - Invalid input. See response for details
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * @param body Representation that describes the facility (required)
     * @return Facility
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Facility addFacility(FacilityForCreation body) throws RestClientException {
        return addFacilityWithHttpInfo(body).getBody();
    }

    /**
     * Add a new facility
     * 
     * <p><b>201</b> - The facility was successfully created. The Location header contains the URL of the facility.
     * <p><b>400</b> - Invalid input. See response for details
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * @param body Representation that describes the facility (required)
     * @return ResponseEntity&lt;Facility&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Facility> addFacilityWithHttpInfo(FacilityForCreation body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling addFacility");
        }
        
        String path = apiClient.expandPath("/api/facilities", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<Facility> returnType = new ParameterizedTypeReference<Facility>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Connect an (existing) CEP with individual Cutoff-Times to the facility
     * 
     * <p><b>404</b> - This endpoint is not implemented yet.
     * <p><b>501</b> - This endpoint is not implemented yet.
     * @param facilityId ID of facility you want to get (required)
     * @param carrierRef ID of facility you want to get (required)
     * @param body Representation that describes the facility (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void connectCepToFacility(String facilityId, String carrierRef, FacilityCarrierConnection body) throws RestClientException {
        connectCepToFacilityWithHttpInfo(facilityId, carrierRef, body);
    }

    /**
     * Connect an (existing) CEP with individual Cutoff-Times to the facility
     * 
     * <p><b>404</b> - This endpoint is not implemented yet.
     * <p><b>501</b> - This endpoint is not implemented yet.
     * @param facilityId ID of facility you want to get (required)
     * @param carrierRef ID of facility you want to get (required)
     * @param body Representation that describes the facility (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> connectCepToFacilityWithHttpInfo(String facilityId, String carrierRef, FacilityCarrierConnection body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'facilityId' is set
        if (facilityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'facilityId' when calling connectCepToFacility");
        }
        
        // verify the required parameter 'carrierRef' is set
        if (carrierRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'carrierRef' when calling connectCepToFacility");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling connectCepToFacility");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("facilityId", facilityId);
        uriVariables.put("carrierRef", carrierRef);
        String path = apiClient.expandPath("/api/facilities/{facilityId}/carriers/{carrierRef}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "firebase" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * deletes a facility with the given ID
     * 
     * <p><b>200</b> - Facility was found &amp; you were allowed to delete it.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Facility not found
     * @param facilityId ID of facility you want to delete (required)
     * @param forceDeletion cascading deletion without pre condition check (optional, default to false)
     * @return Facility
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Facility deleteFacility(String facilityId, Boolean forceDeletion) throws RestClientException {
        return deleteFacilityWithHttpInfo(facilityId, forceDeletion).getBody();
    }

    /**
     * deletes a facility with the given ID
     * 
     * <p><b>200</b> - Facility was found &amp; you were allowed to delete it.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Facility not found
     * @param facilityId ID of facility you want to delete (required)
     * @param forceDeletion cascading deletion without pre condition check (optional, default to false)
     * @return ResponseEntity&lt;Facility&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Facility> deleteFacilityWithHttpInfo(String facilityId, Boolean forceDeletion) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'facilityId' is set
        if (facilityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'facilityId' when calling deleteFacility");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("facilityId", facilityId);
        String path = apiClient.expandPath("/api/facilities/{facilityId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "forceDeletion", forceDeletion));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "firebase" };

        ParameterizedTypeReference<Facility> returnType = new ParameterizedTypeReference<Facility>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Return all facilities
     * 
     * <p><b>200</b> - Facilities are found.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * @param page requested page number (optional, default to 1)
     * @param size number of facilities to show (optional, default to 25)
     * @param tenantFacilityId query facilities with the given tenantFacilityId (optional)
     * @return StrippedFacilities
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StrippedFacilities getAllFacilities(Integer page, Integer size, String tenantFacilityId) throws RestClientException {
        return getAllFacilitiesWithHttpInfo(page, size, tenantFacilityId).getBody();
    }

    /**
     * Return all facilities
     * 
     * <p><b>200</b> - Facilities are found.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * @param page requested page number (optional, default to 1)
     * @param size number of facilities to show (optional, default to 25)
     * @param tenantFacilityId query facilities with the given tenantFacilityId (optional)
     * @return ResponseEntity&lt;StrippedFacilities&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StrippedFacilities> getAllFacilitiesWithHttpInfo(Integer page, Integer size, String tenantFacilityId) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/facilities", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tenantFacilityId", tenantFacilityId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "firebase" };

        ParameterizedTypeReference<StrippedFacilities> returnType = new ParameterizedTypeReference<StrippedFacilities>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get a facility with the given ID
     * 
     * <p><b>200</b> - Facility was found &amp; you were allowed to access it. The result is in the body.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Facility not found
     * @param facilityId ID of facility you want to get (required)
     * @return Facility
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Facility getFacility(String facilityId) throws RestClientException {
        return getFacilityWithHttpInfo(facilityId).getBody();
    }

    /**
     * Get a facility with the given ID
     * 
     * <p><b>200</b> - Facility was found &amp; you were allowed to access it. The result is in the body.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Facility not found
     * @param facilityId ID of facility you want to get (required)
     * @return ResponseEntity&lt;Facility&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Facility> getFacilityWithHttpInfo(String facilityId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'facilityId' is set
        if (facilityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'facilityId' when calling getFacility");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("facilityId", facilityId);
        String path = apiClient.expandPath("/api/facilities/{facilityId}", uriVariables);

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

        ParameterizedTypeReference<Facility> returnType = new ParameterizedTypeReference<Facility>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get the available CEPs for a facility
     * 
     * <p><b>404</b> - This endpoint is not implemented yet.
     * <p><b>501</b> - This endpoint is not implemented yet.
     * @param facilityId ID of facility you want to get (required)
     * @param targetPostalcode Postalcode of the consumer address.  (required)
     * @param targetTime At which time is the parcel ready to be shipped? The answer to this question has direct impact to the list of available KEPs and their respective service levels. Default: Time of the request (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getFacilityCeps(String facilityId, String targetPostalcode, OffsetDateTime targetTime) throws RestClientException {
        getFacilityCepsWithHttpInfo(facilityId, targetPostalcode, targetTime);
    }

    /**
     * Get the available CEPs for a facility
     * 
     * <p><b>404</b> - This endpoint is not implemented yet.
     * <p><b>501</b> - This endpoint is not implemented yet.
     * @param facilityId ID of facility you want to get (required)
     * @param targetPostalcode Postalcode of the consumer address.  (required)
     * @param targetTime At which time is the parcel ready to be shipped? The answer to this question has direct impact to the list of available KEPs and their respective service levels. Default: Time of the request (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getFacilityCepsWithHttpInfo(String facilityId, String targetPostalcode, OffsetDateTime targetTime) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'facilityId' is set
        if (facilityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'facilityId' when calling getFacilityCeps");
        }
        
        // verify the required parameter 'targetPostalcode' is set
        if (targetPostalcode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetPostalcode' when calling getFacilityCeps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("facilityId", facilityId);
        String path = apiClient.expandPath("/api/facilities/{facilityId}/carriers", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "targetTime", targetTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "targetPostalcode", targetPostalcode));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "firebase" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Patches a facility with the given ID
     * 
     * <p><b>200</b> - Facility was found &amp; patch-set has been applied. The patched facility is in the body.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Facility not found
     * <p><b>409</b> - Facility version conflict
     * @param facilityId ID of facility you want to patch (required)
     * @param body Patch set (required)
     * @return Facility
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Facility patchFacility(String facilityId, FacilityPatchActions body) throws RestClientException {
        return patchFacilityWithHttpInfo(facilityId, body).getBody();
    }

    /**
     * Patches a facility with the given ID
     * 
     * <p><b>200</b> - Facility was found &amp; patch-set has been applied. The patched facility is in the body.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Facility not found
     * <p><b>409</b> - Facility version conflict
     * @param facilityId ID of facility you want to patch (required)
     * @param body Patch set (required)
     * @return ResponseEntity&lt;Facility&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Facility> patchFacilityWithHttpInfo(String facilityId, FacilityPatchActions body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'facilityId' is set
        if (facilityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'facilityId' when calling patchFacility");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchFacility");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("facilityId", facilityId);
        String path = apiClient.expandPath("/api/facilities/{facilityId}", uriVariables);

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

        ParameterizedTypeReference<Facility> returnType = new ParameterizedTypeReference<Facility>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
