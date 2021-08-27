package SeleniumPractice;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PermissionPopups {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Integer> contenetSettings = new HashMap<String, Integer>();
		HashMap<String, Object> profile = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		
		contenetSettings.put("notifications", 2);
		profile.put("managed_default_content_settings", contenetSettings);
		prefs.put("profile", profile);
		options.setExperimentalOption("prefs", prefs);

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		// options.addArguments("disable-notifications"); 
		// options.addArguments("disable-geolocation");
		// options.addArguments("disable-media-stream");
		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.omanair.com/gbl/en");	
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		// List<WebElement> date = driver.findElements(By.className("available"));
		// int count = driver.findElements(By.className("available")).size();

		// for (int i = 0; i < count; i++) {

		// String text =
		// driver.findElements(By.className("available")).get(i).getText();

		// if (text.equalsIgnoreCase("16")) {
		// driver.findElements(By.className("available")).get(i).click();
		// break;
		// }

		// }
	}

}
