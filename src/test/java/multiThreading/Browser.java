package multiThreading;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser extends Thread {

	String browserName;	
	WebDriver driver;
	
	@Override
	public void run() {
		
		try {
			googleSearch(this.driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public Browser(String threadName, String browserName) {
		super(threadName);
		this.browserName = browserName;
		this.driver = openBrowser(browserName);
	}
	
	public WebDriver openBrowser(String browserName) {
		WebDriver driver;
		if(browserName.equals("chrome")) {
			String path = System.getProperty("user.dir")+"\\Resources\\SystemLib\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);  
			driver = new ChromeDriver();			
		}else {
			String path = System.getProperty("user.dir")+"\\Resources\\SystemLib\\IEDriverServer.exe";			
			System.setProperty("webdriver.ie.driver", path);
			driver = new InternetExplorerDriver();
		}
		
		return driver;
	}
	
	public void googleSearch(WebDriver driver) throws InterruptedException {
		
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.name("search_query")).sendKeys("Ram Mandir");
		driver.findElement(By.name("search_query")).submit();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElements(By.id("video-title")).stream().forEach(ele -> System.out.println(ele.getText()));
		
		
		
	}
	
	
}
