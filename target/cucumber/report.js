$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/LoginFeatureFromDB.feature");
formatter.feature({
  "line": 2,
  "name": "TechFios login functionality validation",
  "description": "",
  "id": "techfios-login-functionality-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@DBLoginFeature"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 13081395000,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_techfios_login_page()"
});
formatter.result({
  "duration": 2720228099,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "1 User should not be able to login with invalid credential",
  "description": "",
  "id": "techfios-login-functionality-validation;1-user-should-not-be-able-to-login-with-invalid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@DBLoginScenario1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User enters username from database",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters password from database",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks on signin button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username_from_database()"
});
formatter.result({
  "duration": 4379418800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_password_from_database()"
});
formatter.result({
  "duration": 2600988100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_signin_button()"
});
formatter.result({
  "duration": 6014605300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "duration": 402307599,
  "status": "passed"
});
formatter.after({
  "duration": 2059115099,
  "status": "passed"
});
});