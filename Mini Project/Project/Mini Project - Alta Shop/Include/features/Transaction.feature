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
Feature: Transaction
  I want to transaction my cart

Background:
  Given I have logged in on Alta Shop
  And click on the Beli button of a product
	And click the cart button
  
  Scenario: user can see transaction
	When click the profile button
	And click the Transaction button
	Then user will be on the transaction page
	
	Scenario: user can dropdown product
	When click the Bayar button to checkout product
	Then products sorted by dropdown arrow
	
	Scenario: user can dropdown price
	When click the Bayar button to checkout product
	Then price sorted by dropdown arrow
	
	Scenario: user can dropdown quantity
	When click the Bayar button to checkout product
	Then quantity sorted by dropdown arrow
	
	Scenario: user can dropdown sub total
	When click the Bayar button to checkout product
	Then sub total sorted by dropdown arrow
	
	Scenario: user can dropdown row per page
	When click the Bayar button to checkout product
	And click the dropdown arrow icon on rows per page
	Then data will be displayed according to the row limit
	
	Scenario: user can see the next page of the transaction page
	When click the Bayar button to checkout product
	And click the dropdown arrow icon on rows per page
	Then successfully go to the next page by clicking next
	
	Scenario: users can view the previous page of the transaction page
	When click the Bayar button to checkout product
	And click the dropdown arrow icon on rows per page
	Then successfully go to the next page by clicking next