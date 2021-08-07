package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.practo.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[text()='Doctors']")).click();
		driver.navigate().back();
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.xpath("//*[text()='Consult']")).click();
		}
		driver.navigate().back();
		driver.findElement(By.xpath("//*[text()='Pharmacy']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[text()='Diagnostics']")).click();
		driver.navigate().back();

		driver.findElement(By.cssSelector("a[name='Practo login']")).click();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vagi.buddy@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("9620602353");

		driver.findElement(By.xpath("//label[normalize-space()='Remember me for 30 days']")).click();
		driver.findElement(By.cssSelector("#login")).click();
		driver.close();
	}

}
