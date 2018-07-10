package com.test.assignment.UITestCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.assignment.helperClass.UITest.HelperClass;
import com.test.assignment.pageObejct.UITest.CategoryPage;
import com.test.assignment.pageObejct.UITest.LoginPage;
import com.test.assignment.pageObejct.UITest.MyAccountPage;
import com.test.assignment.pageObejct.UITest.OrderConfirmationPage;
import com.test.assignment.pageObejct.UITest.PaymentPage;
import com.test.assignment.testData.UITest.TestData;
import com.test.asssignment.baseClass.UITest.BaseClass;

public class CheckoutTest extends BaseClass{
	
	HelperClass helperClass;
	WebDriverWait wait;
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	MyAccountPage myAccountPage = PageFactory.initElements(driver, MyAccountPage.class);
	CategoryPage categoryPage = PageFactory.initElements(driver, CategoryPage.class);
	PaymentPage paymentPage = PageFactory.initElements(driver, PaymentPage.class);
	OrderConfirmationPage ocpPage = PageFactory.initElements(driver, OrderConfirmationPage.class);
	
	@BeforeTest
	public void openWindow()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");
	}

	@Test
	public void checkOutTest() throws IOException
	{
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
		
		myAccountPage.getWomenLink().click();
		helperClass.implicitlyWait();
		categoryPage.getFadedT_Shirt().click();
		helperClass.implicitlyWait();
		categoryPage.getFadedT_Shirt().click();
		driver.findElement(By.name("Submit")).click();
		helperClass.implicitlyWait();
		helperClass.explicitlyWaitForProceedToCheckout();
		categoryPage.getProceedToCheckOut().click();
		helperClass.implicitlyWait();
		helperClass.explicitlyWaitForProceedToCheckoutOnOrderPage();
		categoryPage.getOrderPageProceedToCheckout().click();
		helperClass.implicitlyWait();
		categoryPage.getPTCAddress().click();
		helperClass.implicitlyWait();
		categoryPage.getTermAndServices().click();
		helperClass.implicitlyWait();
		categoryPage.getPTCOnTermAndConfPage().click();
		helperClass.implicitlyWait();
		paymentPage.getBankWireTransaction().click();
		helperClass.implicitlyWait();
		paymentPage.getConfirmOrder().click();
		helperClass.implicitlyWait();
		
		Assert.assertEquals(TestData.ocpExpectedText, ocpPage.getOCPText().getText());
		Assert.assertEquals(TestData.yourOrderMessage, ocpPage.getYourOrderMessage().getText());
		Assert.assertTrue(driver.getCurrentUrl().contains(TestData.urlContains));
		helperClass.takeScreenshotAtEndOfTest();
		
	}

}
