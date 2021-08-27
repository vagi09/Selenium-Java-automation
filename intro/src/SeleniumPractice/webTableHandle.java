package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import q.config.TestBase;

public class webTableHandle extends TestBase {

	public static void main(String[] args) {

		initilizatoin();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));

		int rowCount = rows.size();
		System.out.println("Total no.of rows: " + rowCount);

		System.out.println("-------------Company-----------------");

		String beforeXpath = "//*[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";

		for (int i = 2; i <= rowCount; i++) {

			String actualxpath = beforeXpath + i + afterXpath;

			WebElement element = driver.findElement(By.xpath(actualxpath));

			System.out.println(element.getText());

			if (element.getText().equals("Island Trading")) {

				System.out.println("company name: " + element.getText() + " is found " + "at position: " + (i - 1));
				break;
			}

		}

		System.out.println("-------------Contact-----------------");

		String afterXpathContact = "]/td[2]";
		for (int i = 2; i <= rowCount; i++) {

			String actualxpath = beforeXpath + i + afterXpathContact;

			WebElement element = driver.findElement(By.xpath(actualxpath));

			System.out.println(element.getText());

			if (element.getText().equals("Island Trading")) {

				System.out.println("company name: " + element.getText() + " is found " + "at position: " + (i - 1));
				break;
			}

		}

		System.out.println("-------------Country-----------------");

		String afterXpathCountry = "]/td[3]";
		for (int i = 2; i <= rowCount; i++) {

			String actualxpath = beforeXpath + i + afterXpathCountry;

			WebElement element = driver.findElement(By.xpath(actualxpath));

			System.out.println(element.getText());

			if (element.getText().equals("Island Trading")) {

				System.out.println("company name: " + element.getText() + " is found " + "at position: " + (i - 1));
				break;
			}

		}

	}

}
