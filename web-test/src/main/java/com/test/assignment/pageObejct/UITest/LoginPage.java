package com.test.assignment.pageObejct.UITest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(xpath = "//div[@class='header_user_info']/a")
	WebElement signInBTN;
	
	@FindBy(id = "email")
	WebElement existingEmailAddress;
	
	@FindBy(id = "passwd")
	WebElement existingUserPassword;
	
	@FindBy(id = "SubmitLogin")
	WebElement submitLoginBTN;

	@FindBy(id = "email_create")
	WebElement createEmail;
	
	@FindBy(id = "SubmitCreate")
	WebElement createAccount;
	
	public WebElement getCreateEmail() {
		return createEmail;
	}

	public void setCreateEmail(WebElement createEmail) {
		this.createEmail = createEmail;
	}

	public WebElement getCreateAccount() {
		return createAccount;
	}

	public void setCreateAccount(WebElement createAccount) {
		this.createAccount = createAccount;
	}

	public WebElement getSignInBTN() {
		return signInBTN;
	}

	public void setSignInBTN(WebElement signInBTN) {
		this.signInBTN = signInBTN;
	}

	public WebElement getExistingEmailAddress() {
		return existingEmailAddress;
	}

	public void setExistingEmailAddress(WebElement existingEmailAddress) {
		this.existingEmailAddress = existingEmailAddress;
	}

	public WebElement getExistingUserPassword() {
		return existingUserPassword;
	}

	public void setExistingUserPassword(WebElement existingUserPassword) {
		this.existingUserPassword = existingUserPassword;
	}

	public WebElement getSubmitLoginBTN() {
		return submitLoginBTN;
	}

	public void setSubmitLoginBTN(WebElement submitLoginBTN) {
		this.submitLoginBTN = submitLoginBTN;
	}

}
