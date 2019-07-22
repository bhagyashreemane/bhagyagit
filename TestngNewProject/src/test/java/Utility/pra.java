package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class pra {
	public static void main(String Args[]) throws InvalidFormatException, IOException
	{
			String path=System.getProperty("user.dir")+"\\src\\test\\resources\\Excel\\Login.xlsx";
			//FileInputStream is =new FileInputStream(".//mainsheet.xlsx");
				List<String> al=new ArrayList<String>(); 
				String s=System.getProperty("user.dir");
				System.out.println(s);
				//FileInputStream is =new FileInputStream("C:\\Users\\Dell\\Pictures\\TestngNewProject\\src\\test\\resources\\Excel\\mainsheet.xlsx");
				FileInputStream is =new FileInputStream(path);
				Workbook workbook = WorkbookFactory.create(is);
				Sheet sheet=workbook.getSheet("Login");
				Row rowfull=sheet.getRow(1);
				System.out.println(rowfull.getLastCellNum());
				String arr=null;
				for(int i=0,j=0;i<rowfull.getLastCellNum();i++)
				{
				
				Cell cell=rowfull.getCell(i);
				al.add(cell.getStringCellValue());
								}
				System.out.println(al.toString());

    
}
}
