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
Feature: Title of your feature
  As an quality engineer
  I want to see list of orders
  So that I can create new order


Background:
   Given user has logged in
   
  @tag1
  
  Scenario: as an user i can checkout product
		When click the Beli button on product
		And click cart icon to see product have been added
		And click the Bayar button to checkout products
		Then verify that the product has been checked out
		
	Scenario: user can add quantity
		When click the Beli button on product
		And click cart icon to see product have been added
		And click the add button to add product quantity
		Then verify that the product has been added
	
	Scenario: user can reduces product quantity
		When click the Beli button on some products
		And click cart icon to see product
		And click the minus button to reduces product quantity
		Then verify that the product has been reduced
	
