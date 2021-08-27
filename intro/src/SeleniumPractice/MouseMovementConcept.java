package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;



public class MouseMovementConcept  {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAGI\\git\\Selenium-Java-automation\\intro\\driver\\ChromeDrvier92v\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		

		String title = driver.getTitle();
		String URL = "https://beta.spicejet.com/";
//		String act_title = "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";

		driver.navigate().to(URL);
		System.out.println("Title of the page is: " + title);
//		Assert.assertTrue(title.contains(act_title));

		Actions action = new Actions(driver);
		action.moveToElement(driver
				.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1mf7evn r-1otgn73']")))
				.build().perform();
		driver.findElement(By.xpath("//div[contains(text(),'Friends and Family')]")).click();

	}

}
