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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.interactions.Actions as Actions

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.humanika.enigmacamp.com/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Flow Process Management/input_Username_username'), 'testfe')

WebUI.setEncryptedText(findTestObject('Object Repository/Flow Process Management/input_Password_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Flow Process Management/button_Login'))

WebUI.click(findTestObject('Object Repository/Flow Process Management/i_Auth_bi bi-gear-fill ec-text-body-1'))

WebUI.setText(findTestObject('Object Repository/Flow Process Management/input_Flow Process_inputFlow'), 'AUTO')

WebUI.click(findTestObject('Object Repository/Flow Process Management/button_Search'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Flow Process Management/td_FLOW_AUTO'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Flow Process Management/input_Flow Process_inputFlow'), 'FOR AUTOMATION TESTING')

WebUI.click(findTestObject('Object Repository/Flow Process Management/button_Search'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Flow Process Management/td_AUTOMATION_REGISTRATION'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Flow Process Management/input_Flow Process_inputFlow'), '')

WebUI.click(findTestObject('Object Repository/Flow Process Management/button_Search'))

WebUI.click(findTestObject('Object Repository/Flow Process Management/span_STATUS_ng-arrow-wrapper'))

WebUI.click(findTestObject('Object Repository/Flow Process Management/span_Inactive'))

WebUI.click(findTestObject('Object Repository/Flow Process Management/button_Search'))

WebUI.click(findTestObject('Object Repository/Flow Process Management/span_STATUS_ng-arrow-wrapper'))

WebUI.click(findTestObject('Object Repository/Flow Process Management/span_STATUS'))

WebUI.setText(findTestObject('Flow Process Management/input_Flow Process_inputFlow'), 'WORK_AUTO_FLOW')

WebUI.click(findTestObject('Object Repository/Flow Process Management/button_Search'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/Flow Process Management/i_Active_bi bi-trash3-fill'))

not_run: WebUI.delay(2)

not_run: WebUI.waitForElementClickable(findTestObject('Flow Process Management/button_Delete'), 0)

not_run: WebUI.click(findTestObject('Object Repository/Flow Process Management/button_Delete'))

WebUI.setText(findTestObject('Object Repository/Flow Process Management/input_Flow Process_inputFlow'), 'FLOW_AUTO')

WebUI.click(findTestObject('Object Repository/Flow Process Management/button_Search'))

WebUI.click(findTestObject('Object Repository/Flow Process Management/button_Search'))

WebUI.click(findTestObject('Object Repository/Flow Process Management/i_Active_bi bi-eye ec-primary'))

WebUI.setText(findTestObject('Object Repository/Flow Process Management/textarea_Description_description'), 'AUTO EDIT DESCRIPTION')

WebUI.click(findTestObject('Object Repository/Flow Process Management/button_Save'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Flow Process Management/button_New Flow'))

Random rand = new Random()

int randomNumber = rand.nextInt()

WebUI.setText(findTestObject('Object Repository/Flow Process Management/input_Workflow ID_workflowId'), 'WORK_AUTO_FLOW' + 
    randomNumber)

WebUI.setText(findTestObject('Object Repository/Flow Process Management/textarea_Description_description'), 'automation testing')

WebUI.click(findTestObject('Object Repository/Flow Process Management/input_Active_status'))

WebUI.click(findTestObject('Object Repository/Flow Process Management/i_Draft_bi bi-plus ec-text-title hovercurso_be1925'))

WebUI.click(findTestObject('Object Repository/Flow Process Management/div_manual_ng-input'))

WebUI.click(findTestObject('Object Repository/Flow Process Management/div_manual_ng-input'))

WebUI.setText(findTestObject('Object Repository/Flow Process Management/input_Task ID_task_id'), 'manual_testing')

WebUI.setText(findTestObject('Object Repository/Flow Process Management/textarea_Description_description_1'), 'desc')

WebUI.click(findTestObject('Object Repository/Flow Process Management/button_Save_1'))

//WebUI.click(findTestObject('Object Repository/Flow Process Management/button_manual_testing'))
//
//WebUI.dragAndDropToObject(findTestObject('Object Repository/Flow Process Management/button_manual_testing'), findTestObject(
//        'Flow Process Management/div_Task_taskAccordion'))
WebElement from = WebUI.findWebElement(findTestObject('Object Repository/Flow Process Management/button_manual_testing'))

WebElement to = WebUI.findWebElement(findTestObject('Flow Process Management/div_Task_taskAccordion'))

Actions builder = new Actions(DriverFactory.getWebDriver())

builder.clickAndHold(from).moveToElement(to).release(to).build().perform()

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Object Repository/Flow Process Management/div_Task Kosong'))

not_run: WebUI.click(findTestObject('Object Repository/Flow Process Management/div_Task_taskAccordion'))

WebUI.click(findTestObject('Object Repository/Flow Process Management/button_Save'))

WebUI.delay(3)

WebUI.closeBrowser()

