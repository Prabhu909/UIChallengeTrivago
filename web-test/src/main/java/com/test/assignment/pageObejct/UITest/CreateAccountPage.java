package com.test.assignment.pageObejct.UITest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.test.assignment.testData.UITest.TestData;

public class CreateAccountPage {

	@FindBy(id = "id_gender1")
	WebElement selectGender;
	
	@FindBy(id = "customer_firstname")
	WebElement firstName;
	
	@FindBy(id = "customer_lastname")
	WebElement lastName;
	
	@FindBy(id  ="email")
	WebElement customer_Email;
	
	@FindBy(id = "passwd")
	WebElement customer_password;
	
	@FindBy(id = "days")
	WebElement selectBithDate;
	
	@FindBy(id = "months")
	WebElement select_birth_Month;
	
	@FindBy(id = "years")
	WebElement select_birth_Year;
	
	@FindBy(id = "firstname")
	WebElement addressFirstName;
	
	@FindBy(id = "lastname")
	WebElement addressLastName;
	
	@FindBy(id = "company")
	WebElement companyAddress;
	
	@FindBy(id = "address1")
	WebElement addressDetail_1;
	
	@FindBy(id = "address2")
	WebElement address_line2;
	
	@FindBy(id = "city")
	WebElement cityAddress;
	
	@FindBy(id = "id_state")
	WebElement stateAddress;
	
	@FindBy(id = "postcode")
	WebElement zipcodeAddress;
	
	@FindBy(id = "phone_mobile")
	WebElement mobile_Number;
	
	@FindBy(id = "alias")
	WebElement aliasId;
	
	@FindBy(id = "submitAccount")
	WebElement registerBTN;
	
	@FindBy(xpath = "//div[@classs='header_user_info']/a")
	WebElement verifyUserName;

	public WebElement getVerifyUserName() {
		return verifyUserName;
	}

	public void setVerifyUserName(WebElement verifyUserName) {
		this.verifyUserName = verifyUserName;
	}

	public WebElement getZipcodeAddress() {
		return zipcodeAddress;
	}

	public void setZipcodeAddress(WebElement zipcodeAddress) {
		this.zipcodeAddress = zipcodeAddress;
	}

	public WebElement getMobile_Number() {
		return mobile_Number;
	}

	public void setMobile_Number(WebElement mobile_Number) {
		this.mobile_Number = mobile_Number;
	}

	public WebElement getAliasId() {
		return aliasId;
	}

	public void setAliasId(WebElement aliasId) {
		this.aliasId = aliasId;
	}

	public WebElement getRegisterBTN() {
		return registerBTN;
	}

	public void setRegisterBTN(WebElement registerBTN) {
		this.registerBTN = registerBTN;
	}

	public WebElement getAddressFirstName() {
		return addressFirstName;
	}

	public void setAddressFirstName(WebElement addressFirstName) {
		this.addressFirstName = addressFirstName;
	}

	public WebElement getAddressLastName() {
		return addressLastName;
	}

	public void setAddressLastName(WebElement addressLastName) {
		this.addressLastName = addressLastName;
	}

	public WebElement getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(WebElement companyAddress) {
		this.companyAddress = companyAddress;
	}

	public WebElement getAddressDetail_1() {
		return addressDetail_1;
	}

	public void setAddressDetail_1(WebElement addressDetail_1) {
		this.addressDetail_1 = addressDetail_1;
	}

	public WebElement getAddress_line2() {
		return address_line2;
	}

	public void setAddress_line2(WebElement address_line2) {
		this.address_line2 = address_line2;
	}

	public WebElement getCityAddress() {
		return cityAddress;
	}

	public void setCityAddress(WebElement cityAddress) {
		this.cityAddress = cityAddress;
	}

	public WebElement getStateAddress() {
		return stateAddress;
	}

	public void setStateAddress(WebElement stateAddress) {
		this.stateAddress = stateAddress;
	}

	public WebElement getSelect_birth_Month() {
		return select_birth_Month;
	}

	public void setSelect_birth_Month(WebElement select_birth_Month) {
		this.select_birth_Month = select_birth_Month;
	}

	public WebElement getSelect_birth_Year() {
		return select_birth_Year;
	}

	public void setSelect_birth_Year(WebElement select_birth_Year) {
		this.select_birth_Year = select_birth_Year;
	}

	public WebElement getSelectGender() {
		return selectGender;
	}

	public void setSelectGender(WebElement selectGender) {
		this.selectGender = selectGender;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public WebElement getCustomer_Email() {
		return customer_Email;
	}

	public void setCustomer_Email(WebElement customer_Email) {
		this.customer_Email = customer_Email;
	}

	public WebElement getCustomer_password() {
		return customer_password;
	}

	public void setCustomer_password(WebElement customer_password) {
		this.customer_password = customer_password;
	}

	public WebElement getSelectBithDate() {
		return selectBithDate;
	}

	public void setSelectBithDate(WebElement selectBithDate) {
		this.selectBithDate = selectBithDate;
	}
	
	public WebElement selecBirthDate()
	{
		Select select = new Select(selectBithDate); 
		select.selectByValue(TestData.birth_Date);
		return selectBithDate;
	}
	
	public WebElement selecBirthMonth()
	{
		Select select = new Select(select_birth_Month); 
		select.selectByValue(TestData.birth_Month);
		return selectBithDate;
	}
	
	public WebElement selecBirthYear()
	{
		Select select = new Select(select_birth_Year); 
		select.selectByValue(TestData.birth_Year);
		return selectBithDate;
	}
	
	public WebElement selecState()
	{
		Select select = new Select(stateAddress); 
		select.selectByValue(TestData.state_value);
		return stateAddress;
	}
	
}
