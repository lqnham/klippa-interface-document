package ch.axonivy.fintech.identificationdocument;

import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.Configuration;

public class CustomizeParsingApi {
	protected static final String PATH = "/parseDocument/identity_document";
	protected static final String ACCEPT = "Accept";
	protected static final String APPLICATION_JSON = "application/json";
	protected static final String CONTENT_TYPE = "Content-Type";
	protected static final String MULTIPART_FORM_DATA = "multipart/form-data";
	protected static final String API_PUBLIC_KEY_QUERY_PARAM = "APIPublicKeyQueryParam";
	protected static final String API_PUBLIC_KEY_HEADER = "APIPublicKeyHeader";
	protected static final String API_KEY_QUERY_PARAM = "APIKeyQueryParam";
	protected static final String API_KEY_HEADER = "APIKeyHeader";
	protected static final String KEY_USER_DATA_SET_EXTERNAL_ID = "user_data_set_external_id";
	protected static final String KEY_USER_DATA = "user_data";
	protected static final String KEY_PDF_TEXT_EXTRACTION = "pdf_text_extraction";
	protected static final String KEY_TEMPLATE = "template";
	protected static final String KEY_URL = "url";
	protected static final String KEY_DOCUMENT = "document";
	protected ApiClient localVarApiClient;

	public CustomizeParsingApi() {
		this(Configuration.getDefaultApiClient());
	}

	public CustomizeParsingApi(ApiClient apiClient) {
		this.localVarApiClient = apiClient;
	}
	
	public ApiClient getApiClient() {
		return this.localVarApiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.localVarApiClient = apiClient;
	}
}
