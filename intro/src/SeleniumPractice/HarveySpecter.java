package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HarveySpecter {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com/"); // hit url
		driver.manage().window().maximize(); // max the window
		System.out.println(driver.findElements(By.tagName("a")).size()); // counting the links in the page
		WebElement headerdriver = driver.findElement(By.id("container")); // counting the links in header page
		System.out.println(headerdriver.findElements(By.tagName("a")).size());

		Thread.sleep(2000); // wait
		driver.findElement(By.id("search")).sendKeys("Harvey Specter"); // enter seah word
		Actions a = new Actions(driver);
		a.sendKeys(Keys.SPACE).build().perform(); // press space bar from key board
		Thread.sleep(5000); // wait for 5 sec

		List<WebElement> list = driver
				.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']")); // xpath for
																										// listing all
																										// results
		System.out.println("Total number of suggestions in search box===>" + list.size()); // gets number of searches
		for (int i = 0; i < list.size(); i++) {
			String listitem = list.get(i).getText();
			System.out.println(listitem); // prints all the results
			if (listitem.contains("harvey specter best moments")) {
				list.get(i).click();
				break;
			}

		}
	}
}
