package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserRegistration {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://demo.wpeverest.com/user-registration/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Vageesha");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Jajur");
		driver.findElement(By.xpath("//input[@id='user_login' and @ data-label='Username']"))
				.sendKeys("Vageesha jajur");
		driver.findElement(By.xpath("//input[@id='user_email' and @data-label='Email']"))
				.sendKeys("selenium@practice.com");
		driver.findElement(By.xpath("//input[@data-label='User Password']")).sendKeys("Gh$wordPress");
		driver.findElement(By.xpath("//input[@name='user_confirm_password']")).sendKeys("Gh$wordPress");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Thanks");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
