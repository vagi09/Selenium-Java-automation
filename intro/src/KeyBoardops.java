import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardops {
	static WebDriver driver;
	static Actions act;

	public	static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String url = "https://en-gb.facebook.com/";

		driver.get(url);
		 act = new Actions(driver);

		WebElement create_account = driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
		create_account.click();

		driver.findElement(By.name("firstname")).sendKeys("firstname");
		act.sendKeys(Keys.TAB).build().perform();
		act.pause(Duration.ofSeconds(2));
		act.sendKeys("lastname");
		act.sendKeys(Keys.TAB).build().perform();
		act.pause(Duration.ofSeconds(2));
		act.sendKeys("897974564");
		act.sendKeys(Keys.TAB).build().perform();
		act.pause(Duration.ofSeconds(2));
		act.sendKeys("aG4$facebook");
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.pause(Duration.ofSeconds(2));
		act.sendKeys(Keys.ARROW_RIGHT).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.pause(Duration.ofSeconds(1));
		act.sendKeys(Keys.ARROW_LEFT).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.pause(Duration.ofSeconds(1));
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1990");
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
//		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')")).click();

	}

}
