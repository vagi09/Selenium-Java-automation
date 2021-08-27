package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxspice {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.navigate().to("https://beta.spicejet.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("The title of the page is: " + title);
//		driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).click();
//		driver.findElement(By.xpath("//div[contains(text(),'Health Professional')]")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1d09ksm r-18u37iz']/child::div")).click();
//		alternate xpath //div[@class='css-1dbjc4n r-1d09ksm r-18u37iz']//div[@class='css-76zvg2']

	}

}
