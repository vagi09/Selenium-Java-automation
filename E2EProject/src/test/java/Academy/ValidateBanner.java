package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.LandingPage;
import resources.base;

public class ValidateBanner extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());
	SoftAssert softAssert = new SoftAssert();

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("Getting the URL");

	}

	@Test

	public void validateBanner() {

		LandingPage l = new LandingPage(driver);
		log.info("Banner is displayed");
		softAssert.assertTrue(l.getBanner().isDisplayed());
		softAssert.assertEquals(l.getBanner().getText(), "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
		//AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING - actual text - test pass
		//An academy to learn everything about Testing - test fail
		
		softAssert.assertAll();

	}

	@AfterTest

	public void teardown() {

		driver.close();
		log.info("WebDriver is closed");

	}

}
