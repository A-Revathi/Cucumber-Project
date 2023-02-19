@OtherLogin
Feature: TechFios login functionality validation

Background:
  Given User is on techfios login page

@OtherLoginScenario1
Scenario Outline: User should not be able to login with invalid credential
	When User enters username as "<username>"
	When User enters password as "<password>"
	When User clicks on signin button
	Then User should land on Dashboard page
	
	Examples:
	|username|password|
	|demo@techfios.com|abc1234|
	|demo1@techfios.com|abc123|
	|demo2@techfios.com|abc1234|
	
#	to comment anything in cucumber, select and we use press and hold control + forward slash(/)
#Data parameterization using Scenario outline and Examples: to make the code dynamic