package ch.axonivy.fintech.identificationdocument;

import java.io.File;

import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.api.InformationApi;
import com.klippa.ocrapi.api.ParsingApi;
import com.klippa.ocrapi.auth.ApiKeyAuth;
import com.klippa.ocrapi.model.APIIndexBody;
import com.klippa.ocrapi.model.IdentityDocumentBody;

public class KlippaRestClient {
	
	private static final String API_KEY = "XXXXX"; //hiding key to avoid abuse
	private static final String API_KEY_HEADER = "APIKeyHeader";
	private static final String KLIPPA_ENDPOINT = "https://custom-ocr.klippa.com/api/v1";

	public static void main(String[] args) {
		ApiClient defaultClient = buildApiClient();
		
		
		parsingID(defaultClient);
	    getApiInformation(defaultClient);
	}

	private static void parsingID(ApiClient defaultClient) {
		ParsingApi apiInstance = new ParsingApi(defaultClient);
	    File document = new File("D:\\passport_jennifer.jpg");
	    String template = "finform";
	    String pdfTextExtraction = "fast";
	    try {
	        IdentityDocumentBody result = apiInstance.parseDocumentIdentityDocument(document, "", template, pdfTextExtraction, "", "");
	        System.out.println(result);
	      } catch (ApiException e) {
	    	  handleError(e);
	      }
	}
	
	private static void getApiInformation(ApiClient defaultClient) {
		InformationApi apiInstance = new InformationApi(defaultClient);
	    try {
	      APIIndexBody result = apiInstance.getAPIIndex();
	      System.out.println(result);
	    } catch (ApiException e) {
	      handleError(e);
	    }
	}

	private static void handleError(ApiException e) {
		System.err.println("Exception when calling InformationApi#getAPIIndex");
	      System.err.println("Status code: " + e.getCode());
	      System.err.println("Reason: " + e.getResponseBody());
	      System.err.println("Response headers: " + e.getResponseHeaders());
	      e.printStackTrace();
	}

	private static ApiClient buildApiClient() {
		ApiClient defaultClient = Configuration.getDefaultApiClient();
		defaultClient.setBasePath(KLIPPA_ENDPOINT);
		
		ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication(API_KEY_HEADER);
		apiKeyHeader.setApiKey(API_KEY);
		return defaultClient;
	}
}
