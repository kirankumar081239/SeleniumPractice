package keyword;

import org.openqa.selenium.By;

public class LocatorReprository {
	
	
		
		public static By  locvalue(String locprop,String locvalue)
		{
			
			By loc=null;
			
			switch (locprop) {
			
			case "id":
				
				loc=By.id(locvalue);
				break;
				
			case "xpath":
				
				loc=By.xpath(locvalue);
			   break;
			case "name":
				
				loc=By.name(locvalue);
				break;
				
				default :
					
					loc=null;
					break;
			}
			return loc;
			
			
		}


	}

