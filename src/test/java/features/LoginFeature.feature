@Login @Regression
Feature: TechFios login functionality validation

Background: 
  Given User is on techfios login page
  
@LoginScenario1
Scenario Outline: User should not be able to login with invalid credential
	When User enters username as "<username>"
	When User enters password as "<password>"
	When User clicks on signin button
	Then User should land on Dashboard page
	
	Examples:
  |username|password|
  |demo@techfios.com|abc123|
  #|demo@techfios.com|abc123|

  
  
#@LoginScenario1 @Smoke
#Scenario:1 User should be able to login with valid credential
#	When User enters username as "demo@techfios.com"
#	When User enters password as "abc123"
#	When User clicks on signin button
#	Then User should land on Dashboard page
#	
#@LoginScenario2
#Scenario:2 User should be able to login with valid credential
#	When User enters username as "demo2@techfios.com"
#	When User enters password as "abc123"
#	When User clicks on signin button
#	Then User should land on Dashboard page