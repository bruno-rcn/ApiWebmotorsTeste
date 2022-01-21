package core;

import io.restassured.http.ContentType;

public interface Constants {

	String APP_BASE_URL = "https://desafioonline.webmotors.com.br/api/OnlineChallenge";
	Integer APP_PORT = 443;
	
	ContentType APP_CONTENT_TYPE = ContentType.JSON;
	
	Long MAX_TIMEOUT = 5000L;
}
