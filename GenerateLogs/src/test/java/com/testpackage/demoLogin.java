package com.testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import jdk.internal.org.jline.utils.Log;

//import jdk.internal.org.jline.utils.Log;

import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;

public class demoLogin {
	WebDriver driver;
	 
	Logger Log = Logger.getLogger(demoLogin.class);
	

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		Log.info("Launching Chrome Brwoser");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/login.html");
		Log.info("Entering Applicatoin URl");
		Log.warn("This is just warning");
		Log.fatal("Hey This is jsut fatal error");
		Log.debug("This is Debug not error");

	}

	@Test(priority = 1)

	public void titleTest() {
		
		
Log.info("*******Starting Test case1*******");
		String title = driver.getTitle();
		System.out.println("The Title of the page is: " + title);
		Log.info("Login Page Title is===> "+ title);
		Assert.assertEquals(title, "Login Page");
		

	}

	@Test(priority = 2)

	public void logoTest() {
Log.info("*******Starting Test Case2******");
		boolean b = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).isDisplayed();
		Assert.assertTrue(b);

	}

	@AfterMethod
	public void quit() {
		driver.quit();

	}

}
