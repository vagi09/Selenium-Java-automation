package SeleniumPractice;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWating {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp"); // Hits-the-URL

		driver.manage().window().maximize(); // maximize the window
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS); // page load+wait for 5 seconds
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		WebElement passWord = driver.findElement(By.xpath("//input[@type='password']"));

		sendKeys(driver, firstName, 5, "Vageesha");
		sendKeys(driver, lastName, 5, "Jajur");
		sendKeys(driver, passWord, 3, "ghdhfdhdh");

		WebElement ShowPwd = driver.findElement(By.xpath("//span[contains(text(),'Sign in instead')]"));
		clickOn(driver, ShowPwd, 5);

	}

	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) { // method for sending
																									// Keys

		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

	public static void clickOn(WebDriver driver, WebElement element, int timeout) { // method for clicking

		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
}
