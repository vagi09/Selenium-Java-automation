package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import q.config.TestBase;

public class WindowHandle extends TestBase {

	public static void main(String[] args) {

		initilizatoin();
		String url = "https://beta.spicejet.com/";
		driver.get(url);

		WebElement Deals = driver.findElement(By.xpath("//div[contains(text(),'Deals')]"));
		Deals.click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String ParentID = it.next();
		String ChildID = it.next();
		driver.switchTo().window(ChildID);
		WebElement getText = driver.findElement(By.xpath("//h1[contains(text(),'Welcome to Hot Deals')]"));
		String Text = getText.getText();
		System.out.println("Text present in the child page is: " + Text);
		
		
		

	}

}
