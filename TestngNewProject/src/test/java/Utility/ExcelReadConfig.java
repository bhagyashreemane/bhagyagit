package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import Baseclasses.factory;

public class ExcelReadConfig extends factory{
	public static List<String> getrowdata(String sheetname) throws Exception	{
	//FileInputStream is =new FileInputStream(".//mainsheet.xlsx");
		List<String> al=new ArrayList<String>(); 
		String s=System.getProperty("user.dir");
		System.out.println(s);
		//FileInputStream is =new FileInputStream("C:\\Users\\Dell\\Pictures\\TestngNewProject\\src\\test\\resources\\Excel\\mainsheet.xlsx");
		FileInputStream is =new FileInputStream(getpropertiesreadclass().getexcelpath_Login());
		Workbook workbook = WorkbookFactory.create(is);
		Sheet sheet=workbook.getSheet(sheetname);
		Row rowfull=sheet.getRow(1);
		System.out.println(rowfull.getLastCellNum());
		String arr=null;
		for(int i=0,j=0;i<rowfull.getLastCellNum();i++)
		{
		
		Cell cell=rowfull.getCell(i);
		System.out.println(cell.getStringCellValue());
		
		al.add(cell.getStringCellValue());
		// System.out.println(arr);
		}
		return al;
		
		
	}
	
	public static void main (String args[]) throws Exception
	{
		
		System.out.println(getrowdata("Login"));
		
	}
}
