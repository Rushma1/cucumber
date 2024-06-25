package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.Database;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {
	LoginPage loginPage;
	Database database;
	
	@Before 
	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		database= new Database();
	}
	
	

	@When("User enters username as {string}")
	public void user_enters_username_as(String username) {
		loginPage.enterUserName(username);
	}
		
	@When("User enters password as {string}")
		public void user_enters_password_as(String password) {
			loginPage.enterPassword(password);
		}
	
	

	@When("User enters {string} from database")
	public void user_enters_from_database(String loginData) {
		
		if(loginData.equalsIgnoreCase("username")) {
			loginPage.enterUserName(database.getDataFromDb("user_name"));
			System.out.println("user name from DB:" + database.getDataFromDb("user_name"));
			
		}else if (loginData.equalsIgnoreCase("password")) {
			loginPage.enterPassword("Password from DB:"+ database.getDataFromDb("password"));			
		
		}else {		
			System.out.println("unable to retrive login data!");
		}
		
		
//		switch(loginData) {
//		case "username":
//			loginPage.enterUserName(getDataFromDb);
//			break;
//		case "password":
//			loginPage.enterPassword(getDataFromDb);
//		break;
//	
//		default:
//			System.out.println("unable to retrive login data!");
//	}
		
	}
	

	
	


	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		loginPage.clickSigninButton();
	}

	
	@Given("User is on codefios login page")
	public void user_is_on_codefios_login_page() {
		driver.get("https://codefios.com/ebilling/login");
		
	}
	
	
	
	
	
	
	
	
//	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
