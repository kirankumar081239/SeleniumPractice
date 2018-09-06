package com.pack.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public static WebElement username(WebDriver driver)
	{
		WebElement e=driver.findElement(By.id("txtuId"));
		return e;
	}
	
	public static WebElement password(WebDriver driver)
	{
		WebElement p=driver.findElement(By.id("txtPword"));
		return p;
	}
	public static WebElement loginbutton(WebDriver driver)
	{
		WebElement l=driver.findElement(By.id("login"));
		return l;
	}

}
