@DBLoginFeature @Regression
Feature: TechFios login functionality validation

Background: 
  Given User is on techfios login page
  
@DBLoginScenario1
Scenario: 1 User should not be able to login with invalid credential
	When User enters username from database
	When User enters password from database
	When User clicks on signin button
	Then User should land on Dashboard page
	