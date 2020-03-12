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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('/Users/mkriswahyudi/Downloads/fitco-d5a07d21e6764018b0382285aa17293e-signed.apk', false)

'page 1 next to page 2'
Mobile.tap(findTestObject('new user/android.view.ViewGroup0'), 0)

'page 2 next to page 3'
Mobile.tap(findTestObject('new user/android.view.ViewGroup0 (1)'), 0)

'page 3 next to move landing page'
Mobile.tap(findTestObject('new user/android.view.ViewGroup0 (1)'), 0)

'move'
Mobile.tap(findTestObject('android.view.ViewGroup0 move button'), 0)

Mobile.closeApplication()

