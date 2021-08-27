package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class headLessChromeTest {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("winodw-size=1400,800");
		options.addArguments("headless");

//		WebDriver driver = new HtmlUnitDriver();
		
		WebDriver driver = new ChromeDriver(options);

		WebDriverManager.chromedriver().setup();

		driver.navigate().to("https://www.demoblaze.com/index.html");
		System.out.println("Title of the Page is::" + driver.getTitle());

		WebElement LogIn = driver.findElement(By.xpath("//a[@id='login2']"));
		LogIn.click();

		WebElement Username = driver.findElement(By.xpath("//input[@id='loginusername']"));
		Username.sendKeys("test");

		WebElement Password = driver.findElement(By.xpath("//input[@id='loginpassword']"));
		Password.sendKeys("test");

		WebElement loginbtn = driver.findElement(By.xpath("//button[@onclick='logIn()']"));
		loginbtn.click();

	}

}
