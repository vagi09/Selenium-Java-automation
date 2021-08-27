package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LangSelect {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String URL= "http://slaveryfootprint.org/";
		driver.navigate().to(URL);
		
		String title = driver.getTitle();
		System.out.println("The title of the page is: "+ title);
		
		driver.findElement(By.xpath("//select[@aria-label='Language Translate Widget']//option[@value='en']")).click();
		

	}

}
