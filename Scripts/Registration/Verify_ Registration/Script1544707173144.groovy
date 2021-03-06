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

WebUI.openBrowser('https://www.masoko.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Registration/Link-Register'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Registration/Input-First Name'), findTestData('Datasource').getValue(1, 1))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Registration/Input- Last Name'), findTestData('Datasource').getValue(2, 1))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Registration/Input-Password Confirmation'), findTestData('Datasource').getValue(6, 1))

WebUI.sendKeys(findTestObject('Registration/Input- Mobile No'), findTestData('Datasource').getValue(3, 1))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Registration/Input -Email'), findTestData('Datasource').getValue(4, 1))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Registration/Input- Password'), findTestData('Datasource').getValue(5, 1))

WebUI.delay(3)

WebUI.delay(3)

WebUI.click(findTestObject('Registration/Button- Create Account'))

