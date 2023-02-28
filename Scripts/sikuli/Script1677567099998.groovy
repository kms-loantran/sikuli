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
import org.sikuli.script.Screen
import org.sikuli.script.Key
import org.sikuli.script.FindFailed
import org.sikuli.script.ImagePath


String currentDir = System.getProperty("user.dir")

Windows.startApplicationWithTitle(currentDir + '\\PuTTY\\putty.exe', '')


Screen screen = new Screen()

screen.wait((double)1.0)

String proDir = currentDir + "\\Screenshots\\Sikuli\\"

screen.click(proDir + "Logging_TreeItem.PNG")

screen.click(proDir + "BrowserBtn.PNG")

Address_Bar_Path = proDir +  "AddressBar.PNG"

screen.type(Address_Bar_Path) //type text into the fielad is getting focused (the text here is the path to the the image)


Windows.delay(1)

String SaveBtn = proDir + "SaveBtn.PNG"
screen.click(SaveBtn)

Windows.closeApplication()

