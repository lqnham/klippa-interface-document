package ch.axonivy.fintech.identificationdocument.klippa;

import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import okhttp3.Call;
import ch.axonivy.fintech.identificationdocument.CustomizeParsingApi;

import com.google.gson.reflect.TypeToken;
import com.klippa.ocrapi.ApiCallback;
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.ApiResponse;
import com.klippa.ocrapi.model.IdentityDocumentBody;
/**
 * This class help call API and send body with multipart/form-data 
 *
 */
public class FormDataParsingApi extends CustomizeParsingApi {

	public FormDataParsingApi() {
		super();
	}
	
	public FormDataParsingApi(ApiClient apiClient) {
		this.localVarApiClient = apiClient;
	}

	public IdentityDocumentBody parseDocumentIdentityDocument(List<File> document, String url, String template, String pdfTextExtraction, String userData, String userDataSetExternalId) throws ApiException {
		ApiResponse<IdentityDocumentBody> localVarResp = parseDocumentIdentityDocumentWithHttpInfo(document, url, template, pdfTextExtraction, userData, userDataSetExternalId);
		return localVarResp.getData();
	}

	public ApiResponse<IdentityDocumentBody> parseDocumentIdentityDocumentWithHttpInfo(List<File> document, String url, String template, String pdfTextExtraction, String userData, String userDataSetExternalId) throws ApiException {
		okhttp3.Call localVarCall = parseDocumentIdentityDocumentValidateBeforeCall(document, url, template, pdfTextExtraction, userData, userDataSetExternalId, null);
		Type localVarReturnType = new TypeToken<IdentityDocumentBody>() {}.getType();
		return localVarApiClient.execute(localVarCall, localVarReturnType);
	}

	@SuppressWarnings("rawtypes")
	private okhttp3.Call parseDocumentIdentityDocumentValidateBeforeCall(List<File> document, String url, String template, String pdfTextExtraction, String userData, String userDataSetExternalId, final ApiCallback _callback) throws ApiException {
		return parseDocumentIdentityDocumentCall(document, url, template, pdfTextExtraction, userData, userDataSetExternalId, _callback);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Call parseDocumentIdentityDocumentCall(List<File> document, String url, String template, String pdfTextExtraction, String userData, String userDataSetExternalId, ApiCallback _callback) throws ApiException {
		Object localVarPostBody = null;
		String localVarPath = PATH;
		ArrayList localVarQueryParams = new ArrayList();
		ArrayList localVarCollectionQueryParams = new ArrayList();
		HashMap localVarHeaderParams = new HashMap();
		HashMap localVarCookieParams = new HashMap();
		HashMap localVarFormParams = new HashMap();
		if (document != null) {
			for (File file : document) {
				localVarFormParams.put(KEY_DOCUMENT, file);
			}
		}

		if (url != null) {
			localVarFormParams.put(KEY_URL, url);
		}

		if (template != null) {
			localVarFormParams.put(KEY_TEMPLATE, template);
		}

		if (pdfTextExtraction != null) {
			localVarFormParams.put(KEY_PDF_TEXT_EXTRACTION, pdfTextExtraction);
		}

		if (userData != null) {
			localVarFormParams.put(KEY_USER_DATA, userData);
		}

		if (userDataSetExternalId != null) {
			localVarFormParams.put(KEY_USER_DATA_SET_EXTERNAL_ID,
					userDataSetExternalId);
		}

		String[] localVarAccepts = new String[] { APPLICATION_JSON };
		String localVarAccept = this.localVarApiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null) {
			localVarHeaderParams.put(ACCEPT, localVarAccept);
		}

		String[] localVarContentTypes = new String[] { MULTIPART_FORM_DATA };
		String localVarContentType = this.localVarApiClient
				.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put(CONTENT_TYPE, localVarContentType);
		
		String[] localVarAuthNames = new String[] { API_KEY_HEADER, API_KEY_QUERY_PARAM, API_PUBLIC_KEY_HEADER, API_PUBLIC_KEY_QUERY_PARAM };
		return this.localVarApiClient.buildCall(localVarPath, "POST",
				localVarQueryParams, localVarCollectionQueryParams,
				localVarPostBody, localVarHeaderParams, localVarCookieParams,
				localVarFormParams, localVarAuthNames, _callback);
	}
}
