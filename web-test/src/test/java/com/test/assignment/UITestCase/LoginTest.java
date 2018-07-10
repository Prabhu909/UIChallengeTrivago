package com.test.assignment.UITestCase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.assignment.helperClass.UITest.HelperClass;
import com.test.assignment.pageObejct.UITest.LoginPage;
import com.test.assignment.pageObejct.UITest.MyAccountPage;
import com.test.assignment.testData.UITest.TestData;
import com.test.asssignment.baseClass.UITest.BaseClass;

public class LoginTest extends BaseClass{
	
	HelperClass helperClass;
	
	//CreatePageObject
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	MyAccountPage myAccountPage = PageFactory.initElements(driver, MyAccountPage.class);
	
	@BeforeTest
	public void openWindow()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");
	}

	@Test
	public void loginTest() throws IOException {
		
		driver.get(TestData.launchURL);
		helperClass.implicitlyWait();
		helperClass.maximizeWindow();
		loginPage.getSignInBTN().click();
		helperClass.implicitlyWait();
		loginPage.getExistingEmailAddress().sendKeys(TestData.existingUserEmail);
		helperClass.implicitlyWait();
		loginPage.getExistingUserPassword().sendKeys(TestData.existingUserPassword);
		helperClass.implicitlyWait();
		loginPage.getSubmitLoginBTN().click();
		
		helperClass.implicitlyWait();
		
		Assert.assertEquals(TestData.userName, myAccountPage.getLoginUserName().getText());
		
		Assert.assertTrue(myAccountPage.getWelcomeText().getText().contains(TestData.welcome_String));
		Assert.assertEquals(TestData.headingText, myAccountPage.getMy_Account_Text().getText());
		Assert.assertTrue(myAccountPage.getLogOut().isDisplayed());
		helperClass.takeScreenshotAtEndOfTest();
		
	}
	
}
