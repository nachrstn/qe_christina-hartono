#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login
  I want to login

  
Background:
    Given I am on login page

@tag1
  Scenario: Login using valid email & valid password
    When I input email and password
    Then successfully login and go to the home page

	Scenario: Login with an empty email field
		When user does not enter an email and enters a valid password
		Then shows an alert that the email field is empty
	
	Scenario: Login with an empty password field
		When user enters a valid email and does not enter a password
		Then shows an alert that the password field is empty
	
	Scenario: Login with Uppercase Letters in Email
		When user enters an email with uppercase letters and a valid password
		Then successfully login and go to the home page
	
	Scenario: Login with spaces in the Email field
		When user enters spaces in the email field and valid password
		Then shows an alert that the email or password is invalid
	
	Scenario: Login with spaces in the Password field
		When user enters a valid email and enters spaces in the password field
		Then shows an alert that the email or password is invalid
	
	Scenario: Login with invalid email format no domain
		When user enters an email without a domain and valid password
		Then shows an alert that the email or password is invalid

