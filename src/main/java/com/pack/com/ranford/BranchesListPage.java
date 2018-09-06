package com.pack.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BranchesListPage {
	
	public static WebElement search(WebDriver driver)
	{
		WebElement s=driver.findElement(By.id("lst_countryS"));
		return s;
	}
	public static Select Countryc(WebDriver driver)
	{
		 return new Select(driver.findElement(By.id("lst_countryS")));
	}
	public static Select States(WebDriver driver)
	{
		 return new Select(driver.findElement(By.id("lst_stateS")));
	}
	public static Select Cityc(WebDriver driver)
	{
		 return new Select(driver.findElement(By.id("lst_cityS")));		
	}
	public static WebElement Searchb(WebDriver driver) 
	{
		WebElement n=driver.findElement(By.id("btn_search"));
		return n;
	}

}
