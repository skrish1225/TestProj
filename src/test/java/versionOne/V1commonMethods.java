package versionOne;



import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class V1commonMethods {

	 public static final String URL = "https://www19.v1host.com/FedEx/query.v1";
	
	@Test
	 public void testMe() throws EncryptedDocumentException, IOException {
		System.out.println("run please ");
		
		GetListOfStoriesWithoutTasks("FXE - OpSol - Megatron","");
		
		
	 }
	 
	
	 
	 
	
	
	 /**
	  * Get List of stories that does not have a task
	 * @param teamName
	 * @param sprintName
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static void GetListOfStoriesWithoutTasks(String teamName,String sprintName) throws EncryptedDocumentException, IOException {
		 String path = "C:\\Users\\4984356\\Desktop\\IN PROGRESS\\V1_Tracking\\Playground\\xecutionResults.xlsx";	
		 
		 //Query to get list of stories without tasks
		 String Payloadbody = "{\r\n"
		 		+ "    \"from\": \"Story\",\r\n"
		 		+ "    \"select\": [\r\n"
		 		+ "        \"Team.Name\",\r\n"
		 		+ "        \"Number\",\r\n"
		 		+ "        \"Name\",\r\n"
		 		+ "        \"Status.Name\",\r\n"
		 		+ "        \"Custom_CapitalizationCategory.Name\",\r\n"
		 		+ "        \"Children.Number\",\r\n"
		 		+ "        \"Children.Name\",\r\n"
		 		+ "        \"Super.Number\",\r\n"
		 		+ "        \"Super.Name\"\r\n"
		 		+ "    ],\r\n"
		 		+ "    \"where\": {\r\n"
		 		+ "        \"Scope.Name\": \"APAC-OpSol-Gemini CY23-3\",\r\n"
		 		+ "        \"Team.Name\": \""+teamName+"\"\r\n"
		 		+ "    },\r\n"
		 		+ "  \"filter\": [\r\n"
		 		+ "    \"Children.Number.@Count<'1'\"\r\n"
		 		+ "  ]\r\n"
		 		+ "  ,\r\n"
		 		+ "  \"sort\": [\r\n"
		 		+ "    \"+Super.Number\"\r\n"
		 		+ "  ]\r\n"
		 		+ "}";
		 
		 RestAssured.port = 8888;
		
		 //Make JSON call
	     Response r = RestAssured.given()
	    		 .auth().oauth2("1.TRXj5lyraPsVpCZHgGsf1mkeTkA=")
	    		 .relaxedHTTPSValidation()
	    		 .proxy("127.0.0.1")
	    		 //.contentType("text/plain")
	    		// .proxy("http://internet.proxy.fedex.com/")
	    		// .contentType(ContentType.TEXT)
	    		// .proxy("http://proxy-asia.network.fedex.com/")
	    		 //.header("Connection","keep-alive")
	    		 .header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36")
	    		 .and()
	    		 .body(Payloadbody)
	             	.when()
	             .post("https://www19.v1host.com/FedEx/query.v1")
	             	.then()
	             .extract().response();
	     
	     
	    //Parse through the response & get value
	    DataRecorderExcel.excelGetListOfStoriesWithoutTasks(r.asString(),path);
	    
	 
	    
	 }
	 
	

	
	 /**
	  * Get List of stories that does not have a testing task
	 * @param teamName
	 * @param sprintName
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static void GetListOfStoriesWithoutTestingTasks(String teamName,String sprintName) throws EncryptedDocumentException, IOException {
		 String path = "C:\\Users\\4984356\\Desktop\\IN PROGRESS\\V1_Tracking\\Playground\\xecutionResults.xlsx";	
		 
		 //Query to get list of stories without tasks
		 String Payloadbody = "{\r\n"
		 		+ "    \"from\": \"Story\",\r\n"
		 		+ "    \"select\": [\r\n"
		 		+ "        \"Team.Name\",\r\n"
		 		+ "        \"Number\",\r\n"
		 		+ "        \"Name\",\r\n"
		 		+ "        \"Status.Name\",\r\n"
		 		+ "        \"Custom_CapitalizationCategory.Name\",\r\n"
		 		+ "        \"Children.Number\",\r\n"
		 		+ "        \"Children.Name\",\r\n"
		 		+ "        \"Super.Number\",\r\n"
		 		+ "        \"Super.Name\"\r\n"
		 		+ "    ],\r\n"
		 		+ "    \"where\": {\r\n"
		 		+ "        \"Scope.Name\": \"APAC-OpSol-Gemini CY23-3\",\r\n"
		 		+ "        \"Team.Name\": \"FXE - OpSol - Megatron\"\r\n"
		 		+ "    },\r\n"
		 		+ "  \"filter\": [\r\n"
		 		+ "    \"Children.Number.@Count>'0'\"\r\n"
		 		+ "  ]\r\n"
		 		+ "  ,\r\n"
		 		+ "  \"sort\": [\r\n"
		 		+ "    \"+Super.Number\"\r\n"
		 		+ "  ]\r\n"
		 		+ "}";
		 
		 RestAssured.port = 8888;
		
		 //Make JSON call
	     Response r = RestAssured.given()
	    		 .auth().oauth2("1.TRXj5lyraPsVpCZHgGsf1mkeTkA=")
	    		 .relaxedHTTPSValidation()
	    		 .proxy("127.0.0.1")
	    		 //.contentType("text/plain")
	    		// .proxy("http://internet.proxy.fedex.com/")
	    		// .contentType(ContentType.TEXT)
	    		// .proxy("http://proxy-asia.network.fedex.com/")
	    		 //.header("Connection","keep-alive")
	    		 .header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36")
	    		 .and()
	    		 .body(Payloadbody)
	             	.when()
	             .post("https://www19.v1host.com/FedEx/query.v1")
	             	.then()
	             .extract().response();
	     
	     
	    //Parse through the response & get value
	    DataRecorderExcel.excelGetListOfStoriesWithoutTestingTasks(r.asString(),path);
	    
	 
	    
	 } 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	 public static void boardAPI() {
		 RestAssured.baseURI ="https://www.boredapi.com/api";
		 Response r = RestAssured.given().when().get().then().extract().response();
		 System.out.println(r.asString());
	 }
	 
	 public static void authWorks() {
		 Response r = RestAssured.given()
	    		 .auth().oauth2("1.TRXj5lyraPsVpCZHgGsf1mkeTkA=")
	    		 .and()	    		
	             	.when()
	             .get("https://www19.v1host.com/FedEx/rest-1.v1/Data/Member?where=IsSelf=\"true\"&sel=Username")
	             	.then()
	             .extract().response();
	     System.out.println(r.asString());
	     
	     //.header("Content-Type", "text/plain")
		//  .header("Authorization", "Bearer 1.TRXj5lyraPsVpCZHgGsf1mkeTkA=")
	     
	 }
}
