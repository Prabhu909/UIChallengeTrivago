package com.test.assignment.pageObejct.UITest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage {
	
	@FindBy(xpath = "//a[@title='View my customer account']/span")
	WebElement loginUserName;
	
	@FindBy(xpath = "//div[@id='center_column']/h1")
	WebElement my_Account_Text;
	
	@FindBy(xpath = "//p[contains(text(),'Welcome to your account.')]")
	WebElement welcomeText;
	
	@FindBy(xpath = "//a[@title='Log me out']")
	WebElement logOut;

	@FindBy(linkText = "Women")
	WebElement womenLink;
	
	public WebElement getWomenLink() {
		return womenLink;
	}

	public void setWomenLink(WebElement womenLink) {
		this.womenLink = womenLink;
	}

	public WebElement getLogOut() {
		return logOut;
	}

	public void setLogOut(WebElement logOut) {
		this.logOut = logOut;
	}

	public WebElement getLoginUserName() {
		return loginUserName;
	}

	public void setLoginUserName(WebElement loginUserName) {
		this.loginUserName = loginUserName;
	}

	public WebElement getMy_Account_Text() {
		return my_Account_Text;
	}

	public void setMy_Account_Text(WebElement my_Account_Text) {
		this.my_Account_Text = my_Account_Text;
	}

	public WebElement getWelcomeText() {
		return welcomeText;
	}

	public void setWelcomeText(WebElement welcomeText) {
		this.welcomeText = welcomeText;
	}

}
