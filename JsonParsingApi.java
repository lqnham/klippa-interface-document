package ch.axonivy.fintech.identificationdocument.klippa;

import ch.axonivy.fintech.identificationdocument.CustomizeParsingApi;

import com.klippa.ocrapi.ApiClient;
/**
 * This class help call API and send body with Json type
 *
 */
public class JsonParsingApi extends CustomizeParsingApi{
	public JsonParsingApi() {
		super();
	}
	
	public JsonParsingApi(ApiClient apiClient) {
		this.localVarApiClient = apiClient;
	}
	
}
