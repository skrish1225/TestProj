package testPackage;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver  = new ChromeDriver();
		ArrayList<WebElement>s = new ArrayList<WebElement>();
		s.addAll(driver.findElements(By.name("sdf")));
		
		
		Set<String>s1 = driver.getWindowHandles();
		for (int i = 0; i < s1.size(); i++) {
			
		}
		

	}

}
