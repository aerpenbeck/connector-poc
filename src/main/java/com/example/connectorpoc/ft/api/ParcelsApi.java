package com.example.connectorpoc.ft.api;

import com.example.connectorpoc.ft.invoker.ApiClient;

import com.example.connectorpoc.ft.model.Parcel;
import com.example.connectorpoc.ft.model.ParcelForCreation;
import com.example.connectorpoc.ft.model.StrippedParcels;

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
@Component("com.example.connectorpoc.ft.api.ParcelsApi")
public class ParcelsApi {
    private ApiClient apiClient;

    public ParcelsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ParcelsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add a new parcel for being send via a CEP partner
     * 
     * <p><b>201</b> - The parcel was successfully created. The Location header contains the URL of the parcel.
     * <p><b>202</b> - Your request was correct and the platform took note of your intentions. The creation of the parcel involves some async processing and the result was not present directly after the request was made. The Location header contains the URL where you can get additional information about the parcel and its state.
     * <p><b>400</b> - Invalid input. See response for details
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * @param body Parcel object (required)
     * @return Parcel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Parcel addParcel(ParcelForCreation body) throws RestClientException {
        return addParcelWithHttpInfo(body).getBody();
    }

    /**
     * Add a new parcel for being send via a CEP partner
     * 
     * <p><b>201</b> - The parcel was successfully created. The Location header contains the URL of the parcel.
     * <p><b>202</b> - Your request was correct and the platform took note of your intentions. The creation of the parcel involves some async processing and the result was not present directly after the request was made. The Location header contains the URL where you can get additional information about the parcel and its state.
     * <p><b>400</b> - Invalid input. See response for details
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * @param body Parcel object (required)
     * @return ResponseEntity&lt;Parcel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Parcel> addParcelWithHttpInfo(ParcelForCreation body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling addParcel");
        }
        
        String path = apiClient.expandPath("/api/parcels", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<Parcel> returnType = new ParameterizedTypeReference<Parcel>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Return all parcels
     * 
     * <p><b>200</b> - Parcels are found.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * @param page requested page number (optional, default to 1)
     * @param size number of entities to show (optional, default to 25)
     * @return StrippedParcels
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StrippedParcels getAllParcels(Integer page, Integer size) throws RestClientException {
        return getAllParcelsWithHttpInfo(page, size).getBody();
    }

    /**
     * Return all parcels
     * 
     * <p><b>200</b> - Parcels are found.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * @param page requested page number (optional, default to 1)
     * @param size number of entities to show (optional, default to 25)
     * @return ResponseEntity&lt;StrippedParcels&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StrippedParcels> getAllParcelsWithHttpInfo(Integer page, Integer size) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/parcels", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<StrippedParcels> returnType = new ParameterizedTypeReference<StrippedParcels>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get a parcel with the given ID
     * 
     * <p><b>200</b> - Parcel was found &amp; you were allowed to access it. The result is in the body.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Entity not found
     * @param parcelId ID of the parcel you want to get (required)
     * @return Parcel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Parcel getParcel(String parcelId) throws RestClientException {
        return getParcelWithHttpInfo(parcelId).getBody();
    }

    /**
     * Get a parcel with the given ID
     * 
     * <p><b>200</b> - Parcel was found &amp; you were allowed to access it. The result is in the body.
     * <p><b>401</b> - Your user is not allowed to operate against this API instance
     * <p><b>403</b> - Your user, although recognized, is not authorized to use this endpoint
     * <p><b>404</b> - Entity not found
     * @param parcelId ID of the parcel you want to get (required)
     * @return ResponseEntity&lt;Parcel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Parcel> getParcelWithHttpInfo(String parcelId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'parcelId' is set
        if (parcelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'parcelId' when calling getParcel");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("parcelId", parcelId);
        String path = apiClient.expandPath("/api/parcels/{parcelId}", uriVariables);

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

        ParameterizedTypeReference<Parcel> returnType = new ParameterizedTypeReference<Parcel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
