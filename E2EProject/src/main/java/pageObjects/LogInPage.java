package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LogInPage {

	public WebDriver driver;

	By email = By.cssSelector("#user_email");
	By password = By.cssSelector("#user_password");
	By loginbtn = By.cssSelector("input[value=\"Log In\"]");
	By frgtpw = By.xpath("//a[@href='password/new/index.php']");

	public LogInPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getEmail() {

		return driver.findElement(email);

	}

	public WebElement getPassword() {

		return driver.findElement(password);

	}

	public WebElement getLogIn() {

		return driver.findElement(loginbtn);

	}
	
	public ForgotPassword forgotPassWord() {
		
		 driver.findElement(frgtpw).click();
		 return new ForgotPassword(driver);
		
	}


}
