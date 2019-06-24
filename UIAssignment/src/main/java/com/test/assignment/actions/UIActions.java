package com.test.assignment.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.assignment.pageObjects.BasketPage;
import com.test.assignment.pageObjects.HomePage;
import com.test.assignment.pageObjects.ProductPage;
import com.test.ui.hook.BaseClass;
import com.test.ui.hook.HelperClass;

import junit.framework.Assert;

public class UIActions extends BaseClass{
	
	
	private BaseClass baseClass ;
	
	public UIActions(BaseClass baseClass) {
		
		this.baseClass = baseClass;
	}

	
	
	
	
	public void searchForItem() throws Exception {
		
		
		
		System.out.println("******************");
		
		HomePage homePage = new HomePage(baseClass.driver);
		HelperClass helperClass = new HelperClass(baseClass);
		
		homePage.getSearchBar().click();
		helperClass.implicitlyWait();
		homePage.getInputBox().sendKeys("LUNDHAGS");
		helperClass.implicitlyWait();
		//baseClass.driver.findElement(By.xpath("//input[@type='button']/self::input")).click();
		helperClass.implicitlyWait();
		//homePage.getSearchButton().click();
		
		
		
	}
	
	public String validateProductDetailsAndAddtheProduct() throws Exception {
		
		ProductPage productPage = new ProductPage(baseClass.driver);
		HelperClass helperClass = new HelperClass(baseClass);
		HomePage homePage = new HomePage(baseClass.driver);
		
		productPage.getLundhagsProduct().click();
		String productPrice = productPage.getProductPrice().getText();
		String returnp = productPage.getReturnPolicy().getText();
		String weeightValue = productPage.getWeightValue().getText();
		
		System.out.println("User Review is Displayed ---------" +productPage.getUserReview().isDisplayed());
		
		productPage.getColorSelect().click();
		helperClass.implicitlyWait();
		
		productPage.getProductSize().click();
		helperClass.implicitlyWait();
		
		
		JavascriptExecutor executor = (JavascriptExecutor)baseClass.driver;
		executor.executeScript("arguments[0].click();", productPage.getAddToCartButton());
		helperClass.implicitlyWait();
		
		
		Thread.sleep(1000);
		
		executor.executeScript("arguments[0].click();", productPage.getGoToCartButton());
		helperClass.implicitlyWait();
		
		
		Assert.assertEquals("30 days returns policy", returnp);
		Assert.assertEquals("620 g", weeightValue);
		
		System.out.println("Price is )))))))))))" +productPrice);
		System.out.println("return policy is )))))))))))" +returnp);
		System.out.println("Weight is )))))))))))" +weeightValue);
		
		homePage.getSearchBar().click();
		helperClass.implicitlyWait();
		
		homePage.getInputBox().sendKeys("LUNDHAGS");
		helperClass.implicitlyWait();
		baseClass.driver.findElement(By.xpath("//input[@type='button']")).click();
		helperClass.implicitlyWait();
		
		productPage.getLundhagsProduct().click();
		helperClass.implicitlyWait();
		
		productPage.getColorSelectTeaGreen().click();
		helperClass.implicitlyWait();
		
		productPage.getProductSize().click();
		helperClass.implicitlyWait();
		
		
		//JavascriptExecutor executor = (JavascriptExecutor)baseClass.driver;
		executor.executeScript("arguments[0].click();", productPage.getAddToCartButton());
		helperClass.implicitlyWait();
		helperClass.implicitlyWait();
		
		
		executor.executeScript("arguments[0].click();", productPage.getGoToCartButton());
		helperClass.implicitlyWait();
		
		return productPrice;
		
		
	}
	
	public void validateVoucherScenario() throws Exception {
		
		
		HelperClass helperClass = new HelperClass(baseClass);
		BasketPage basketPage = new BasketPage(baseClass.driver);
		
		helperClass.implicitlyWait();
		basketPage.getVoucherCode().sendKeys("NotAvailable ");
		helperClass.implicitlyWait();
		basketPage.getReedemButton().click();
		helperClass.implicitlyWait();
		String error_Message = basketPage.getNot_available_errorMessage().getText();
		Assert.assertEquals("YOUR VOUCHER 'NOTAVAILABLE' WAS NOT APPROVED.", error_Message);
		helperClass.implicitlyWait();
		basketPage.getCloseButton().click();
		
		
	}
	
	public void validateloginDetails() throws Exception {
		
		HelperClass helperClass = new HelperClass(baseClass);
		BasketPage basketPage = new BasketPage(baseClass.driver);
		
		basketPage.getLoginButton().click();
		helperClass.implicitlyWait();
		
		System.out.println("Email field is displayed ---------" +basketPage.getEmailField().isDisplayed());
		System.out.println("Email field is displayed ---------" +basketPage.getPasswordField().isDisplayed());
		System.out.println("Email field is displayed ---------" +basketPage.getCreateAccountButton().isDisplayed());
		
		Assert.assertTrue("Buttn present", basketPage.getEmailField().isDisplayed());
		
		
		
	}
}
