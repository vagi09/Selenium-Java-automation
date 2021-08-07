package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class misFits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.misfitsmarket.com/");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		driver.findElement(By.xpath("//body/div[@id='root']/div[@id='navbar']/div/span[@class='sc-jKJlTe codrpo']/a[1]")).click();
		a.moveToElement(driver.findElement(By.xpath("//a[@href='/packaging']//b"))).click();
		

	}

}
