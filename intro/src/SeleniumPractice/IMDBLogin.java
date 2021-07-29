package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IMDBLogin {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");	

		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\VAGI\\git\\Selenium-Java-automation\\intro\\driver\\EdgeDriver");
		//WebDriver driver = new EdgeDriver();

		driver.get("https://www.imdb.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[2]/div[5]/a[1]/div[1]")).click();
		driver.findElement(By.xpath("//div[@id='wrapper']//a[1]//span[2]")).click();
		driver.findElement(By.cssSelector("#ap_email")).sendKeys("vagi.buddy@gmail.com");
		driver.findElement(By.cssSelector("#ap_password")).sendKeys("dLZ+vj#G-BAZ6M@");
		driver.findElement(By.cssSelector("#signInSubmit")).click();
		driver.findElement(By.xpath("//body/div[@id='__next']/nav[@id='imdbHeader']/div[2]/div[5]/div[1]/label[2]/div[1]/span[1]")).click();
		driver.findElement(By.cssSelector(".ipc-list__item[href='/profile/lists?ref_=nv_usr_lst_3']")).click();
		driver.findElement(By.xpath("//li[@id='ls091879973']//a[@class='list-name']")).click();
		driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M12 8c1.1 ')]")).click();
		driver.findElement(By.cssSelector("div[id='wrapper'] li:nth-child(2) a:nth-child(1)")).click();
		Thread.sleep(6000);
		driver.close();


	}

}
