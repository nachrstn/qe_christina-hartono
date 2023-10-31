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



class LoginSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am on login page")
	def onloginPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
	}

	@When("I input email and password")
	def inputValidEmailPassword() {
		WebUI.setText(findTestObject('input_Email_input-18'), 'susisusanti@gmail.com')
		WebUI.setText(findTestObject('input_Password_input-21'), '123')
		WebUI.click(findTestObject('span_Login'))
	}

	@Then("successfully login and go to the home page")
	def onHomePage() {
		WebUI.verifyElementVisible(findTestObject('h3_AltaShop'))
		WebUI.closeBrowser()
	}

	@When("user does not enter an email and enters a valid password")
	def notEnterEmailAndEnterValidPass() {
		WebUI.setText(findTestObject('input_Password_input-21'), '123')
		WebUI.click(findTestObject('span_Login'))
	}

	@Then("shows an alert that the email field is empty")
	def showsAlertEmailEmpty() {
		WebUI.verifyElementVisible(findTestObject('div_email is required'))
		WebUI.closeBrowser()
	}

	@When("user enters a valid email and does not enter a password")
	def entersValidEmailAandNotPassword() {
		WebUI.setText(findTestObject('input_Email_input-18'), 'susisusanti@gmail.com')
		WebUI.click(findTestObject('span_Login'))
	}

	@Then("shows an alert that the password field is empty")
	def showsAlertPasswordEmpty() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/div_password is required'))
		WebUI.closeBrowser()
	}


	@When("user enters an email with uppercase letters and a valid password")
	def entersEmailUppercaseLettersAndValidPassword() {
		WebUI.setText(findTestObject('input_Email_input-18'), 'SusiSusanti@gmail.com')
		WebUI.setText(findTestObject('input_Password_input-21'), '123')
		WebUI.click(findTestObject('span_Login'))
	}


	@When("user enters spaces in the email field and valid password")
	def entersSpacesInEmailAndValidPassword() {
		WebUI.setText(findTestObject('input_Email_input-18'), ' ')
		WebUI.setText(findTestObject('input_Password_input-21'), '123')
		WebUI.click(findTestObject('span_Login'))
	}

	@When("user enters a valid email and enters spaces in the password field")
	def entersValidEmailAndEntersSpacesInPassword() {
		WebUI.setText(findTestObject('Object Repository/input_Email_input-18'), 'susisusanti@gmail.com')
		WebUI.setText(findTestObject('Object Repository/input_Password_input-21'), ' ')
		WebUI.click(findTestObject('Object Repository/span_Login'))
	}

	@When("user enters an email without a domain and valid password")
	def entersEmailWithoutDomainAndValidPassword() {
		WebUI.setText(findTestObject('Object Repository/input_Email_input-18'), 'susisusanti')
		WebUI.setText(findTestObject('Object Repository/input_Password_input-21'), '123')
		WebUI.click(findTestObject('Object Repository/span_Login'))
	}

	@Then("shows an alert that the email or password is invalid")
	def showsAlertEmailOrPasswordInvalid() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/div_email or password is invalid'))
		WebUI.closeBrowser()
	}
}