$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/sunit_000/Desktop/testing/cucumberProject/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "NriDesicharms Login feature",
  "description": "",
  "id": "nridesicharms-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "NriDesicharms Login Test Feature",
  "description": "",
  "id": "nridesicharms-login-feature;nridesicharms-login-test-feature",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is already on home  page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Title of home  Page is Nridesicharms",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click on Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter Username and Password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Clicks on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User is logged in using his Account.",
  "keyword": "And "
});
formatter.match({
  "location": "LoginFeatureDefinition.user_is_already_on_home_page()"
});
formatter.result({
  "duration": 144056409,
  "status": "passed"
});
formatter.match({
  "location": "LoginFeatureDefinition.title_of_home_Page_is_Nridesicharms()"
});
formatter.result({
  "duration": 23094,
  "status": "passed"
});
formatter.match({
  "location": "LoginFeatureDefinition.click_on_Login_Button()"
});
formatter.result({
  "duration": 27370,
  "status": "passed"
});
formatter.match({
  "location": "LoginFeatureDefinition.enter_Username_and_Password()"
});
formatter.result({
  "duration": 21382,
  "status": "passed"
});
formatter.match({
  "location": "LoginFeatureDefinition.clicks_on_Login_Button()"
});
formatter.result({
  "duration": 19672,
  "status": "passed"
});
formatter.match({
  "location": "LoginFeatureDefinition.user_is_logged_in_using_his_Account()"
});
formatter.result({
  "duration": 20100,
  "status": "passed"
});
});