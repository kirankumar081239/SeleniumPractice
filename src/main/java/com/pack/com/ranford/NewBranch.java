package com.pack.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewBranch {
	
	public static WebElement newbranchcreation(WebDriver driver) 
	{
		WebElement n=driver.findElement(By.id("BtnNewBR"));
		return n;
		
	}
	
	public static WebElement Branchname(WebDriver driver) 
	{
		WebElement n=driver.findElement(By.id("txtbName"));
		return n;
		
	}
	public static WebElement Address1(WebDriver driver) 
	{
		WebElement n=driver.findElement(By.id("txtAdd1"));
		return n;
		
	}
	public static WebElement ZipCode(WebDriver driver) 
	{
		WebElement n=driver.findElement(By.id("txtZip"));
		return n;
		
	}
	public static Select Countryc(WebDriver driver)
	{
		 return new Select(driver.findElement(By.id("lst_counrtyU")));
		
	}
	public static Select States(WebDriver driver)
	{
		 return new Select(driver.findElement(By.id("lst_stateI")));
		
	}
	public static Select Cityc(WebDriver driver)
	{
		 return new Select(driver.findElement(By.id("lst_cityI")));
		
	}
	public static WebElement Submitb(WebDriver driver) 
	{
		WebElement n=driver.findElement(By.id("btn_insert"));
		return n;
	}
	

}
