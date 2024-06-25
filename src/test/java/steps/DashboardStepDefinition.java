package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import pages.DashboardPage;
import pages.LoginPage;
import pages.TestBase;

public class DashboardStepDefinition extends TestBase {
	
	DashboardPage dashboardPage;
	@Then("User should be landing on dashboard page")
	public void user_should_be_landing_on_dashboard_page() {
//		takeScreenshot(driver);
		dashboardPage=PageFactory.initElements(driver, DashboardPage.class);
		
		String expectedTitle="Codefios";
		String actualTitle=dashboardPage.getPageTitle();
		System.out.println("text = "+actualTitle);
		Assert.assertEquals("Page Title not found!",expectedTitle, actualTitle);

		
		
	}
	@Then ("user clicks on List Account")
	public void user_clicks_on_List_Accounts() {
		dashboardPage.clickListAccount();
		
	}
}
