package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver2) {
		this.driver= driver2;
	}

	//WebElement
	//By USER_NAME_FAIELD=By.xpath("//*[@id=\"user_name\"]");
	//WebElement USER_NAME_ELEMENT=driver.findElement(By.xpath("//*[@id=\"user_name\"]"));
	@FindBy(how = How.XPATH, using= "//*[@id=\"user_name\"]") WebElement UserName;
	@FindBy(how =How.XPATH, using = "//*[@id=\"password\"]") WebElement Password;
	@FindBy(how =How.XPATH, using = "//*[@id=\"login_submit\"]") WebElement SignInButton;
	
	//actions or intractable methods
	public void enterUserName(String userName) {
		UserName.sendKeys(userName);
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}
	}
	public void enterPassword(String password) {
		Password.sendKeys(password);
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	public void clickSigninButton() {
		SignInButton.click();
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}
	}
	public String getPageTitle() {
		return driver.getTitle();
	}
	
}
