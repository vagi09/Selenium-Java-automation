package SeleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProp {

	public static void main(String[] args) throws IOException {

		WebDriver driver = null;

		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
				"C:/Users/VAGI/git/CoreJava/coreJavaPractice" + "/src/stringClassPractice/config.properties");
		prop.load(ip);



		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (browserName.equals("FF")) {

			System.setProperty("webdriver.gecko.driver",
					"C:/Users/VAGI/git/Selenium-Java-automation/intro/driver/geckodriver/geckodriver.exer");

			driver = new FirefoxDriver();
		} else {

			System.out.println("No browser is given");
		}
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.name(prop.getProperty("user_name"))).sendKeys("user");
		driver.findElement(By.name(prop.getProperty("password_name"))).sendKeys("password");
		driver.findElement(By.xpath(prop.getProperty("login_btn_xpath"))).click();
		driver.close();

	}

}
