package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TstClass {

	String URL = "http://15.206.84.54:4444/wd/hub";
	
	@Test
	@Parameters({"Browser"})
	public void actualTest(String Browser) throws MalformedURLException, InterruptedException {
		System.out.println("Executing in "+Browser);
		WebDriver driver=  null;
		try {
			driver = selectBrowser(Browser);
			driver.get("https://www.google.com/");		
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.name("q")).sendKeys("COVID 19",Keys.ENTER);
			System.out.println(driver.getTitle());
			//driver.findElement(By.name("btnK")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			ArrayList<WebElement>links = (ArrayList<WebElement>) driver.findElements(By.xpath("//a"));
			for (int i = 0; i < links.size(); i++) {
				System.out.println(links.get(i).getText());
			}		
			driver.quit();
		}catch (Exception e) {
			driver.quit();
		}
	}
	
	
	public WebDriver selectBrowser(String browser) throws MalformedURLException {
		WebDriver driver = null;
		if (browser.equals("gridChrome")) {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setBrowserName(BrowserType.CHROME);
			driver = new RemoteWebDriver(new URL(this.URL) , cap);
			driver.manage().window().maximize();
		}else if (browser.equals("gridFirefox")) {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setBrowserName(BrowserType.FIREFOX);
			 driver = new RemoteWebDriver(new URL(this.URL) , cap);
			 driver.manage().window().maximize();
		}else if (browser.equals("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		
		return driver;
	}
	
	
}
