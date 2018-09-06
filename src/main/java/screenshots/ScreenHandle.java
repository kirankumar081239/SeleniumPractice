package screenshots;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class ScreenHandle {
	
	public static void screenshot(WebDriver driver,String screenshotname)
	{
		try {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("./Screens/"+screenshotname+".png"));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
}
	public static void Alerthandle(String screenshortname)
	{
		try {
			Robot r=new Robot();
			
			BufferedImage br=r.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			
			ImageIO.write(br, "jpg", new File("./Screens/"+screenshortname+".jpg"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
	}
}
