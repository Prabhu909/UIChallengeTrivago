package com.test.sample.Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.assignment.actions.UIActions;
import com.test.assignment.pageObjects.BasketPage;
import com.test.assignment.pageObjects.HomePage;
import com.test.ui.hook.BaseClass;
import com.test.ui.hook.HelperClass;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;
import junit.framework.Assert;

public class UISteps extends BaseClass{
	
	private BaseClass baseClass ;
	
	public UISteps(BaseClass baseClass) {
		
		this.baseClass = baseClass;
	}
	
	
	
	
	
	@Before
	public void initializeTest() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		baseClass.driver = new ChromeDriver();
		System.out.println("Test Initialized");
	}
	@Given("^i open browser$")
	public void i_open_browser() throws Exception {
		
		HelperClass helperClass = new HelperClass(baseClass);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		helperClass.implicitlyWait();
		helperClass.maximizeWindow();
		helperClass.implicitlyWait();
		baseClass.driver.get("https://www.bergfreunde.eu/");
		
		
	}
	
	@Then("^i wait for ten seconds$")
	public void i_wait_for_loadingComplete() throws Exception {
		
		baseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Then("^i search for the product$")
	public void i_search_for_theProduct() throws Exception {
		
		HelperClass helperClass = new HelperClass(baseClass);
		UIActions uiActions = new UIActions(baseClass);
		
		helperClass.implicitlyWait();
		uiActions.searchForItem();
		
		/*JavascriptExecutor executor = (JavascriptExecutor)baseClass.driver;
		executor.executeScript("arguments[0].click()",baseClass.driver.findElement(By.xpath("//input[@type='button']/self::input")));*/
		
		baseClass.driver.findElement(By.xpath("//form[@id='f.search']/input[@type='button']")).click();
		helperClass.implicitlyWait();
		
	}
	
	@Then("^i click on the product and verify details and add the product to basket$")
	public void i_click_on_the_product_and_verify_details() throws Exception {
		
		HelperClass helperClass = new HelperClass(baseClass);
		UIActions uiActions = new UIActions(baseClass);
		BasketPage basketPage = new BasketPage(baseClass.driver);
		
		
		String price = uiActions.validateProductDetailsAndAddtheProduct();
		String basketPrice = basketPage.getBasketPrice().getText();
		String actualbasketPrice = basketPrice.replace("€ ", "");
		
		Assert.assertEquals(price, actualbasketPrice);
	}
	
	@Then("^i validate voucher code details$")
	public void i_validate_voucher_code_details() throws Exception {
		
		HelperClass helperClass = new HelperClass(baseClass);
		UIActions uiActions = new UIActions(baseClass);
		
		helperClass.implicitlyWait();
		uiActions.validateVoucherScenario();
	
	}
	
	@Then("^i validate the login options$")
	public void i_validate_the_login_options() throws Exception {
		
		HelperClass helperClass = new HelperClass(baseClass);
		UIActions uiActions = new UIActions(baseClass);
		
		uiActions.validateloginDetails();
	}

}
