@DbLoginFeature @Regression
Feature: Codefios Dashboard functionality validation


@DbLoginScenario1  
   Scenario: 1 User should be able to login with valid credentials from MySQL database
   Given User is on codefios login page
   When User enters "username" from database
	 When User enters "password" from database
    When User clicks on sign in button
    Then User should be landing on dashboard page
  
  
   