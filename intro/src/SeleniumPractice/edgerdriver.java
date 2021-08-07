package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edgerdriver {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.edge.driver", "./driver/EdgeDriver/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		
	}

}
