package com.example.connectorpoc.ft.api;

import com.example.connectorpoc.ft.invoker.ApiClient;

import com.example.connectorpoc.ft.model.Listing;
import com.example.connectorpoc.ft.model.ListingPatchActions;
import com.example.connectorpoc.ft.model.ListingsForCreation;
import com.example.connectorpoc.ft.model.StrippedListings;

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
@Component("com.example.connectorpoc.ft.api.ListingsApi")
public class ListingsApi {
    private ApiClient apiClient;

    public ListingsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ListingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * deletes a listing with the given ID of a facility with the given ID
     * 
     * <p><b>200</b> - Facility listing was found and successfully deleted
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Facility listing not found
     * @param facilityId ID of facility you want to delete a listing of (required)
     * @param tenantArticleId tenant ID of the articles listing you want to delete (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteFacilityListing(String facilityId, String tenantArticleId) throws RestClientException {
        deleteFacilityListingWithHttpInfo(facilityId, tenantArticleId);
    }

    /**
     * deletes a listing with the given ID of a facility with the given ID
     * 
     * <p><b>200</b> - Facility listing was found and successfully deleted
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Facility listing not found
     * @param facilityId ID of facility you want to delete a listing of (required)
     * @param tenantArticleId tenant ID of the articles listing you want to delete (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteFacilityListingWithHttpInfo(String facilityId, String tenantArticleId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'facilityId' is set
        if (facilityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'facilityId' when calling deleteFacilityListing");
        }
        
        // verify the required parameter 'tenantArticleId' is set
        if (tenantArticleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantArticleId' when calling deleteFacilityListing");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("facilityId", facilityId);
        uriVariables.put("tenantArticleId", tenantArticleId);
        String path = apiClient.expandPath("/api/facilities/{facilityId}/listings/{tenantArticleId}", uriVariables);

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

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get a facility with the given ID
     * 
     * <p><b>200</b> - Facility was found &amp; you were allowed to access it. The result is in the body.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Facility not found
     * @param facilityId ID of facility you want to get listing (required)
     * @param page requested page number (optional, default to 1)
     * @param size number of facilities to show (optional, default to 25)
     * @return List&lt;StrippedListings&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<StrippedListings> getFacilityListing(String facilityId, Integer page, Integer size) throws RestClientException {
        return getFacilityListingWithHttpInfo(facilityId, page, size).getBody();
    }

    /**
     * Get a facility with the given ID
     * 
     * <p><b>200</b> - Facility was found &amp; you were allowed to access it. The result is in the body.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Facility not found
     * @param facilityId ID of facility you want to get listing (required)
     * @param page requested page number (optional, default to 1)
     * @param size number of facilities to show (optional, default to 25)
     * @return ResponseEntity&lt;List&lt;StrippedListings&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<StrippedListings>> getFacilityListingWithHttpInfo(String facilityId, Integer page, Integer size) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'facilityId' is set
        if (facilityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'facilityId' when calling getFacilityListing");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("facilityId", facilityId);
        String path = apiClient.expandPath("/api/facilities/{facilityId}/listings", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "firebase" };

        ParameterizedTypeReference<List<StrippedListings>> returnType = new ParameterizedTypeReference<List<StrippedListings>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get a Listings with the given ID
     * 
     * <p><b>200</b> - Listing is found &amp; you were allowed to access it. The result is in the body.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Listings not found
     * @param facilityId ID of facility you want to get listing (required)
     * @param tenantArticleId tenantArticleId of listing you want to get (required)
     * @return Listing
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Listing getListing(String facilityId, String tenantArticleId) throws RestClientException {
        return getListingWithHttpInfo(facilityId, tenantArticleId).getBody();
    }

    /**
     * Get a Listings with the given ID
     * 
     * <p><b>200</b> - Listing is found &amp; you were allowed to access it. The result is in the body.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Listings not found
     * @param facilityId ID of facility you want to get listing (required)
     * @param tenantArticleId tenantArticleId of listing you want to get (required)
     * @return ResponseEntity&lt;Listing&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Listing> getListingWithHttpInfo(String facilityId, String tenantArticleId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'facilityId' is set
        if (facilityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'facilityId' when calling getListing");
        }
        
        // verify the required parameter 'tenantArticleId' is set
        if (tenantArticleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantArticleId' when calling getListing");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("facilityId", facilityId);
        uriVariables.put("tenantArticleId", tenantArticleId);
        String path = apiClient.expandPath("/api/facilities/{facilityId}/listings/{tenantArticleId}", uriVariables);

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

        ParameterizedTypeReference<Listing> returnType = new ParameterizedTypeReference<Listing>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Update a listing with the given ID of a facility with the given ID
     * 
     * <p><b>200</b> - Facility listing was found and successfully patched
     * <p><b>400</b> - Invalid input. See response for details
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Facility listing not found
     * <p><b>409</b> - Listing version conflict
     * @param facilityId ID of facility you want to patch a listing of (required)
     * @param tenantArticleId tenant ID of the articles listing you want to patch (required)
     * @param body listings for put (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void patchFacilityListing(String facilityId, String tenantArticleId, ListingPatchActions body) throws RestClientException {
        patchFacilityListingWithHttpInfo(facilityId, tenantArticleId, body);
    }

    /**
     * Update a listing with the given ID of a facility with the given ID
     * 
     * <p><b>200</b> - Facility listing was found and successfully patched
     * <p><b>400</b> - Invalid input. See response for details
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Facility listing not found
     * <p><b>409</b> - Listing version conflict
     * @param facilityId ID of facility you want to patch a listing of (required)
     * @param tenantArticleId tenant ID of the articles listing you want to patch (required)
     * @param body listings for put (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> patchFacilityListingWithHttpInfo(String facilityId, String tenantArticleId, ListingPatchActions body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'facilityId' is set
        if (facilityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'facilityId' when calling patchFacilityListing");
        }
        
        // verify the required parameter 'tenantArticleId' is set
        if (tenantArticleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantArticleId' when calling patchFacilityListing");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchFacilityListing");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("facilityId", facilityId);
        uriVariables.put("tenantArticleId", tenantArticleId);
        String path = apiClient.expandPath("/api/facilities/{facilityId}/listings/{tenantArticleId}", uriVariables);

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

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Update listings of a facility with the given ID
     * 
     * <p><b>200</b> - Facility listing was found &amp; you were allowed to access it.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Facility listing not found
     * @param facilityId ID of facility you want to get its listing (required)
     * @param body listings for put (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void putFacilityListing(String facilityId, ListingsForCreation body) throws RestClientException {
        putFacilityListingWithHttpInfo(facilityId, body);
    }

    /**
     * Update listings of a facility with the given ID
     * 
     * <p><b>200</b> - Facility listing was found &amp; you were allowed to access it.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Facility listing not found
     * @param facilityId ID of facility you want to get its listing (required)
     * @param body listings for put (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> putFacilityListingWithHttpInfo(String facilityId, ListingsForCreation body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'facilityId' is set
        if (facilityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'facilityId' when calling putFacilityListing");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling putFacilityListing");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("facilityId", facilityId);
        String path = apiClient.expandPath("/api/facilities/{facilityId}/listings", uriVariables);

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

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
