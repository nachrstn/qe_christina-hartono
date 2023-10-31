import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')

WebUI.setText(findTestObject('Object Repository/input_Email_input-18'), 'susisusanti@gmail.com')

WebUI.setText(findTestObject('Object Repository/input_Password_input-21'), '123')

WebUI.click(findTestObject('Object Repository/span_Login'))

WebUI.click(findTestObject('button_Beli1'))

WebUI.click(findTestObject('button_Beli2'))

WebUI.click(findTestObject('button_Beli3'))

WebUI.click(findTestObject('button_Beli4'))

WebUI.click(findTestObject('button_Beli5'))

WebUI.click(findTestObject('button_Beli6'))

WebUI.click(findTestObject('button_6'))

WebUI.click(findTestObject('Object Repository/span_Bayar'))

WebUI.click(findTestObject('span_Banyaknya'))

WebUI.click(findTestObject('span_Banyaknya'))

WebUI.closeBrowser()

