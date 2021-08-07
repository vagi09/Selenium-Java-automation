package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calendarenabledisable {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");	
			
		 WebDriver driver=new ChromeDriver();
				
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 driver.manage().window().maximize();
		
		 System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		 driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		 System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		 if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("1"))
		 {
			 System.out.println("=====>its enabled");
			 Assert.assertTrue(true);
			 
		 }
		 else
		 {
			 Assert.assertTrue(false);
		 }
		  
		 driver.close();
	}

}
