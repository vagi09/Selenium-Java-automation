package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");	
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/signin");
		
		driver.findElement(By.cssSelector("#identifierId")).sendKeys("vagi.buddy@gmail.com");
		driver.findElement(By.cssSelector("#identifierNext > div > button > span")).click();
		driver.findElement(By.cssSelector("#password > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).sendKeys("9620602353");
		driver.findElement(By.cssSelector(".VfPpkd-LgbsSe-OWXEXe-k8QpJ > span:nth-child(3)")).click();
		
		
	}

}
