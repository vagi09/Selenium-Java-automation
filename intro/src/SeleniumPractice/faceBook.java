package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class faceBook {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAGI\\git\\Selenium-Java-automation\\intro\\driver\\ChromeDrvier92v\\chromedriver.exe");	

		driver=new ChromeDriver();
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();

		
		driver.get("https://en-gb.facebook.com/");
		driver.getTitle();
		driver.getCurrentUrl();
		driver.getPageSource();
		driver.findElement(By.linkText("Forgotten password?")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click(); //custom desgined
		driver.findElement(By.xpath("//input[@placeholder='Mobile number']")).sendKeys("9620602353");
		driver.findElement(By.xpath("//button[@name='did_submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='_9o1v']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'Done')]")).click();
		

	}

}
