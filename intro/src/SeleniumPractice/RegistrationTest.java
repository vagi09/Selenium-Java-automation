package SeleniumPractice;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegistrationTest {

	@Test
	public void verifyFlightReg() throws InterruptedException

	{

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//RegistrationPage RGPage = new RegistrationPage(driver);
		RegistrationPage2 RGPage = new RegistrationPage2(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/newtours/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		
		
		RGPage.clickRegLink();
		RGPage.setFirstName("Vageesha");
		RGPage.setLastName("Jajur");
		RGPage.setPhone("9620602353");
		RGPage.setemail("vagi.buddy@gmail.com");
		RGPage.setAddress1("Kottur");
		RGPage.setCity("Kottur");
		RGPage.setState("Karnataka");
		RGPage.setPostalCode("583134");
		RGPage.setCountry("INDIA");
		RGPage.setUserName("vagi306");
		RGPage.setPassword("fffdf&*22512"); 
		RGPage.setConfrimPassword("fffdf&*22512");
		RGPage.clickRegBtn();
		
		if(driver.getPageSource().contains("Thank you for registering"))
		{
			System.out.println("Registration Successful - TEST PASSED");
		}
		else 
		{
			System.out.println("Registration failed - TEST FAILED");
		}
			Thread.sleep(5000);
			driver.close();
			
		
	
	}

}
