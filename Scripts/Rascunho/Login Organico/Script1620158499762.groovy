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

WebUI.navigateToUrl('https://abrilgoread-develop.go-vip.net/login/')

WebUI.setText(findTestObject('Object Repository/Login Organico/Page_login/input_Email_login_email'), 'wil.200@gmail.com')

WebUI.delay(2)

WebUI.setText(findTestObject('Login Organico/Page_login/input_Senha_login_password'), '01365122085')

WebUI.click(findTestObject('Object Repository/Login Organico/Page_login/button_Entrar'))

WebUI.click(findTestObject('Object Repository/Login Organico/Page_/i_Ajuda_fas fa-bars'))

WebUI.click(findTestObject('Object Repository/Login Organico/Page_/a_Sair'))

WebUI.closeBrowser()

