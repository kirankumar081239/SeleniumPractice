package keyword;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import excel.Excel;

public class Keyboradframe {
	
	
WebDriver driver;
	
	
	public void f()
	{
		Excel.excelconnection("Keyword Data.xls", "Sheet1");
		
		for(int i=1;i<Excel.rcount();i++)
		{
			String locprop=Excel.readdata(2, i);
			String locvalue=Excel.readdata(3, i);
			String keyword=Excel.readdata(4, i);
			String data=Excel.readdata(5, i);
			
			switch(keyword)
			{
			case "Editbox":
				
				driver.findElement(LocatorReprository.locvalue(locprop, locvalue)).sendKeys(data);
				break;
				
			case "Btn":
				
				driver.findElement(LocatorReprository.locvalue(locprop, locvalue)).click();
				break;
			case "wait":
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				break;

			}
			
		}
	}
	public void launch()
	{
		
	}

}
