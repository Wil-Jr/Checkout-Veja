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

WebUI.navigateToUrl('https://abril.com.br/assine-funil-simplificado/1321/FZZJ/52/')

WebUI.setText(findTestObject('Object Repository/Page_Assine funil simplificado  Abril.com/input_Nome Completo_identificacao_nome_completo'), 
    'Automatizado Um')

WebUI.setText(findTestObject('Object Repository/Page_Assine funil simplificado  Abril.com/input_Email_identificacao_email'), 
    'teste.automatizado.01@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Assine funil simplificado  Abril.com/input_Telefone_identificacao_telefone'), 
    '(99) 9999-99999')

WebUI.click(findTestObject('Object Repository/Page_Assine funil simplificado  Abril.com/p_Boleto bancrio'))

WebUI.setText(findTestObject('Page_Assine funil simplificado  Abril.com/input_CPF ou CNPJ_pagamento_boleto_bancario_bec9f7'), 
    '538.942.630-40')

WebUI.click(findTestObject('Object Repository/Page_Assine funil simplificado  Abril.com/button_Fechar compra'))

WebUI.delay(100)

WebUI.verifyElementPresent(findTestObject('Page_Assine funil simplificado  Abril.com/h2_Compra realizada com sucesso'), 
    0)

