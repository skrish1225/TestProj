package TestProj.TestProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test88 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
@Test
	public void test() throws InterruptedException {
	System.out.println("sdfsdf");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.11.0");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("selenium.dev")).click();
		
		
	
		
	}

}
