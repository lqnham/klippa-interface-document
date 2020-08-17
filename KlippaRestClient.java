package ch.axonivy.fintech.identificationdocument;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import ch.axonivy.fintech.identificationdocument.klippa.FormDataParsingApi;

import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.api.InformationApi;
import com.klippa.ocrapi.api.ParsingApi;
import com.klippa.ocrapi.auth.ApiKeyAuth;
import com.klippa.ocrapi.model.APIIndexBody;
import com.klippa.ocrapi.model.IdentityDocument;
import com.klippa.ocrapi.model.IdentityDocumentBody;

public class KlippaRestClient {
	
	private static final String API_KEY = "xxxxx"; //hiding
	private static final String API_KEY_HEADER = "APIKeyHeader";
	private static final String KLIPPA_ENDPOINT = "https://custom-ocr.klippa.com/api/v1";
	private static final String EMPTY = "";
	
	public static void main(String[] args) {
		ApiClient defaultClient = buildApiClient();
		System.out.println("--------------1 files--------------");
		parsingIDOneFile(defaultClient);
		System.out.println("--------------2 files--------------");
		parsingIDMultipleFile(defaultClient);
	}

	/**
	 * Given files and get result data<br>
	 * @param defaultClient
	 */
	private static void parsingIDMultipleFile(ApiClient defaultClient) {
		FormDataParsingApi apiInstance = new FormDataParsingApi(defaultClient);
	    String template = "finform";
	    String pdfTextExtraction = "fast";
	   
	    try {
	    	IdentityDocumentBody result = apiInstance.parseDocumentIdentityDocument(extractedTwoPages(), EMPTY, template, pdfTextExtraction, EMPTY, EMPTY);
	    	IdentityDocument data = result.getData().getParsed();
	        System.out.println("Name: " +data.getGivenNames().getValue());
	        System.out.println("DOB: " +data.getDateOfBirth().getValue());
	        System.out.println("Gender: " +data.getGender().getValue());
	        System.out.println("DateOfIssue: " +data.getDateOfIssue().getValue());
	      } catch (ApiException e) {
	    	  handleError(e);
	      }
	}

	private static List<File> extractedTwoPages() {
		List<File> files =  new ArrayList<>();
		files.add(new File("D:\\compressed_mirco_front.jpg"));
		files.add(new File("D:\\compressed_mirco_back.jpg"));
		return files;
	}
	
	private static File extractedOnePage() {
		return new File("D:\\passport_jennifer.jpg");
	}
	
	/**
	 * Given file and get result data<br>
	 * Using file
	 * @param defaultClient
	 */
	private static void parsingIDOneFile(ApiClient defaultClient) {
		ParsingApi apiInstance = new ParsingApi(defaultClient);
	    File document = extractedOnePage();
	    String template = "finform";
	    String pdfTextExtraction = "fast";
	    try {
	        IdentityDocumentBody result = apiInstance.parseDocumentIdentityDocument(document, "", template, pdfTextExtraction, "", "");
	        IdentityDocument data = result.getData().getParsed();
	        System.out.println("Name: " +data.getGivenNames().getValue());
	        System.out.println("DOB: " +data.getDateOfBirth().getValue());
	        System.out.println("Gender: " +data.getGender().getValue());
	        System.out.println("DateOfIssue: " +data.getDateOfIssue().getValue());
	      } catch (ApiException e) {
	    	  handleError(e);
	      }
	}
	
	/**
	 * get API Information
	 * @param defaultClient
	 */
	private static void getApiInformation(ApiClient defaultClient) {
		InformationApi apiInstance = new InformationApi(defaultClient);
	    try {
	      APIIndexBody result = apiInstance.getAPIIndex();
	      System.out.println(result);
	    } catch (ApiException e) {
	      handleError(e);
	    }
	}
	
	/**
	 * Handle error
	 * @param e
	 */
	private static void handleError(ApiException e) {
		System.err.println("Exception when calling InformationApi#getAPIIndex");
	      System.err.println("Status code: " + e.getCode());
	      System.err.println("Reason: " + e.getResponseBody());
	      System.err.println("Response headers: " + e.getResponseHeaders());
	      e.printStackTrace();
	}

	/**
	 * Call API with endpoint and add api key to header
	 * @return
	 */
	private static ApiClient buildApiClient() {
		ApiClient defaultClient = Configuration.getDefaultApiClient();
		defaultClient.setBasePath(KLIPPA_ENDPOINT);
		
		ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication(API_KEY_HEADER);
		apiKeyHeader.setApiKey(API_KEY);
		return defaultClient;
	}
}
