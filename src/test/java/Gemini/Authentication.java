package Gemini;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Authentication {
	
	@Test
	public void testMe() {
		 
		/*
		 * //Query to get list of stories without tasks String Payloadbody = "{\r\n" +
		 * "    \"from\": \"Story\",\r\n" + "    \"select\": [\r\n" +
		 * "        \"Team.Name\",\r\n" + "        \"Number\",\r\n" +
		 * "        \"Name\",\r\n" + "        \"Status.Name\",\r\n" +
		 * "        \"Custom_CapitalizationCategory.Name\",\r\n" +
		 * "        \"Children.Number\",\r\n" + "        \"Children.Name\",\r\n" +
		 * "        \"Super.Number\",\r\n" + "        \"Super.Name\"\r\n" + "    ],\r\n"
		 * + "    \"where\": {\r\n" +
		 * "        \"Scope.Name\": \"APAC-OpSol-Gemini CY23-3\",\r\n" +
		 * "        \"Team.Name\": \""+teamName+"\"\r\n" + "    },\r\n" +
		 * "  \"filter\": [\r\n" + "    \"Children.Number.@Count<'1'\"\r\n" + "  ]\r\n"
		 * + "  ,\r\n" + "  \"sort\": [\r\n" + "    \"+Super.Number\"\r\n" + "  ]\r\n" +
		 * "}";
		 */
		 //RestAssured.port = 8888;
		//	System.setProperty("https.proxyHost", "http://proxy-asia.network.fedex.com/");
		 //   System.setProperty("https.proxyPort", "8080");
		 //Make JSON call
	     Response r = RestAssured.given()//.auth().basic("0oarrgqc2qXAymwpi0h7", "AbPIjtzFzAq20I3lWpHIY3ZOIv06v23tN9tRaaQ1")
	    		// .auth().oauth2("1.TRXj5lyraPsVpCZHgGsf1mkeTkA=")
	    		 .relaxedHTTPSValidation()
	    		// .proxy("127.0.0.1")
	    		 //.contentType("text/plain")
	    		 .proxy("http://internet.proxy.fedex.com/")
	    		// .contentType(ContentType.TEXT)
	    		// .proxy("http://proxy-asia.network.fedex.com/")
	    		 //.header("Connection","keep-alive")
	    		 .header("cache-control","no-cache")
	    		 .header("Content-Type","application/x-www-form-urlencoded")
	    		 .header("Authorization","Basic MG9hcnJncWMycVhBeW13cGkwaDc6QWJQSWp0ekZ6QXEyMEkzbFdwSElZM1pPSXYwNnYyM3ROOXRSYWFRMQ==")
	    		 .header("Cookie","JSESSIONID=DC9BFAAC10890B6184B51FF7A07C83EE")
	    		 .contentType("application/x-www-form-urlencoded; charset=utf-8")
	    		  .formParam("grant_type", "client_credentials")
	    		  .formParam("scope", "Custom_Scope")
	    		  
	    		 //.header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36")
	    		
	             	.when()
	             .post("https://purpleid-stage.oktapreview.com/oauth2/default/v1/token")
	             	.then()
	             .extract().response();
	     
		
		
		System.err.println(r.getBody().asString());
		System.out.println(r.asString());
		System.out.println("sdaf");
	}
	
	public void testme2() {
		
	}

}
