package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));

		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		WebElement columndriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

		System.out.println(columndriver.findElements(By.tagName("a")).size());

		//WebElement socialmedia = driver.findElement(By.xpath("//table/tbody/tr/td[4]/ul"));
		//System.out.println(socialmedia.findElements(By.tagName("a")).size());

		for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {
			String clickingtab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickingtab);

		}

		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();

		while(it.hasNext());

		{

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}

	}

}
