package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quora {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");	
		
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://www.quora.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("m.vageeshjajur@gmail.com");
		driver.findElement(By.id("password")).sendKeys("vagi$3encumB");
		driver.findElement(By.xpath("//div[@class='q-text qu-ellipsis qu-whiteSpace--nowrap']")).click();
		

	}

}
