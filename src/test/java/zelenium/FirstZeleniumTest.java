package zelenium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstZeleniumTest {
WebDriver driver;
	@Parameters("Browser")
	@BeforeTest
	void setup(String br) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		
			dc.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
			dc.setCapability(CapabilityType.PLATFORM_NAME, Platform.LINUX);
		
		URL url = new URL("http://localhost:4444/wd/hub");		
		driver = new RemoteWebDriver(url, dc);
		driver.get("https://www.google.com/");		
		driver.manage().window().maximize();
	}
	
	@Test
	void loginTest() {
		System.out.println("****EXECUTING TEST CASE****");
		driver.findElement(By.name("q")).sendKeys("COVID 19");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("btnK")).click();
		ArrayList<WebElement>links = (ArrayList<WebElement>) driver.findElements(By.xpath("//div[@class='r']/a"));
		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
		}
		
		
	}
	@AfterTest
	void teardown() {
		driver.quit();
	}
}
