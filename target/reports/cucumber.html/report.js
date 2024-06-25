$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/ListAccountsLogin.feature");
formatter.feature({
  "name": "List Account page functionality validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ListAccountFeature"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to creat a new Account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ListAccountFeature"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@addAccountScenario1"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on codefios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_is_on_codefios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username as \"demo@codefios.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_username_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_clicks_on_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be landing on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.DashboardStepDefinition.user_should_be_landing_on_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on List Account",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.DashboardStepDefinition.user_clicks_on_List_Accounts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to land New Account page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.ListAccountDefinition.user_should_be_able_to_land_New_Account_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Add Account",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.ListAccountDefinition.user_click_on_Add_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"saving\" in the Account Name field",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.ListAccountDefinition.user_enter_saving_in_the_Account_Name_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"RM Description\" in the Description field",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.ListAccountDefinition.user_enter_RM_Description_in_the_Description_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"10000\" in the Initial Balance field",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.ListAccountDefinition.user_enter_in_the_Account_Name_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"12345265\" in the Account Number field",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.ListAccountDefinition.user_enter_in_the_A_C_Number_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"RMaharjan\" in the Contact Person field",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.ListAccountDefinition.user_enter_RMaharjan_in_the_Contact_Person_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Save",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.ListAccountDefinition.user_click_on_Save()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.ListAccountDefinition.user_should_be_able_to_validate_account_created_successfully()"
});
formatter.result({
  "status": "passed"
});
});