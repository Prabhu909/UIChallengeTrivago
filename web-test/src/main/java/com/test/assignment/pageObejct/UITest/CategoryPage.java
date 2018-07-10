package com.test.assignment.pageObejct.UITest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPage {
	
	@FindBy(xpath = "//a[@title='Faded Short Sleeve T-shirts']/ancestor::li")
	WebElement fadedT_Shirt;
	
	@FindBy(name = "Submit")
	WebElement addToCartBTN;
	
	@FindBy(xpath = "//div[@id='layer_cart']//div[@class='button-container']/a/span")
	WebElement proceedToCheckOut;
	
	@FindBy(xpath = "//p[contains(@class,'cart_navigation')]/a[@title='Proceed to checkout']")
	WebElement orderPageProceedToCheckout;

	@FindBy(name = "processAddress")
	WebElement PTCAddress;
	
	@FindBy(id = "cgv")
	WebElement termAndServices;
	
	@FindBy(name = "processCarrier")
	WebElement PTCOnTermAndConfPage;
	
	
	
	public WebElement getPTCOnTermAndConfPage() {
		return PTCOnTermAndConfPage;
	}

	public void setPTCOnTermAndConfPage(WebElement pTCOnTermAndConfPage) {
		PTCOnTermAndConfPage = pTCOnTermAndConfPage;
	}

	public WebElement getTermAndServices() {
		return termAndServices;
	}

	public void setTermAndServices(WebElement termAndServices) {
		this.termAndServices = termAndServices;
	}

	public WebElement getPTCAddress() {
		return PTCAddress;
	}

	public void setPTCAddress(WebElement pTCAddress) {
		PTCAddress = pTCAddress;
	}

	public WebElement getOrderPageProceedToCheckout() {
		return orderPageProceedToCheckout;
	}

	public void setOrderPageProceedToCheckout(WebElement orderPageProceedToCheckout) {
		this.orderPageProceedToCheckout = orderPageProceedToCheckout;
	}

	public WebElement getAddToCartBTN() {
		return addToCartBTN;
	}

	public void setAddToCartBTN(WebElement addToCartBTN) {
		this.addToCartBTN = addToCartBTN;
	}

	public WebElement getProceedToCheckOut() {
		return proceedToCheckOut;
	}

	public void setProceedToCheckOut(WebElement proceedToCheckOut) {
		this.proceedToCheckOut = proceedToCheckOut;
	}

	public WebElement getFadedT_Shirt() {
		return fadedT_Shirt;
	}

	public void setFadedT_Shirt(WebElement fadedT_Shirt) {
		this.fadedT_Shirt = fadedT_Shirt;
	}

}
