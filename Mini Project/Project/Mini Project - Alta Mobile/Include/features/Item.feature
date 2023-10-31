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
Feature: Add Item
  I want to add item

Background:
    Given I am open the application
    And click plus sign

  Scenario: Add new item with valid data
    When I input name, quantity, categories
    And click add item button
    Then success add item and go to the home page

	Scenario: Empty Name
		When Name is null, but enter valid quantity, valid categories
	  And click add item button
	  Then warning on name must be between 1 and 50 characters
	
	Scenario: Input Name only 1 character
	  When I input name with 1 character, valid quantity, valid categories
	  And click add item button
	  Then warning on name must be between 1 and 50 characters
	
	Scenario: Input Name only with space
	  When I input name only with space, valid quantity, valid categories
	  And click add item button
	  Then warning on name must be between 1 and 50 characters
	
	Scenario: Input Name exceeds the character range
	  When I input name exceeds the character range, valid quantity, valid categories
	  And click add item button
	  Then success add item and go to the home page
	
	Scenario: Add new item with valid data
	  When I input name, quantity, categories
	  And click add item button
	  Then success add item and go to the home page
	
	Scenario: Empty Quantity
	  When Quantity is null, but enter valid name, and categories
	  And click add item button
	  Then warnings on quantity must be valid positive
	
	Scenario: Different format in Quantity
	  When I fill the quantity with different formats, but enter valid name, and categories
	  And click add item button
	  Then warnings on quantity must be valid positive
	
	Scenario: Input quantity with 0
	  When I fill the quantity with 0, but enter valid name, and categories
	  And click add item button
	  Then warnings on quantity must be valid positive
	
	Scenario: Input quantity only with space
	  When I fill the quantity only with space, but enter valid name, and categories
	  And click add item button
	  Then warnings on quantity must be valid positive
	
	Scenario: Input quantity exceeds the character range
	  When I fill the quantity exceeds the character range, but enter valid name, and categories
	  And click add item button
	  Then warnings on quantity must be valid positive
	
	Scenario: Reset data new item
	  When I input name, quantity, categories
	  And click Reset button
	  Then data will return to default
