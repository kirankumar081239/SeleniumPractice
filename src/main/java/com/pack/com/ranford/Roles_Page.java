package com.pack.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Roles_Page {
	
	public static WebElement Roles(WebDriver driver)
	{
		WebElement s=driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img"));
		return s;
	}
	public static WebElement NewRolesb(WebDriver driver)
	{
		WebElement s=driver.findElement(By.id("btnRoles"));
		return s;
	}
	public static WebElement Role_Name(WebDriver driver)
	{
		WebElement s=driver.findElement(By.id("txtRname"));
		return s;
	}
	public static WebElement Role_Des(WebDriver driver)
	{
		WebElement s=driver.findElement(By.id("txtRDesc"));
		return s;
	}
	public static Select Role_Type(WebDriver driver)
	{
		 return new Select(driver.findElement(By.id("lstRtypeN")));
	}
	public static WebElement Submit_bu(WebDriver driver)
	{
		WebElement s=driver.findElement(By.id("btninsert"));
		return s;
	}
	

}
