package com.test.assignment.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(xpath = "//div[@class='searchfield show-for-large-up']")
	WebElement searchBar;
	
	@FindBy(xpath = "//input[@itemprop='query-input']")
	WebElement inputBox;
	
	public WebElement getInputBox() {
		return inputBox;
	}

	public void setInputBox(WebElement inputBox) {
		this.inputBox = inputBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}

	@FindBy(xpath = "//input[@type='button']/self::input")
	WebElement searchButton;
	
	
	public WebElement getSearchBar() {
		return searchBar;
	}

	public void setSearchBar(WebElement searchBar) {
		this.searchBar = searchBar;
	}
	
	
	
}
