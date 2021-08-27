package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertmessage {

	public static void main(String[] args) throws InterruptedException {

		String text = "Vageesha Jajur";
//		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//Getting the tittel of the page
		String My_title=driver.getTitle();
		//prints the tittle
		System.out.println("Page title is : " + My_title);
		//adding assertion
		//String expected_tittle="Practice Page ";
		//Assert.assertEquals(My_title, expected_tittle);
		Assert.assertTrue(My_title.contains("Practice Page"));
		//if test passes below messages displayed
		System.out.println("Page Verified");
		
		driver.findElement(By.id("name")).sendKeys(text);
		Thread.sleep(2000);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText()); // prints the alert message.
		driver.switchTo().alert().accept(); // clicks on 'OK' of alert message.
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		driver.close();

	}

}
