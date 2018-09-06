package testbase;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class TestBase {
	
static Properties p;
    
    public static void loadproperty()
    {
        try {
            p=new Properties();
            File f=new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\config\\OR.properties");
            
            
            FileReader fr=new FileReader(f);
            
            p.load(fr);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        
    }
    public static String  geturl1(String build)
    {
        loadproperty();
        return p.getProperty(build);
        
    }
    
    public static  String   path(String chromepath)
    {
        loadproperty();
        return p.getProperty(chromepath);
    }
    public static String username(String usern)
    {
    	loadproperty();
    	return p.getProperty(usern);
    }
    public static String password(String passw)
    {
    	loadproperty();
    	return p.getProperty(passw);
    }

}
