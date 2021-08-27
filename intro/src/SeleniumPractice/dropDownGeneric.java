package SeleniumPractice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

import q.config.TestBase;

public class dropDownGeneric extends TestBase {

	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

//		driver = new ChromeDriver();
//		driver.manage().window().maximize();

		initilizatoin();
		By country = By.id("Form_submitRequest_Country");
		By industry = By.id("Form_submitRequest_Industry");
		By emp = By.id("Form_submitRequest_No_of_Employees");

		selectDropDownValue(country, "value", "Afghanistan");
		selectDropDownValue(industry, "index", "4");
		selectDropDownValue(emp, "value", "0 - 10");

	}

	public static void selectDropDownValue(By locator, String type, String value) {

		Select select = new Select(getElement(locator));

		switch (type) {
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;

		case "value":
			select.selectByValue(value);
			break;

		case "visibletext":
			select.selectByVisibleText(value);
			break;

		default:
			System.out.println("please pass the correct selection criteria");
			break;
		}

	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

	public static void doSelectByVisibleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);

	}

	public static void doSelectDropDownByIndex(By locator, int index) {

		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

}
