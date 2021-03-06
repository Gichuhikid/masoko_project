import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

not_run: TestData data = findTestData('SigninValidations')

not_run: WebUI.openBrowser(findTestData('SigninValidations').getValue(1, 1))

not_run: WebUI.maximizeWindow()

not_run: WebUI.delay(3)

WebUI.click(findTestObject('Signin Page/Link- SignIn'))

WebUI.setText(findTestObject('Signin Page/Input-Email'), findTestData('SigninValidations').getValue(2, 5))

WebUI.delay(2)

WebUI.setText(findTestObject('Signin Page/Input-Password'), findTestData('SigninValidations').getValue(3, 5))

WebUI.delay(2)

WebUI.click(findTestObject('Signin Page/Button-Signin'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Signin Page/Error Message- Invalid passwrd and email'), 0)

