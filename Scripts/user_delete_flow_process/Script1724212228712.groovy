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

WebUI.navigateToUrl('https://dev.humanika.enigmacamp.com/login')

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/user_delete_flow_process/input_Username_username'), 'testfe')

WebUI.setEncryptedText(findTestObject('Object Repository/user_delete_flow_process/input_Password_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/user_delete_flow_process/button_Login'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/user_delete_flow_process/p_Workflow'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/user_delete_flow_process/input_Flow Process_inputFlow'), 'WORK_AUTO')

WebUI.click(findTestObject('Object Repository/user_delete_flow_process/button_Search'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/user_delete_flow_process/i_Active_bi bi-trash3-fill'))

WebUI.verifyElementVisible(findTestObject('Object Repository/user_delete_flow_process/p_Are you sure you want to delete this data'))

WebUI.verifyElementVisible(findTestObject('Object Repository/user_delete_flow_process/button_Delete'))

WebUI.verifyElementClickable(findTestObject('Object Repository/user_delete_flow_process/button_Delete'))

WebUI.click(findTestObject('Object Repository/user_delete_flow_process/button_Delete'))

WebUI.delay(3)

WebUI.closeBrowser()

