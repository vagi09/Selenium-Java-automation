package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LogInPage;
import resources.base;

public class HomePage extends base {
	public WebDriver driver;

	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@Test(dataProvider = "getData")

	public void basePageNavigation(String Username, String password, String text) throws IOException {

		LandingPage l = new LandingPage(driver);
		LogInPage lp =	l.getLogIn();
//		LogInPage lp = new LogInPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(password);
		System.out.println(text);
		log.info("Successfully validated the text message");
		lp.getLogIn().click();
		ForgotPassword fp = lp.forgotPassWord();
		fp.getEmail().sendKeys("vdfdfdf");
		fp.sendMeInstructions().click();

	}

	@DataProvider

	public Object[][] getData() {

		Object[][] data = new Object[2][3];
		data[0][0] = "nonrestricteduser@qw.com";
		data[0][1] = "123456";
		data[0][2] = "Restricted User";

		data[1][0] = "restricteduser@qw.com";
		data[1][1] = "45678";
		data[1][2] = "Non Restricted User";

		return data;
	}

	@AfterTest

	public void teardown() {

		driver.close();

	}

}
