package com.test.assignment.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage {

	
	public BasketPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "(//span[@class='totalprice padding-left right font-red'][text()='€ 134,96'][text()='€ 134,96'])[1]")
	WebElement basketPrice;

	@FindBy(xpath = "//input[@class='vouchercode']")
	WebElement voucherCode;
	
	@FindBy(xpath = "//button[@class='a-button a-button--gray right']")
	WebElement reedemButton;
	
	@FindBy(xpath = "//p[@class='error font-red highlight-3']")
	WebElement not_available_errorMessage;
	
	@FindBy(xpath = "//a[@class='close close-reveal-modal']")
	WebElement closeButton;
	
	
	@FindBy(xpath = "//ul[@id='usr-nav']/li/span")
	WebElement loginButton;
	
	@FindBy(xpath = "//input[@data-codecept='username']")
	WebElement emailField;
	
	@FindBy(xpath = "//input[@data-codecept='password']")
	WebElement passwordField;
	
	@FindBy(xpath = "//a[@id='login_create_form_show']")
	WebElement createAccountButton;

	public WebElement getCreateAccountButton() {
		return createAccountButton;
	}


	public void setCreateAccountButton(WebElement createAccountButton) {
		this.createAccountButton = createAccountButton;
	}


	public WebElement getEmailField() {
		return emailField;
	}


	public void setEmailField(WebElement emailField) {
		this.emailField = emailField;
	}


	public WebElement getPasswordField() {
		return passwordField;
	}


	public void setPasswordField(WebElement passwordField) {
		this.passwordField = passwordField;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}


	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}


	public WebElement getCloseButton() {
		return closeButton;
	}


	public void setCloseButton(WebElement closeButton) {
		this.closeButton = closeButton;
	}


	public WebElement getNot_available_errorMessage() {
		return not_available_errorMessage;
	}


	public void setNot_available_errorMessage(WebElement not_available_errorMessage) {
		this.not_available_errorMessage = not_available_errorMessage;
	}


	public WebElement getVoucherCode() {
		return voucherCode;
	}


	public void setVoucherCode(WebElement voucherCode) {
		this.voucherCode = voucherCode;
	}


	public WebElement getReedemButton() {
		return reedemButton;
	}


	public void setReedemButton(WebElement reedemButton) {
		this.reedemButton = reedemButton;
	}


	public WebElement getBasketPrice() {
		return basketPrice;
	}


	public void setBasketPrice(WebElement basketPrice) {
		this.basketPrice = basketPrice;
	}


	
	
}
