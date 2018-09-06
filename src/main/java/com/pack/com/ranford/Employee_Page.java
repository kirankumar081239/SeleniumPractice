package com.pack.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Employee_Page {
	
	public static WebElement Employee(WebDriver driver)
	{
			WebElement s=driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img"));
			return s;
	}
	public static WebElement New_Employee(WebDriver driver)
	{
			WebElement s=driver.findElement(By.id("BtnNew"));
			return s;
	}
	public static WebElement Employee_Name(WebDriver driver)
	{
			WebElement s=driver.findElement(By.id("txtUname"));
			return s;
	}
	public static WebElement Login_Password(WebDriver driver)
	{
			WebElement s=driver.findElement(By.id("txtLpwd"));
			return s;
	}
	public static Select Role(WebDriver driver)
	{
		return new Select(driver.findElement(By.id("lst_Roles")));
	}
	public static Select Branch(WebDriver driver)
	{
		return new Select(driver.findElement(By.id("lst_Branch")));
	}
	public static WebElement Submit_b(WebDriver driver)
	{
			WebElement s=driver.findElement(By.id("BtnSubmit"));
			return s;
	}

}
