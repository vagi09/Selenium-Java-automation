package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\VAGI\\eclipse-workspace\\E2EProject\\src\\main\\java\\resources\\config.properties");
		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (browserName.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver/geckodriver.exe");

			driver = new FirefoxDriver();

		}

		else if (browserName.equals("Microsoft Edge")) {

			System.setProperty("webdriver.edge.driver", "./driver/EdgeDriver/msedgedriver.exe");
			driver = new EdgeDriver();

		}

		else {

			System.out.println("Unfortunately No broswer is given!");
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	public String getScreenShot(String testCaseName, WebDriver driver) throws IOException {

//	TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String filedest = System.getProperty("user.dir") + "/reports/" + testCaseName + ".png";
		FileUtils.copyFile(source, new File(filedest));
		return filedest;

	}

}
