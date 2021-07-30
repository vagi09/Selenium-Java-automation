// To Count total no. of links available on the WebPage with given TagName
// To get teh text of each Tag Name 

package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.ebay.com/");
		String pageTitle = driver.getTitle();
		System.out.println("Title of the Page is: " + pageTitle);

		// Get the total count of links on the page
		// get the text of each link on the page.
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		String str = "a";
		System.out.println("Total no. of links available by " + str + "tagName: " + linkList.size());

		for (int i = 0; i < linkList.size(); i++) {
			String linkText = linkList.get(i).getText();
			System.out.println(linkText);

		}

		driver.close();

	}

}
