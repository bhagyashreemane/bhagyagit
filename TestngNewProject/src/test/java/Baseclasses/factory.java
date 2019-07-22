package Baseclasses;

import java.io.IOException;

import Utility.DateAndtime;
import Utility.DriversInit;
import Utility.ExcelReadConfig;
import Utility.Extentreport;
import Utility.PropertiesRead;
//import Utility.Screenshotcapture;
import Utility.WaitMethod;

public class factory extends GlobalVariables{

	
public static ExcelReadConfig excelReadConfig;
public static PropertiesRead propertiesRead;
public static Extentreport report;
public static DateAndtime daetandtime;
public static DriversInit driverInit;
public static WaitMethod waitmethod;


//public static Screenshotcapture screenshotcapture;
public  ExcelReadConfig getexcelreadconfigclass()
{
		if (excelReadConfig==null)
		{
			excelReadConfig=new ExcelReadConfig();
			
		}
		return excelReadConfig;
}
public  static PropertiesRead getpropertiesreadclass() 
{
		if (propertiesRead==null)
		{
			propertiesRead=new PropertiesRead();
			
		}
		return propertiesRead;
}
/*public  Screenshotcapture getscreencapture()
{
		if (screenshotcapture==null)
		{
			screenshotcapture=new Screenshotcapture();
			
		}
		return screenshotcapture;
}*/
public  Extentreport  getreportclass()
{
		if (report==null)
		{
			report=new Extentreport();
			
		}
		return report;
}
public  DateAndtime  getDateAndtimeclass()
{
		if (daetandtime==null)
		{
			daetandtime=new DateAndtime();
			
		}
		return daetandtime;
}
public  DriversInit  getDriver()
{
		
		if (driverInit==null)
		{
			driverInit=new DriversInit();
			
		}
		return driverInit;
}
public  WaitMethod  getWaitmethod()
{
		
		if (waitmethod==null)
		{
			waitmethod=new WaitMethod();
			
		}
		return waitmethod;
}

}
