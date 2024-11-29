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

WebUI.navigateToUrl('https://www.storial.co/')

WebUI.click(findTestObject('Object Repository/storial.co/Page_Storial.co Baca Novel Online Gratis da_ab9eda/button_Login  Signup'))

WebUI.setText(findTestObject('Object Repository/storial.co/Page_Storial.co Baca Novel Online Gratis da_ab9eda/input_Atau_username'), 
    'pecintasastra55@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/storial.co/Page_Storial.co Baca Novel Online Gratis da_ab9eda/input_Atau_password'), 
    '8rnxVmT9pieEqmmF1SkAqw==')

WebUI.click(findTestObject('Object Repository/storial.co/Page_Storial.co Baca Novel Online Gratis da_ab9eda/button_Masuk'))

WebUI.click(findTestObject('Object Repository/storial.co/Page_Storial.co Baca Novel Online Gratis da_ab9eda/img_Lanjut Membaca_ui centered fluid image'))

WebUI.click(findTestObject('Object Repository/storial.co/Page_Satu/i_Lihat lebih banyak komentar_bars icon'))

WebUI.click(findTestObject('Object Repository/storial.co/Page_Satu/strong_Dua'))

WebUI.click(findTestObject('Object Repository/storial.co/Page_Dua/p_GueTbOalGd baruTBmfY maumRrnOYohU meningg_2314dd'))

