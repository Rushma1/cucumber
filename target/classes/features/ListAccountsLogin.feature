@ListAccountFeature  @Regression
Feature: List Account page functionality validation

@addAccountScenario1 @Smoke @Sanity
   Scenario:  User should be able to creat a new Account 
    Given User is on codefios login page
     When User enters username as "demo@codefios.com"
	  When User enters password as "abc123"
    When User clicks on sign in button
    Then User should be landing on dashboard page
    Then user clicks on List Account
    Then user should be able to land New Account page
    Then user click on Add Account
    Then user enter"saving" in the Account Name field 
    Then user enter"RM Description" in the Description field 
    Then user enter"10000" in the Initial Balance field
    Then user enter"12345265" in the Account Number field 
    Then user enter"RMaharjan" in the Contact Person field 
    Then user click on Save
    Then user should be able to validate account created successfully
    
    