package com.pack.com.ranford;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.gargoylesoftware.htmlunit.AlertHandler;

import excel.Excel;
import screenshots.ScreenHandle;
import testbase.TestBase;


public class Repository extends TestBase {
	
	 WebDriver driver;
		 
	 
	public void Launch( String brow)
	{
		if(brow.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(brow.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", path("chromepath"));
		//System.setProperty("webdriver.gecko.driver","F:\\test\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		driver= new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.manage().window().maximize();
		
		
		
		
		driver.get(geturl1("build1"));
		ScreenHandle.screenshot(driver, "launch");
		//driver.get("http://srssprojects.in/home.aspx");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void Login() 
	{
		HomePage.username(driver).sendKeys(username("username"));
		HomePage.password(driver).sendKeys(password("pass"));
		HomePage.loginbutton(driver).click();
		ScreenHandle.screenshot(driver, "Login");
	}
	
	public void Branches()
	{
		AdminHomePage.branches(driver).click();
	}
	public void Branchsearch()
	{
		
		BranchesListPage.Countryc(driver).selectByIndex(1);
		BranchesListPage.States(driver).selectByIndex(1);
		BranchesListPage.Cityc(driver).selectByIndex(1);
		BranchesListPage .Searchb(driver).click();
		ScreenHandle.screenshot(driver, "branchsearch");
	}
	
	public void NewBranch(String bname,String address,String zipcode,String country,String state,String city) throws InterruptedException
	{
		NewBranch.newbranchcreation(driver).click();
		NewBranch.Branchname(driver).sendKeys(bname);
		Generic.AlertHandle(driver);
		NewBranch.Address1(driver).sendKeys(address);
		NewBranch .ZipCode(driver).sendKeys(zipcode);
		NewBranch.Countryc(driver).selectByVisibleText(country);
		NewBranch.States(driver).selectByVisibleText(state);
		NewBranch.Cityc(driver).selectByVisibleText(city);
		NewBranch.Submitb(driver).click();
		ScreenHandle.Alerthandle("newbranch");
		//Generic.AlertHandle(driver);
	}
	
	public void NewRole(String rname,String rtype)
	{
		Roles_Page.Roles(driver).click();
		Roles_Page.NewRolesb(driver).click();
		Roles_Page.Role_Name(driver).sendKeys(rname);
		//Roles_Page.Role_Des(driver).sendKeys("This is my New Role Des");
		Roles_Page.Role_Type(driver).selectByVisibleText(rtype);
		Roles_Page.Submit_bu(driver).click();
		ScreenHandle.Alerthandle("newrole");
		//Generic.AlertHandle(driver);
	}
	public void Emplyee_Creation(String ename,String lpass,String role,String branch)
	{
		Employee_Page.Employee(driver).click();
		Employee_Page.New_Employee(driver).click();
		Employee_Page.Employee_Name(driver).sendKeys(ename);
		Employee_Page.Login_Password(driver).sendKeys(lpass);
		Employee_Page.Role(driver).selectByVisibleText(role);
		Employee_Page.Branch(driver).selectByVisibleText(branch);
		Employee_Page.Submit_b(driver).click();
		//Generic.AlertHandle(driver);
	}
	
	public void Browserclose()
	{
		driver.quit();
	}
	
	public Object[][] exclcontent(String filename,String sheetname)
	{
		Excel.excelconnection(filename, sheetname);
		
		int rc=Excel.rcount();
		
		int cc=Excel.ccount();
		
		String[][] data=new String[rc-1][cc];
		
		for(int r=1;r<rc;r++)
		{
			for(int c=0;c<cc;c++)
			{
				data[r-1][c]=Excel.readdata(c, r);
				
			}
		}
		return data;
	}
	
	
	

}
