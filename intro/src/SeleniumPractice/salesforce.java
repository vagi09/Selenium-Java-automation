package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");	
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://salesforce.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[class='dropdown-toggle disabled']")).click();
		driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 username']")).sendKeys("m.vageeshjajur@gmail.com");
		//driver.findElement(By.id("password")).sendKeys("V@qu9oraselenium");
		//driver.findElement(By.cssSelector("#Login")).click();
		
	
		
	}

}
