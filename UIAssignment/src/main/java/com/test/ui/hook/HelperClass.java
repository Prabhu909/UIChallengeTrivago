package com.test.ui.hook;

import java.util.concurrent.TimeUnit;

public class HelperClass extends BaseClass{
	
	private BaseClass baseClass;

	
	public HelperClass(BaseClass baseClass) {
		
		this.baseClass = baseClass;
	}
	
	
	public  void implicitlyWait()
	{
		baseClass.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void maximizeWindow()
	{
		baseClass.driver.manage().window().maximize();
	}
	
}
