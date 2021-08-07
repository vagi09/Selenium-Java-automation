package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class google extends webDriver{ //inheritance

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys("Harvey Specter");
		Thread.sleep(1000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']")); // fetches all the list of suggestion box
		System.out.println("Total number of suggestions in search box===>"+list.size());

		for(int i=0; i<list.size(); i++)
		{
		String listitem=list.get(i).getText();
		System.out.println(listitem);
		if (listitem.contains("quotes"))
		{
			list.get(i).click();
			break;
		}
		}
	}

}
