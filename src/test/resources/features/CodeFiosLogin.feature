@CodeFiosLoginFeature  @Regression
Feature: Codefios page login functionality validation

	Background:
    Given User is on codefios login page
    When User enters username as "demo@codefios.com"
 
 
 
  @LogeinScenario1 @Smoke @Sanity
   Scenario: 1 User should be able to login with valid credentials
	  When User enters password as "abc123"
    When User clicks on sign in button
    Then User should be landing on dashboard page
  
  
   @LoginScenario2 
   Scenario: 2 User should be able to login with valid credentials
	 	When User enters password as "abc124"
    When User clicks on sign in button
    Then User should be landing on dashboard page
    
    
     @LoginScenario3
     Scenario: 3 User should be able to login with valid credentials
	 	When User enters password as ""
    When User clicks on sign in button
    Then User should be landing on dashboard page 