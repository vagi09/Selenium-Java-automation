package SeleniumPractice;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import q.config.TestBase;

/**
 * @author VAGI How To Handle permission popups using selenium WebDriver
 */

public class DesiredCapabilities extends TestBase {

	public static WebDriver driver;

	public static void main(String[] args) {
		initilizatoin();
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Integer> contentSettings = new HashMap<String, Integer>();
		HashMap<String, Object> profile = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();

		contentSettings.put("notifications", 2); // 0 - ask, 1- allow, 2- block
		profile.put("managed_default_content_settings", contentSettings);
		prefs.put("profile", profile);
		options.setExperimentalOption("prefs", prefs);

		contentSettings.put("geolocation", 1); // 0 - ask, 1- allow, 2- block
		profile.put("managed_default_content_settings", contentSettings);
		prefs.put("profile", profile);
		options.setExperimentalOption("prefs", prefs);

//		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver(options);

		String URL = "https://beta.spicejet.com/";
		driver.navigate().to(URL);

	}
	
	
}
