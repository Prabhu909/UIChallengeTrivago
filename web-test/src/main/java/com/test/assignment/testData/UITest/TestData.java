package com.test.assignment.testData.UITest;

import java.util.Date;

public class TestData {
	
	public static final String launchURL = "http://automationpractice.com/index.php";
	public static final String existingUserEmail = "hf_challenge_123456@hf12345.com";
	public static final String existingUserPassword = "12345678";
	
	
	public static final String timeStamp = String.valueOf(new Date().getTime());
	public static final String email = "hf_challenge_" + timeStamp + "@hf" + timeStamp.substring(7) + ".com";
	public static final String name = "Firstname";
	public static final String surname = "Lastname";
	
	//Assertion Values
	public static final String userName = "Joe Black";
	public static final String welcome_String = "Welcome to your account.";
	public static final String headingText = "MY ACCOUNT";
	
	//OCP Validation
	public static final String ocpExpectedText = "ORDER CONFIRMATION";
	public static final String  yourOrderMessage = "Your order on My Store is complete.";
	public static final String  urlContains = "controller=order-confirmation";
	
	//Select Values
	public static final String birth_Date = "2";
	public static final String birth_Month = "2";
	public static final String birth_Year = "2000";
	public static final String state_value = "7";
	
	//Details
	public static final String user_firstName = "Prabhu";
	public static final String user_lastName = "Mallik";
	public static final String user_password = "newPass";
	public static final String firstName = "MyName";
	public static final String lastName = "Noname";
	public static final String company_Name = "newCompany";
	public static final String addressLine_1 = "newAddres";
	public static final String addressLine_2 = "oldAddres";
	public static final String city_Name = "newCity";
	public static final String zopcode = "60601";
	public static final String mobile_Number = "9856231452";
	public static final String alias_address = "MyName@noname.com";
	
	public static final String my_Account_URL_Contains = "controller=my-account";
	
}
