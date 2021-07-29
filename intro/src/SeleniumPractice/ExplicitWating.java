package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");	
	
	WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.id("email")).sendKeys("m.vageeshjajur@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("9620602");
	
	
	driver.close();
		
	}

}
