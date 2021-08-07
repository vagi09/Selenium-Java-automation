package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class operadriver {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver  = null;
		System.setProperty("webdriver.opera.driver",
				"C:/Users/VAGI/git/Selenium-Java-automation/intro/driver/operadriver/operadriver.exe");
		driver = new OperaDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		String pagetitle= driver.getTitle();
		System.out.println("Title of the page is: " + pagetitle );
		Thread.sleep(3000);
		driver.close();
		

	}

}
