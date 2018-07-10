package com.test.assignment.pageObejct.UITest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage {

	@FindBy(className = "bankwire")
	WebElement bankWireTransaction;
	
	@FindBy(xpath = "//p[@id = 'cart_navigation']/button")
	WebElement confirmOrder;

	public WebElement getBankWireTransaction() {
		return bankWireTransaction;
	}

	public void setBankWireTransaction(WebElement bankWireTransaction) {
		this.bankWireTransaction = bankWireTransaction;
	}

	public WebElement getConfirmOrder() {
		return confirmOrder;
	}

	public void setConfirmOrder(WebElement confirmOrder) {
		this.confirmOrder = confirmOrder;
	}
	
}
