package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	By signin = By.xpath("//a[@href='https://rahulshettyacademy.com/sign_in/']");
	By title = By.xpath("//div[@class='container']//div[@class='text-center']/child::h2");
	By banner = By.xpath("//h3[contains(text(),'An Academy to learn Everything about Testing')]");
	By navigation = By.cssSelector(".nav.navbar-nav.navbar-right");

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public LogInPage getLogIn() {

		 driver.findElement(signin).click();
		 LogInPage lp = new LogInPage(driver);
		 return lp;

	}

	public WebElement getTitle() {

		return driver.findElement(title);
	}

	public WebElement getBanner() {

		return driver.findElement(banner);
	}

	public WebElement navigationBar() {

		return driver.findElement(navigation);

	}

}
