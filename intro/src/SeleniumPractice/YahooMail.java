package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooMail {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://login.yahoo.com/");

		String pageTitle = driver.getTitle();
		System.out.println("Titel of the page is: " + pageTitle);

		WebElement username = driver.findElement(By.id("login-username"));
		username.sendKeys("testnaveen@yahoo.com");
		
//		driver.findElement(By.xpath("//input[@id='persistent']")).click();
//		driver.findElement(By.linkText("Forgotten username?")).click();

		WebElement logInBtn = driver.findElement(By.xpath("//input[@value='Next' and @name='signin']"));
		// different x path with contains //input[contains(@name,'signin')]
		logInBtn.click();
		Thread.sleep(3000);

	}

}
