package com.pack.com.ranford;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import excel.Excel;
import screenshots.ScreenHandle;

public class TestExecution extends Repository {
	
	@Parameters({"browser"})
	@BeforeTest
	public void Verifybrowserlaunch(String browser)
	{
		Launch(browser);
	}
    
	@Test(priority=1)
	public void Verifylogin()
	{
		Login();
	}
	@Test(priority=2)
	public void Verifybranches()
	{
		Branches();
	}
	@Test(priority=3)
	public void Verifysearchbranches()
	{
		Branchsearch();
	}
	/*@Test(priority=4,dataProvider="branchdata")
	public void Verifynewbranche(String bname,String address,String zipcode,String country,String state,String city) throws InterruptedException
	{
		NewBranch(bname,address,zipcode,country,state,city);
	}
	@Test(priority=5,dataProvider="roledata")
	public void VerifyNewRole(String rname,String rtype)
	{
		NewRole(rname,rtype);
	}*/
	/*@Test(priority=6,dataProvider="empdata")
	public void VerifyEmpCreation(String ename,String lpass,String role,String branch)
	{
		Emplyee_Creation(ename,lpass,role,branch);
	}*/
    @Test(priority=10)
    public void Verifybrowserclose()
    {
	    Browserclose();
    }
    /*@DataProvider(name="branchdata")
    public Object[][] verifyexcel()
    {
    	return exclcontent("Ranford Test Data1.xls", "Branches");
    }
    @DataProvider(name="roledata")
    public Object[][] verifyexcelroledata()
    {
    	return exclcontent("Ranford Test Data1.xls", "Roles");
    }*/
    @DataProvider(name="empdata")
   /* public Object[][] verifyexcelempdata()
    {
    	return exclcontent("Ranford Test Data1.xls", "Employees");
    }*/
    
    
    @Test(priority=4)
    public void excelcontent() throws InterruptedException {
        Excel.excelconnection("Ranford Test Data1.xls", "Branches");

        Excel.outputexcelconnection("Ranford Test Data1.xls", "write.xls", "Branches");

        for (int i = 1; i < Excel.rcount(); i++) {
        	NewBranch(Excel.readdata(0, i), Excel.readdata(1, i), Excel.readdata(2, i), Excel.readdata(3, i),
                    Excel.readdata(4, i), Excel.readdata(5, i));

            String text = driver.switchTo().alert().getText();
            ScreenHandle.Alerthandle("screenshortname");

            Generic.AlertHandle(driver);

            if (text.contains("created success")) {
                Excel.writedata(6, i, "pass");
            } else if (text.contains("already exist")) {
                Excel.writedata(6, i, "failed");
            } else {
                Excel.writedata(6, i, "n/a");
            }
        }
        Excel.saveworkbook();
    }

    
    @Test(priority=5)
    public void excelrolecontent() {
        Excel.excelconnection("Ranford Test Data1.xls", "Roles");

        Excel.outputexcelconnection("Ranford Test Data1.xls", "write.xls", "Roles");

        for (int i = 1; i < Excel.rcount(); i++) {
        	NewRole(Excel.readdata(0, i), Excel.readdata(1, i));

            String text = driver.switchTo().alert().getText();
            ScreenHandle.Alerthandle("newrole");

            Generic.AlertHandle(driver);

            if (text.contains("created success")) {
                Excel.writedata(2, i, "pass");
            } else if (text.contains("already exist")) {
                Excel.writedata(2, i, "failed");
            } else {
                Excel.writedata(2, i, "n/a");
            }
        }
        Excel.saveworkbook();

    }

    @Test(priority=6)
    public void excelemployeescontent() {
        Excel.excelconnection("Ranford Test Data1.xls", "Employees");

        Excel.outputexcelconnection("Ranford Test Data1.xls", "write.xls", "Employees");

        for (int i = 1; i < Excel.rcount(); i++) {
        	Emplyee_Creation(Excel.readdata(0, i), Excel.readdata(1, i), Excel.readdata(2, i), Excel.readdata(3, i));

            String text = driver.switchTo().alert().getText();

            Generic.AlertHandle(driver);

            if (text.contains("created success")) {
                Excel.writedata(4, i, "pass");
            } else if (text.contains("already exist")) {
                Excel.writedata(4, i, "failed");
            } else {
                Excel.writedata(4, i, "n/a");
            }
        }
        Excel.saveworkbook();

    }
    
}


