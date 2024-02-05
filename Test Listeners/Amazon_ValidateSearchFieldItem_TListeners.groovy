import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class Amazon_ValidateSearchFieldItem_TListeners {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestCase
	def sampleBeforeTestCase() {
		
		
		WebUI.selectOptionByLabel(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/Page_Amazon.com. Spend less. Smile more/CategoryElement'),
			'Books', false)
		
		WebUI.setText(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_field-keywords'),
			'da vinci code')
		
		WebUI.click(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_nav-search-submit-button'))
		
		
		unchecked = WebUI.verifyElementNotChecked(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/Page_Amazon.com  da vinci code/checkbox'),
			0)
		
		if (unchecked == true) {
			WebUI.check(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/Page_Amazon.com  da vinci code/checkbox'))
		}
		
		//println testCaseContext.getTestCaseId()
		//println testCaseContext.getTestCaseVariables()
	}
}