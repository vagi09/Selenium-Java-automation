package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropPractice {
	static WebDriver driver;
	public static void main(String[] args) {
		 
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VAGI\\git\\Selenium-Java-automation\\intro\\driver\\ChromeDrvier92v\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		Actions action = new Actions(driver);
		
		WebElement draggable = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement droppable = driver.findElement(By.xpath("//div[@id='trash']"));
		
		action.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
		
	

	}

}
