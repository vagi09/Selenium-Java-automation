package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fileUpload {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		
		// setting dynamic path for dowlnloading a file in the project folder irrespective of the machine.
		String DownloadPath= System.getProperty("user.dir");
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", DownloadPath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		
		driver.get("https://altoconvertpdftojpg.com/");
		driver.findElement(By.xpath("//button[@id='dropzoneInput-label']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\VAGI\\Downloads\\Basanth\\fileupload.exe"); //AUTO IT locatoin.
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='g-btn g-btn--primary g-btn--medium']")));
		driver.findElement(By.xpath("//button[@class='g-btn g-btn--primary g-btn--medium']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download")));
		driver.findElement(By.linkText("Download")).click();
		Thread.sleep(5000);
		
		File f = new File(DownloadPath+"/Result.zip"); // Downloads the file in SeleniumJavaPractice project folder.
		boolean file= f.exists();
		if (file) {
			
			System.out.println("file found");
		}else {
			
			System.out.println("file not found");
		}
		
		
		
		
		

		


	}

}
