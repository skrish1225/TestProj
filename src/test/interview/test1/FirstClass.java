package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
		
public class FirstClass {
	
	
	@Test
	public static void firstMethod() {
		/*
		RestAssured.baseURI = "http://stage.digitize.sltc.com/";
		
		
		  Response r1 = given().auth().ntlm("krishnas5","Onsite002@", "someValue", "US").	
					header("Connection","keep-alive").		
					header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36")
				  .param("search_term", "")
				  .param("return_type", "DATA")
				  .param("template_code", "")
				  .param("entity_code", "")
				  .param("filter","[{\"operator\":\"like\",\"value\":\"delete\",\"property\":\"identifier\"}]")
				  .param("page", "1")
				  .param("start", "0")			  
				  .param("limit", "100").when().get("sproc/app/Document_Source_Config_grid").then().extract().response();
		  
		  
		  boolean result = r1.asString().contains("DeleteMe")?true:false;
		  System.out.println("VERIFY IF DOCUMENT SOURCE IS CREATED -> DeleteMe - "+result);
		  
		  */
		
		
		String path = System.getProperty("user.dir")+"\\Resources\\SystemLib\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);  
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Test");
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name(""))));
		driver.findElement(By.name("btnK")).sendKeys("");
		
	}

}
