@OtherCodeFiosLoginFeature @Regression


Feature: other Codefios page login functionality validation

 	Background:
    Given User is on codefios login page
     When User enters username as "demo@codefios.com"
     
  @OtherScenario1
  Scenario: 1 User should be able to login with valid credentials(other)
	  When User enters password as "abc123"
    When User clicks on sign in button
    Then User should be landing on dashboard page
  
  @OtherScenario2  @Smoke
   Scenario: 2 User should be able to login with valid credentials(other)
	  When User enters password as "abc124"
    When User clicks on sign in button
    Then User should be landing on dashboard page
    
    
     @OtherScenario3 @Sanity
     Scenario: 3 User should be able to login with valid credentials(other)
	  When User enters password as ""
    When User clicks on sign in button
    Then User should be landing on dashboard page 