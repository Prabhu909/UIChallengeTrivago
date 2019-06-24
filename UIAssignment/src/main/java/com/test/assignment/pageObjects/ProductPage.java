package com.test.assignment.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.test.ui.hook.HelperClass;

public class ProductPage {
	
	public ProductPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//img[@class='product-image'])[1]")
	WebElement lundhagsProduct;
	
	@FindBy(xpath = "(//span[text()='134,96'])[1]")
	WebElement productPrice;
	
	@FindBy(xpath = "//div[@class='small-3 columns'][3]")
	WebElement returnPolicy;
	
	@FindBy(xpath = "//dd[@class='attr-value'][text()='620 g']")
	WebElement  weightValue;
	
	@FindBy(xpath = "(//div[@class='small-12 medium-10 large-10 columns contribution-box-content triangle'])")
	WebElement userReview;
	
	@FindBy(xpath = "//ul[@id='js-varlist-color']/li[@data-varsel='Black']")
	WebElement colorSelect;
	
	@FindBy(xpath = "//ul[@id='js-varlist-color']/li[@data-varsel='Tea Green']")
	WebElement colorSelectTeaGreen;
	
	
	@FindBy(xpath = "//ul[@id='js-varlist-size']/li[@data-varsel='D100 - Short / Wide']")
	WebElement productSize;
	
	@FindBy(xpath = "//button[@class='a-button a-button--green     tobasket js-tobasket-trigger a-button--large bold js-lightbox has-tip tip-top']")
	WebElement addToCartButton;
	
	@FindBy(xpath = "//button[@title='go to cart']")
	WebElement goToCartButton;
	
	public WebElement getColorSelectTeaGreen() {
		return colorSelectTeaGreen;
	}

	public void setColorSelectTeaGreen(WebElement colorSelectTeaGreen) {
		this.colorSelectTeaGreen = colorSelectTeaGreen;
	}

	public WebElement getGoToCartButton() {
		return goToCartButton;
	}

	public void setGoToCartButton(WebElement goToCartButton) {
		this.goToCartButton = goToCartButton;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public void setAddToCartButton(WebElement addToCartButton) {
		this.addToCartButton = addToCartButton;
	}

	public WebElement getProductSize() {
		return productSize;
	}

	public void setProductSize(WebElement productSize) {
		this.productSize = productSize;
	}

	public WebElement getColorSelect() {
		return colorSelect;
	}

	public void setColorSelect(WebElement colorSelect) {
		this.colorSelect = colorSelect;
	}

	public WebElement getUserReview() {
		return userReview;
	}

	public void setUserReview(WebElement userReview) {
		this.userReview = userReview;
	}

	public WebElement getWeightValue() {
		return weightValue;
	}

	public void setWeightValue(WebElement weightValue) {
		this.weightValue = weightValue;
	}

	public WebElement getReturnPolicy() {
		return returnPolicy;
	}

	public void setReturnPolicy(WebElement returnPolicy) {
		this.returnPolicy = returnPolicy;
	}

	public WebElement getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(WebElement productPrice) {
		this.productPrice = productPrice;
	}

	public WebElement getLundhagsProduct() {
		return lundhagsProduct;
	}

	public void setLundhagsProduct(WebElement lundhagsProduct) {
		this.lundhagsProduct = lundhagsProduct;
	}

	

}
