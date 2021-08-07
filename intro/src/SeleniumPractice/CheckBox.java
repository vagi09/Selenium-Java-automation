package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");	
			
		 WebDriver driver=new ChromeDriver();
				
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		 System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		 System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); // to count no of checkboxes in the page.
		 driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		 
		 driver.close();

	}

}
