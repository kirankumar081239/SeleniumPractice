package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;


public class Excel {

	static Workbook wb;
	static Sheet sh;
	static WritableWorkbook wwb;
	static WritableSheet wsh;
	public static String folderpath = "E:\\data\\";

	public static void excelconnection(String filename, String sheetname) {
		try {
			File f = new File(folderpath + filename);

			wb = Workbook.getWorkbook(f);

			sh = wb.getSheet(sheetname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static int rcount() {
		return sh.getRows();
	}

	public static int ccount() {
		return sh.getColumns();
	}

	public static String readdata(int col, int row) {
		return sh.getCell(col, row).getContents();
	}
	
	public static void outputexcelconnection(String ifilename,String ofilename, String sheetname)
	{
		try {
			FileInputStream fis=new FileInputStream(folderpath+ifilename);
			
			wb=Workbook.getWorkbook(fis);
			sh=wb.getSheet(sheetname);
			
			FileOutputStream fos=new FileOutputStream(folderpath+ofilename);
			wwb=Workbook.createWorkbook(fos,wb);
			wsh=wwb.getSheet(sheetname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	public static void writedata(int col,int row,String data)
	{
		try {
			Label l=new Label(col,row,data);
			wsh.addCell(l);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	public static void saveworkbook()
	{
		try {
			wwb.write();
			wwb.close();
			wb.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
