package steps;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountListPage;
import pages.LoginPage;
import pages.TestBase;

public class ListAccountDefinition extends TestBase {
	AccountListPage accountListPage;
	
	@Then("user should be able to land New Account page")
	public void user_should_be_able_to_land_New_Account_page() {
		accountListPage = PageFactory.initElements(driver, AccountListPage.class);
	    String expText = "Account List";
	    String actualText = accountListPage.getAccountListText();
	    Assert.assertEquals("Text can not found!",expText , actualText);
	}

	@Then("user click on Add Account")
	public void user_click_on_Add_Account() {
		accountListPage.clickAddAccount();
	}

	@Then("user enter {string} in the Account Name field")
	public void user_enter_saving_in_the_Account_Name_field(String accountName) {
	   accountListPage.enterAccountName(accountName);
	}

	@Then("user enter {string} in the Description field")
	public void user_enter_RM_Description_in_the_Description_field(String description) {
	   accountListPage.enterDescription(description);
	}

	@Then("user enter {string} in the Initial Balance field")
	public void user_enter_in_the_Account_Name_field(String initialBalance) {
		accountListPage.enterBalance(initialBalance);
	}

	@Then("user enter {string} in the Account Number field")
	public void user_enter_in_the_A_C_Number_field(String accountNum) {
		accountListPage.enterAccountNumber(accountNum);
	}

	@Then("user enter {string} in the Contact Person field")
	public void user_enter_RMaharjan_in_the_Contact_Person_field(String contactPerson) {
		accountListPage.enterContact(contactPerson);
	}

	@Then("user click on Save")
	public void user_click_on_Save() {
		accountListPage.clickSaveButton();
	}

	@Then("user should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() {
		String expText = "Account Added Successfully.";
		String actual = accountListPage.getAccountAddedAlertText();
		Assert.assertEquals("not found!", expText, actual);
	}
}