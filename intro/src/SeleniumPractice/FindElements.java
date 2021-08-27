package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://beta.spicejet.com/");
		List<WebElement> elements = driver.findElements(By.tagName("div"));

		System.out.println("no of elements with tag " + elements.size()); // prints the size of the tags

		for (int i = 0; i < elements.size(); i++) {

//			String text = elements.get(i).getText();

			System.out.println(elements.get(i).getText());

		}

		driver.close();

	}

}
