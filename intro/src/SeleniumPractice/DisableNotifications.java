package SeleniumPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisableNotifications  {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\VAGI\\git\\Selenium-Java-automation\\intro\\src\\q\\config\\qa.properties");
		prop.load(ip);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		String URL = "https://beta.spicejet.com/";
//		driver.navigate().to(URL);

		driver.navigate().to(prop.getProperty("url"));
		String title = driver.getTitle();
		System.out.println("The title of the page is: " + title);

		String act_title = "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
//		Assert.assertTrue(title.contains(act_title));

//		String flase = "SpiceJet - Flight Booking ";
		Assert.assertEquals(title, act_title); 
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		

	}

}
