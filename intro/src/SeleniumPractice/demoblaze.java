package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblaze {
	static WebDriver driver; // declaring webdriver at global level

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.demoblaze.com/index.html");
		driver.findElement(By.cssSelector("#login2")).click();
		login("admin", "admin"); // calling login method written below
		Thread.sleep(5000);
		contact("vagi.buddy@gmail.com", "vagi", "Thanks for contacting");

	}

	public static void login(String username, String password) {

		driver.findElement(By.id("loginusername")).sendKeys(username);
		driver.findElement(By.id("loginpassword")).sendKeys(password);

		// loginbtn
		WebElement loginbtn = driver.findElement(By.xpath("//button[@onclick='logIn()']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginbtn);

	}

	public static void contact(String email, String name, String message) {

		driver.findElement(By.cssSelector("#recipient-email")).sendKeys(email);
		driver.findElement(By.cssSelector("#recipient-name")).sendKeys(name);
		driver.findElement(By.cssSelector("#message-text")).sendKeys(message);

		// sendmsgbtn

		WebElement sendmsgbtn = driver.findElement(By.xpath("//button[@onclick='send()']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", sendmsgbtn);

	}

}
