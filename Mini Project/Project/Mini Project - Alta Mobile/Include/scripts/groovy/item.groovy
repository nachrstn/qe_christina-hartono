import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class item {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am open the application")
	def openApplication() {
		Mobile.startApplication('D:\\.Christina\\KULIAH\\MSIB\\Mini Project\\app-debug.apk', true)
	}

	@And("click plus sign")
	def clickPlusSign() {
		Mobile.tap(findTestObject('addNewItemButton'), 0)
	}

	@When("I input name, quantity, categories")
	def inputNameQuantityCategories( ) {
		Mobile.tap(findTestObject('addNewItemButton'), 0)
		Mobile.tap(findTestObject('Object Repository/nameField'), 0)
		Mobile.setText(findTestObject('nameField'), 'Wortel', 0)
		Mobile.tap(findTestObject('Object Repository/quantity_1'), 0)
		Mobile.tap(findTestObject('Object Repository/categories'), 0)
		Mobile.tap(findTestObject('Object Repository/categoryMeat'), 0)
	}

	@When("click add item button")
	def clickAddItemButton() {
		Mobile.tap(findTestObject('addItemButton'), 0)
	}

	@Then("success add item and go to the home page")
	def successAddItemAndGoToTheHomePage() {
		Mobile.verifyElementVisible(findTestObject('h1YourGroceries'), 0, FailureHandling.STOP_ON_FAILURE)
		Mobile.closeApplication()
	}

	@When("Name is null, but enter valid quantity, valid categories")
	def notFillNameEnter() {
		Mobile.tap(findTestObject('Object Repository/nameField'), 0)
		Mobile.setText(findTestObject('nameField'), '', 0)
		Mobile.tap(findTestObject('Object Repository/quantity_1'), 0)
		Mobile.tap(findTestObject('Object Repository/categories'), 0)
		Mobile.tap(findTestObject('Object Repository/categoryMeat'), 0)
	}

	@Then("warning on name must be between 1 and 50 characters")
	def warningOnName() {
		Mobile.verifyElementVisible(findTestObject('alertName'), 0)
		Mobile.closeApplication()
	}

	@When("I input name with 1 character, valid quantity, valid categories")
	def inputNameWith1Character() {
		Mobile.tap(findTestObject('Object Repository/nameField'), 0)
		Mobile.setText(findTestObject('nameField'), 'W', 0)
		Mobile.tap(findTestObject('Object Repository/quantity_1'), 0)
		Mobile.tap(findTestObject('Object Repository/categories'), 0)
		Mobile.tap(findTestObject('Object Repository/categoryMeat'), 0)
	}

	@When("I input name only with space, valid quantity, valid categories")
	def inputNameOnlyWithSpace() {
		Mobile.tap(findTestObject('Object Repository/nameField'), 0)
		Mobile.setText(findTestObject('nameField'), ' ', 0)
		Mobile.tap(findTestObject('Object Repository/quantity_1'), 0)
		Mobile.tap(findTestObject('Object Repository/categories'), 0)
		Mobile.tap(findTestObject('Object Repository/categoryMeat'), 0)
	}

	@When("I input name exceeds the character range, valid quantity, valid categories")
	def inputNameExceedsChar() {
		Mobile.tap(findTestObject('Object Repository/nameField'), 0)
		Mobile.setText(findTestObject('nameField'), 'Carrots: Nutritious, sweet, versatile root vegetables. Rich in vitamins, minerals, and antioxidants',
				0)
		Mobile.tap(findTestObject('Object Repository/quantity_1'), 0)
		Mobile.tap(findTestObject('Object Repository/categories'), 0)
		Mobile.tap(findTestObject('Object Repository/categoryMeat'), 0)
	}

	@When("Quantity is null, but enter valid name, and categories")
	def quantityIsNull() {
		Mobile.tap(findTestObject('Object Repository/nameField'), 0)
		Mobile.setText(findTestObject('nameField'), 'Wortel', 0)
		Mobile.tap(findTestObject('Object Repository/quantity_1'), 0)
		Mobile.setText(findTestObject('Object Repository/quantity_1'), '', 0)
		Mobile.tap(findTestObject('Object Repository/categories'), 0)
		Mobile.tap(findTestObject('Object Repository/categoryMeat'), 0)
	}

	@Then("warnings on quantity must be valid positive")
	def warningOnQuantity() {
		Mobile.verifyElementVisible(findTestObject('alertQuantity'), 0)
		Mobile.closeApplication()
	}

	@When("I fill the quantity with different formats, but enter valid name, and categories")
	def quantityDiffFormats() {
		Mobile.tap(findTestObject('Object Repository/nameField'), 0)
		Mobile.setText(findTestObject('nameField'), 'Wortel', 0)
		Mobile.tap(findTestObject('Object Repository/quantity_1'), 0)
		Mobile.setText(findTestObject('Object Repository/quantity_1'), '6.6', 0)
		Mobile.tap(findTestObject('Object Repository/categories'), 0)
		Mobile.tap(findTestObject('Object Repository/categoryMeat'), 0)
	}

	@When("I fill the quantity with 0, but enter valid name, and categories")
	def fillQuantityWith0() {
		Mobile.tap(findTestObject('Object Repository/nameField'), 0)
		Mobile.setText(findTestObject('nameField'), 'Wortel', 0)
		Mobile.tap(findTestObject('Object Repository/quantity_1'), 0)
		Mobile.setText(findTestObject('Object Repository/quantity_1'), '0', 0)
		Mobile.tap(findTestObject('Object Repository/categories'), 0)
		Mobile.tap(findTestObject('Object Repository/categoryMeat'), 0)
	}

	@When("I fill the quantity only with space, but enter valid name, and categories")
	def fillQuantityWithSpace() {
		Mobile.tap(findTestObject('Object Repository/nameField'), 0)
		Mobile.setText(findTestObject('nameField'), 'Wortel', 0)
		Mobile.tap(findTestObject('Object Repository/quantity_1'), 0)
		Mobile.setText(findTestObject('Object Repository/quantity_1'), ' ', 0)
		Mobile.tap(findTestObject('Object Repository/categories'), 0)
		Mobile.tap(findTestObject('Object Repository/categoryMeat'), 0)
	}

	@When("I fill the quantity exceeds the character range, but enter valid name, and categories")
	def fillQuantityExceedsChar() {
		Mobile.tap(findTestObject('Object Repository/nameField'), 0)
		Mobile.setText(findTestObject('nameField'), 'Wortel', 0)
		Mobile.tap(findTestObject('Object Repository/quantity_1'), 0)
		Mobile.setText(findTestObject('Object Repository/quantity_1'), '123456789123456789123', 0)
		Mobile.tap(findTestObject('Object Repository/categories'), 0)
		Mobile.tap(findTestObject('Object Repository/categoryMeat'), 0)
	}

	@And("click Reset button")
	def clickResetButton() {
		Mobile.tap(findTestObject('resetButton'), 0)
	}

	@Then("data will return to default")
	def dataReturnToDefault() {
		Mobile.verifyElementText(findTestObject('nameField'), 'Name')
		Mobile.closeApplication()
	}
}