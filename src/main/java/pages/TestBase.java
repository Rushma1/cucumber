package pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.xml.crypto.Data;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestBase {
		
	public static WebDriver driver;
	
	
	
	public static void initDriver() {
		
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("https://codefios.com/ebilling/");
		
	}
	
	public void takeScreenshot(WebDriver driver) {
		
		//className obj = new ClassName();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
	
		
		
		try {
			FileUtils.copyFile(sourceFile, new File(System.getProperty("user.dir")+ "/screenshots/" + System.currentTimeMillis() + ".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		 
	}
	
	
	
}
