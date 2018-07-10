package com.test.assignment.pageObejct.UITest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationPage {
	
	@FindBy(xpath = "//div[@id = 'center_column']/h1")
	WebElement OCPText;
	
	@FindBy(xpath = "//p[@class='cheque-indent']/strong")
	WebElement yourOrderMessage;

	public WebElement getOCPText() {
		return OCPText;
	}

	public void setOCPText(WebElement oCPText) {
		OCPText = oCPText;
	}

	public WebElement getYourOrderMessage() {
		return yourOrderMessage;
	}

	public void setYourOrderMessage(WebElement yourOrderMessage) {
		this.yourOrderMessage = yourOrderMessage;
	}

}
