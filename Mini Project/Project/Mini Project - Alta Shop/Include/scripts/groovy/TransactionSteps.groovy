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



class TransactionSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I have logged in on Alta Shop")
	def loggedInOnAltaShop() {
		WebUI.openBrowser('')		
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')	
		WebUI.setText(findTestObject('Object Repository/input_Email_input-18'), 'susisusanti@gmail.com')
		WebUI.setText(findTestObject('Object Repository/input_Password_input-21'), '123')		
		WebUI.click(findTestObject('Object Repository/span_Login'))
	}

	@And("click on the Beli button of a product")
	def clickBeliButtonOfaProduct() {
		WebUI.click(findTestObject('button_Beli1'))
		WebUI.click(findTestObject('button_Beli2'))		
		WebUI.click(findTestObject('button_Beli3'))		
		WebUI.click(findTestObject('button_Beli4'))		
		WebUI.click(findTestObject('button_Beli5'))		
		WebUI.click(findTestObject('button_Beli6'))
	}
	
	@And("click the cart button")
	def clickCartButton() {
		WebUI.click(findTestObject('button_6'))
	}

	@When("click the profile button")
	def clickProfileButton() {
		WebUI.click(findTestObject('buttonProfile'))
	}
	
	@And("click the Transaction button")
	def clickTransactionButton() {
		WebUI.click(findTestObject('div_Transaksi'))
	}
	
	@Then("user will be on the transaction page")
	def clickProfileIcon() {
		WebUI.verifyElementVisible(findTestObject('h1_Transactions'))
	}
	
	@When("click the Bayar button to checkout product")
	def clickBayarButtonToCheckoutProduct() {
		WebUI.click(findTestObject('Object Repository/span_Bayar'))
	}
	
	@Then("products sorted by dropdown arrow")
	def productsSortedbyDropdownArrow() {
		WebUI.click(findTestObject('Object Repository/span_Produk'))		
		WebUI.click(findTestObject('Object Repository/span_Produk'))
		WebUI.closeBrowser()
	}

	@Then("price sorted by dropdown arrow")
	def pricSortedbyDropdownArrow() {
		WebUI.click(findTestObject('span_Harga'))		
		WebUI.click(findTestObject('span_Harga'))
		WebUI.closeBrowser()
	}
		
	@Then("quantity sorted by dropdown arrow")
	def quantitySortedbyDropdownArrow() {
		WebUI.click(findTestObject('span_Banyaknya'))		
		WebUI.click(findTestObject('span_Banyaknya'))
		WebUI.closeBrowser()
	}

	@Then("sub total sorted by dropdown arrow")
	def subTotalSortedbyDropdownArrow() {
		WebUI.click(findTestObject('span_Sub-total'))		
		WebUI.click(findTestObject('span_Sub-total'))
		WebUI.closeBrowser()
	}
		
	@And("click the dropdown arrow icon on rows per page")
	def clickDropdownArrowIconOnRowsPerPage() {
		WebUI.click(findTestObject('div_10'))		
		WebUI.click(findTestObject('Object Repository/div_5'))
	}

	@Then("data will be displayed according to the row limit")
	def dataDisplayedAccordingRowLimit() {
		WebUI.closeBrowser()		
	}
	
	@Then("successfully go to the next page by clicking next")
	def successfulToTheNextPage() {
		WebUI.click(findTestObject('nextPage'))
		WebUI.closeBrowser()
	}
	
	@Then("successfully go to the previous page by clicking the previous arrow")
	def successfulToThePreviousPage() {
		WebUI.click(findTestObject('previousPage'))		
		WebUI.closeBrowser()		
	}
}