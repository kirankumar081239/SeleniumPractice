package com.pack.com.ranford;

import org.openqa.selenium.WebDriver;

public class Generic {

	public static void AlertHandle(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
}
