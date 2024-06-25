@NegativeLoginFeature  @Regression
Feature: Negative CodeFios page login functionality validation

	Background:
    Given User is on codefios login page
  
 
 		@NegativeLogeinScenario1 @Smoke @Sanity
   Scenario Outline: 1 User should be able to login with valid credentials
     When User enters username as "<username>"
	  When User enters password as "<password>"
    When User clicks on sign in button
    Then User should be landing on dashboard page
    
    Examples:
    | username           |  password |
    | demo@codefios.com  |  abc124   |
    | demo2@codefios.com |  abc123   |
    | demo@codefios.com  |           |
    |                    |  abc123   |
  
  
   #@NegativeLoginScenario2 
   #Scenario: 2 User should be able to login with valid credentials
     #When User enters username as "demo2@codefios.com"
      #	 	When User enters password as "abc123"
    #When User clicks on sign in button
    #Then User should be landing on dashboard page
    
    
     #@NegativeLoginScenario3
     #Scenario: 3 User should be able to login with valid credentials
       #When User enters username as "demo@codefios.com"
#	 	When User enters password as ""
    #When User clicks on sign in button
    #Then User should be landing on dashboard page 
    #
     #@NegativeLoginScenario4
     #Scenario: 4 User should be able to login with valid credentials
       #When User enters username as " "
#	 	When User enters password as "abc123"
    #When User clicks on sign in button
    #Then User should be landing on dashboard page
    #
    