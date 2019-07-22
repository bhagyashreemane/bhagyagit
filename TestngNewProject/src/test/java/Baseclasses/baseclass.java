package Baseclasses;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import POM.BusesPage;
import POM.Login;
import POM.Trains;
import Utility.DriversInit;
import Utility.ExcelReadConfig;
import Utility.Extentreport;

public class baseclass extends factory  {
	@BeforeTest
	public  void loadconstantbeforetest()
	{
		System.out.println("before test");
	//	Pageobjectloader();
		
	}
@BeforeMethod
public  void loadconstantbeforemthod()
{
	System.out.println("Loggers generated");
	DriversInit.getbrowser("chrome");
	Pageobjectloader();
	//Startreport(String TestcaseName);
	
}

public void Pageobjectloader()
{
bus= PageFactory.initElements(driver,BusesPage.class);
trains=PageFactory.initElements(driver,Trains.class);
login=PageFactory.initElements(driver,Login.class);
}

public  static void loadconstant(String testcasename) throws Exception
{
	Extentreport.Startreport(testcasename);
	System.out.println("Test started");
	Excelloader();
}

private static void Excelloader() throws Exception {
	lslogin =ExcelReadConfig.getrowdata("Login");
System.out.println(lslogin);	
}
@AfterMethod(alwaysRun=true)
public void Quit()
{
	driver.close();
	driver.quit();
	driver=null;
	System.out.println("aftermethod");
	extentReport.endTest(test);
	
}
@AfterTest
public void flushresult()
{
	//driver=null;
	
	extentReport.flush();
}
}
