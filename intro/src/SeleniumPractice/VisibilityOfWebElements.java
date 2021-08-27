package SeleniumPractice;

import org.openqa.selenium.By;

import q.config.TestBase;

public class VisibilityOfWebElements extends TestBase {

	/**
	 * @Author: Vageesha J M visibility of web elements.
	 */

	public static void main(String[] args) {

		initilizatoin();

		String URL = "https://beta.spicejet.com/";
		driver.get(URL);

		// isDispalyed
		boolean searh_flight = driver.findElement(By.xpath(
				"//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[7]/div[2]/div[1]"))
				.isDisplayed();

		System.out.println("Search Flight button is: " + searh_flight);
		
		driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).click();

		boolean frnds_family = driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).isSelected();

		System.out.println("CheckBox is selected: " + frnds_family);

		driver.findElement(By.xpath("//div[contains(text(),'Signup')]")).click();

		boolean enroll = driver.findElement(By.xpath(
				"//div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]"))
				.isEnabled();
		System.out.println("enrollment button: " + enroll);

	}

}
