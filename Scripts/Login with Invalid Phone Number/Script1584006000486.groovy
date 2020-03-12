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

Mobile.startExistingApplication('com.twenty.fit', FailureHandling.STOP_ON_FAILURE)

'Tap Move'
Mobile.tap(findTestObject('android.view.ViewGroup0 move button'), 0)

'Tap Me\n'
Mobile.tap(findTestObject('Login/android.widget.Button0 ( ME )'), 0)

'Tap button Sign In'
Mobile.tap(findTestObject('Login/android.widget.TextView0 - ( Button Sign In )'), 0)

'Input Invalid Phone Number'
Mobile.setText(findTestObject('Login/android.widget.EditText0 ( Username form )'), '0800000000000000000000', 0)

'Input Password'
Mobile.setText(findTestObject('Login/android.widget.EditText0 ( Password Form )'), 'Fitco123', 0)

'Tap Sign Me In'
Mobile.tap(findTestObject('Login/android.view.ViewGroup0 ( sign me in )'), 0)

Mobile.closeApplication()

