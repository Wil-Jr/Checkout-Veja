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

WebUI.navigateToUrl('https://abril.com.br/assine-funil-simplificado/4127/FZZ8/1/')

WebUI.setText(findTestObject('Object Repository/Venda Debito/Venda Debito Imp Dig/Page_Assine funil simplificado  Abril.com/input_Nome Completo_identificacao_nome_completo'), 
    'Teste Veja Dig Impressa')

WebUI.setText(findTestObject('Object Repository/Venda Debito/Venda Debito Imp Dig/Page_Assine funil simplificado  Abril.com/input_Email_identificacao_email'), 
    'teste.dig.imp.01@gmail.com')

WebUI.setText(findTestObject('Object Repository/Venda Debito/Venda Debito Imp Dig/Page_Assine funil simplificado  Abril.com/input_Telefone_identificacao_telefone'), 
    '(11) 9999-99999')

WebUI.setText(findTestObject('Object Repository/Venda Debito/Venda Debito Imp Dig/Page_Assine funil simplificado  Abril.com/input_CEP_endereco_cep'), 
    '05083-020')

WebUI.click(findTestObject('Object Repository/Venda Debito/Venda Debito Imp Dig/Page_Assine funil simplificado  Abril.com/input_Endereo_endereco_logradouro'))

WebUI.setText(findTestObject('Object Repository/Venda Debito/Venda Debito Imp Dig/Page_Assine funil simplificado  Abril.com/input_Nmero_endereco_numero'), 
    '111')

WebUI.setText(findTestObject('Object Repository/Venda Debito/Venda Debito Imp Dig/Page_Assine funil simplificado  Abril.com/input_Complemento_endereco_complemento'), 
    'ap12')

WebUI.click(findTestObject('Object Repository/Venda Debito/Venda Debito Imp Dig/Page_Assine funil simplificado  Abril.com/p_Dbito em conta'))

WebUI.setText(findTestObject('Object Repository/Venda Debito/Venda Debito Imp Dig/Page_Assine funil simplificado  Abril.com/input_Nome do titular da conta_pagamento_de_694bb3'), 
    'Teste Dig impressa')

WebUI.selectOptionByValue(findTestObject('Object Repository/Venda Debito/Venda Debito Imp Dig/Page_Assine funil simplificado  Abril.com/select_Selecione o banco   Banco Bradesco  _d6c75b'), 
    '341', true)

WebUI.setText(findTestObject('Object Repository/Venda Debito/Venda Debito Imp Dig/Page_Assine funil simplificado  Abril.com/input_CPF ou CNPJ_pagamento_debito_conta_cpf_cnpj'), 
    '135.941.530-02')

WebUI.click(findTestObject('Object Repository/Venda Debito/Venda Debito Imp Dig/Page_Assine funil simplificado  Abril.com/div_Agncia'))

WebUI.setText(findTestObject('Object Repository/Venda Debito/Venda Debito Imp Dig/Page_Assine funil simplificado  Abril.com/input_Agncia_pagamento_debito_conta_agencia'), 
    '8726')

WebUI.setText(findTestObject('Object Repository/Venda Debito/Venda Debito Imp Dig/Page_Assine funil simplificado  Abril.com/input_Conta_pagamento_debito_conta_conta'), 
    '54256')

WebUI.setText(findTestObject('Object Repository/Venda Debito/Venda Debito Imp Dig/Page_Assine funil simplificado  Abril.com/input_Dgito_pagamento_debito_conta_conta_digito'), 
    '9')

WebUI.click(findTestObject('Object Repository/Venda Debito/Venda Debito Imp Dig/Page_Assine funil simplificado  Abril.com/button_Fechar compra'))

WebUI.click(findTestObject('Object Repository/Venda Debito/Venda Debito Imp Dig/Page_Assine funil simplificado  Abril.com/section_Compra realizada com sucesso       _98e59b'))

WebUI.closeBrowser()

