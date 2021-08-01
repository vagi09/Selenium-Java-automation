package SeleniumPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class IMDBLogin {

	public static void main(String[] args) throws IOException, InterruptedException {
		// Loading properties file
		WebDriver driver = null;
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
				"C:/Users/VAGI/git/Selenium-Java-automation/intro/src/q/config/IMDBfile.properties");
		prop.load(ip);

		// intiating different broswsers
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (browserName.equals("FF")) {

			System.setProperty("webdriver.gecko.driver",
					"C:/Users/VAGI/git/Selenium-Java-automation/intro/driver/geckodriver/geckodriver.exe");

			driver = new FirefoxDriver();
		}

		else if (browserName.equals("Microsoft Edge")) {

			System.setProperty("webdriver.edge.driver", "./driver/EdgeDriver/msedgedriver.exe");
			driver = new EdgeDriver();
		}

		else if (browserName.equals("Opera")) {

			System.setProperty("webdriver.opera.driver",
					"C:/Users/VAGI/git/Selenium-Java-automation/intro/driver/operadriver/operadriver.exe");
			driver = new OperaDriver();

		}

		else {

			System.out.println("No browser is given");
		}

		// Test Scenario
		String PageTitle = driver.getTitle();
		System.out.println("Title of the Page is: " + PageTitle);

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.findElement(By.xpath(prop.getProperty("sign_in_first"))).click();
		driver.findElement(By.xpath(prop.getProperty("sign_with_imdb"))).click();
		driver.findElement(By.id(prop.getProperty("id"))).sendKeys(prop.getProperty("Email"));
		driver.findElement(By.name(prop.getProperty("name"))).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.xpath(prop.getProperty("sign_in"))).click();
		driver.findElement(By.xpath(prop.getProperty("vagi"))).click();
		driver.findElement(By.cssSelector(prop.getProperty("your_list"))).click();
		driver.findElement(By.xpath(prop.getProperty("must_watch_tv_shows"))).click();
		driver.findElement(By.xpath(prop.getProperty("three_dots"))).click();
		driver.findElement(By.xpath(prop.getProperty("export"))).click();
		Thread.sleep(5000);
		driver.close();

	}

}
