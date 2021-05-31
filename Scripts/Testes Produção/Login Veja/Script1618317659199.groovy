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

WebUI.navigateToUrl('https://veja.abril.com.br/')

WebUI.click(findTestObject('Object Repository/Login Veja/Page_VEJA - Reportagens exclusivas, notcias_3579e1/a_ENTRAR'))

WebUI.setText(findTestObject('Object Repository/Login Veja/Page_VEJA - Reportagens exclusivas, notcias_3579e1/input_acesse com seus dados_email'), 
    'wil.veja.01@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login Veja/Page_VEJA - Reportagens exclusivas, notcias_3579e1/input_e-mail_senha'), 
    'GPfNPJAtZHdw0lsQsfycFw==')

WebUI.click(findTestObject('Object Repository/Login Veja/Page_VEJA - Reportagens exclusivas, notcias_3579e1/button_entrar'))

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/Login Veja/Page_VEJA - Reportagens exclusivas, notcias_3579e1/i_Revista_icon menu'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Login Veja/Page_VEJA - Reportagens exclusivas, notcias_3579e1/div_Ol, WIL VEJA'), 
    0)

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/Login Veja/Page_VEJA - Reportagens exclusivas, notcias_3579e1/a_Sair'))

WebUI.delay(4)

WebUI.closeBrowser()

