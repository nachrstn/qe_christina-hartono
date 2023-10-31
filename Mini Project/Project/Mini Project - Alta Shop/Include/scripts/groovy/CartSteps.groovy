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



class CartSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user has logged in")
	def userHasLoggedIn() {
		WebUI.openBrowser('')		
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')		
		WebUI.setText(findTestObject('Object Repository/input_Email_input-18'), 'susisusanti@gmail.com')
		WebUI.setText(findTestObject('Object Repository/input_Password_input-21'), '123')
		WebUI.click(findTestObject('Object Repository/span_Login'))
	}

	@When("click the Beli button on product")
	def clickBeliButtonOnProduct() {
		WebUI.click(findTestObject('Object Repository/span_Beli'))
	}

	@And("click cart icon to see product have been added")
	def clickCartIconToSeeProductHaveBeenAdded() {
		WebUI.click(findTestObject('button_1'))
		}
	
	@And("click the Bayar button to checkout products")
	def clickBayarButtonToCheckoutProducts() {
		WebUI.click(findTestObject('Object Repository/span_Bayar'))
	}
	
	@Then("verify that the product has been checked out")
	def verifyProductHasBeenCheckedOut() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/h1_Transactions'))
		WebUI.closeBrowser()
	}
	
	@And("click the add button to add product quantity")
	def clickAddButtonToAddProductQuantity() {
		WebUI.click(findTestObject('span_'))		
		WebUI.click(findTestObject('span_'))
	}
	
	@Then("verify that the product has been added")
	def verifyProductHasBeenAdded() {
		WebUI.verifyElementVisible(findTestObject('span_3'))
		WebUI.closeBrowser()
	}
	
	

	@When("click the Beli button on some products")
	def clickBeliButtonOnSomeProducts() {
		WebUI.click(findTestObject('Object Repository/span_Beli'))		
		WebUI.click(findTestObject('Object Repository/span_Beli'))		
		WebUI.click(findTestObject('Object Repository/span_Beli'))		
		WebUI.click(findTestObject('Object Repository/span_Beli'))		
		}

	@And("click cart icon to see product")
	def clickCartIconToSeeProduct() {
		WebUI.click(findTestObject('Object Repository/i_AltaShop_v-icon notranslate fas fa-shoppi_c66ce9'))
	}
	
	@And("click the minus button to reduces product quantity")
	def clickMinusButtonToAddProductQuantity() {
		WebUI.click(findTestObject('span_-'))		
		WebUI.click(findTestObject('span_-'))
	}
	
	@Then("verify that the product has been reduced")
	def verifyProductHasBeenReduced() {
		WebUI.verifyElementVisible(findTestObject('span_2'))
		WebUI.closeBrowser()
	}
	
}