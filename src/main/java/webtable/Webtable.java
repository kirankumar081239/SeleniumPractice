package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Webtable {
	
	 public static void Handletable(WebDriver driver,String operation)
	    {
	        boolean flag=false;
	        WebElement table=driver.findElement(By.id("DG_bankdetails"));
	        
	        List<WebElement> rows=table.findElements(By.tagName("tr"));
	        
	        String[] pagelinks=rows.get(rows.size()-1).getText().split(" ");
	        
	        for(int i=1;i<pagelinks.length;i++)
	        {
	            table=driver.findElement(By.id("DG_bankdetails"));
	             rows=table.findElements(By.tagName("tr"));
	             
	             for(WebElement row:rows)
	             {
	                List<WebElement> columns=row.findElements(By.tagName("td"));
	                
	                for(WebElement col:columns)
	                {
	                    if(col.getText().matches("147"))
	                    {
	                        
	                        if(operation.equalsIgnoreCase("edit"))
	                        {
	                            columns.get(columns.size()-2).findElement(By.tagName("a")).click();
	                            
	                            
	                        }
	                        else if(operation.equalsIgnoreCase("delete"))
	                        {
	                            columns.get(columns.size()-1).findElement(By.tagName("a")).click();
	                        }
	                        
	                        flag=true;
	                        break;
	                    }
	                
	                }
	                
	                if(flag==true)
	                {
	                    break;
	                }
	             }
	             
	             if(flag==true)
	                {
	                    break;
	                }
	             
	             
	             if(pagelinks[i].contains("..."))
	             {
	                 driver.findElement(By.xpath("//a[contains(.,'...')][2]")).click();
	             }
	             else
	             {
	                 table.findElement(By.linkText(pagelinks[i])).click();
	             }
	        }
	        
	    }
}
