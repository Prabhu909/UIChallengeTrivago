package com.test.assignment.helperClass.UITest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.assignment.pageObejct.UITest.CategoryPage;
import com.test.asssignment.baseClass.UITest.BaseClass;

public class HelperClass extends BaseClass{

	
	
	public static void implicitlyWait()
	{
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  	
	}
	
	public static void maximizeWindow()
	{
		driver.manage().window().maximize();
	}
	
	public static void explicitlyWaitForProceedToCheckout() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='layer_cart']//div[@class='button-container']/a/span")));
	}

	public static void explicitlyWaitForProceedToCheckoutOnOrderPage() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(@class,'cart_navigation')]/a[@title='Proceed to checkout']")));
	}
	
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
		
		}
}
