package com.test.assignment.UITestCase;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.assignment.helperClass.UITest.HelperClass;
import com.test.assignment.pageObejct.UITest.CreateAccountPage;
import com.test.assignment.pageObejct.UITest.LoginPage;
import com.test.assignment.pageObejct.UITest.MyAccountPage;
import com.test.assignment.testData.UITest.TestData;
import com.test.asssignment.baseClass.UITest.BaseClass;

public class SignInTest extends BaseClass{
	

	HelperClass helperClass;
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	CreateAccountPage createAccountPage = PageFactory.initElements(driver, CreateAccountPage.class);
	MyAccountPage myAccountPage = PageFactory.initElements(driver, MyAccountPage.class);
	
	
	@BeforeTest
	public void openWindow()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");
	}
	
	@Test
	public void signInTest() throws IOException
	{
		driver.get(TestData.launchURL);
		helperClass.implicitlyWait();
		helperClass.maximizeWindow();
		helperClass.implicitlyWait();
		loginPage.getSignInBTN().click();
		loginPage.getCreateEmail().sendKeys(TestData.email);
		helperClass.implicitlyWait();
		loginPage.getCreateAccount().click();
		helperClass.implicitlyWait();
		
		createAccountPage.getSelectGender().click();
		helperClass.implicitlyWait();
		createAccountPage.getFirstName().sendKeys(TestData.user_firstName);
		helperClass.implicitlyWait();
		createAccountPage.getLastName().sendKeys(TestData.user_lastName);
		helperClass.implicitlyWait();
		
		helperClass.implicitlyWait();
		createAccountPage.getCustomer_password().sendKeys(TestData.user_password);
		helperClass.implicitlyWait();
		createAccountPage.selecBirthDate();
		helperClass.implicitlyWait();
		createAccountPage.selecBirthMonth();
		helperClass.implicitlyWait();
		createAccountPage.selecBirthYear();
		helperClass.implicitlyWait();
		createAccountPage.getAddressFirstName().sendKeys(TestData.firstName);
		helperClass.implicitlyWait();
		createAccountPage.getAddressLastName().sendKeys(TestData.lastName);
		helperClass.implicitlyWait();
		createAccountPage.getCompanyAddress().sendKeys(TestData.company_Name);
		helperClass.implicitlyWait();
		createAccountPage.getAddressDetail_1().sendKeys(TestData.addressLine_1);
		helperClass.implicitlyWait();
		createAccountPage.getAddress_line2().sendKeys(TestData.addressLine_2);
		helperClass.implicitlyWait();
		createAccountPage.getCityAddress().sendKeys(TestData.city_Name);
		helperClass.implicitlyWait();
		createAccountPage.selecState();
		helperClass.implicitlyWait();
		createAccountPage.getZipcodeAddress().sendKeys(TestData.zopcode);
		helperClass.implicitlyWait();
		createAccountPage.getMobile_Number().sendKeys(TestData.mobile_Number);
		helperClass.implicitlyWait();
		createAccountPage.getAliasId().sendKeys(TestData.alias_address);
		helperClass.implicitlyWait();
		createAccountPage.getRegisterBTN().click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains(TestData.my_Account_URL_Contains));
		Assert.assertTrue(myAccountPage.getLogOut().isDisplayed());
		Assert.assertTrue(myAccountPage.getWelcomeText().getText().contains(TestData.welcome_String));
		helperClass.takeScreenshotAtEndOfTest();
	}

}
