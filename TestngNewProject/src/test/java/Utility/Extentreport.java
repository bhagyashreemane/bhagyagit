package Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

//import com.relevantcodes.extentreports.*;
//import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.ExtentReports;

import com.relevantcodes.extentreports.ExtentTest;

import com.relevantcodes.extentreports.LogStatus;

//import Baseclasses.DriversInit;
import Baseclasses.GlobalVariables;


public class Extentreport extends GlobalVariables {
	
	   
	 public Extentreport()
	{
		System.out.println("Extent Report folder created");
		
	File Reportfolder=new File(System.getProperty("user.dir")+"test-Report");
	if (!Reportfolder.exists())
	{
		Reportfolder.mkdirs();
	}
	
	}

	
		public static  String screencapture(WebDriver driver,String result) throws IOException
		{
			File DestFile,folder;
			
			 File srcFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
	   
	        if (result.equalsIgnoreCase("Pass"))
	        {
	        	folder =new File("E:\\Screenshots_mail/Passed");
	        }
	        else
	        {
	        	  folder =new File("E:\\Screenshots_mail/Failed");
	        }
	        
	        if(!folder.exists())
	        {
	        	folder.mkdir();
	        }
	       String Destpath=folder.toString()+"/"+LocalDate.now()+"_"+".png";
	        
	        
	        
	        FileUtils.copyFile(srcFile, new File(Destpath));
	        
	        return Destpath;
		}
		

public static ExtentTest Startreport(String TestcaseName)
{
	
	//String ReportFolder=System.getProperty("user.dir")+TestcaseName+
			extentReport=new ExtentReports(System.getProperty("user.dir")+"/test-Report"+"/"+TestcaseName+"_"+LocalTime.now()+".html",false);
test=extentReport.startTest(TestcaseName);
return test;
}



public static void CompareResultwithscreenshot(String Actualresult,String expectedresult,String Description,ExtentTest test) throws IOException
{ 
	String sresultMessage="verify"+ Description+"Actual:" +Actualresult+"Expected result"+".";
 	boolean bresult=Actualresult.equalsIgnoreCase(expectedresult);
	if (bresult)
	{

	
	test.log(LogStatus.PASS,sresultMessage+""+test.addScreenCapture(screencapture(driver,"Pass")));
	}
 
		
//Screenshotcapture.screencapture(driver, System.getProperty("user.dir")+"//test-output//bhagya.html"));
	else
{
		test.log(LogStatus.FAIL,sresultMessage+""+test.addScreenCapture(screencapture(driver,"Fail")));
		Assert.assertTrue(false);
}
}
public static void CompareResultwithscreenshot(boolean Actualresult,boolean expectedresult,String Description,ExtentTest test) throws IOException
{ 
	String sresultMessage="verify"+ Description+"Actual:" +Actualresult+"Expected result"+".";
 	//boolean bresult=Actualresult.equalsIgnoreCase(expectedresult);
	if (Actualresult==true && expectedresult==true)
	{

	
	test.log(LogStatus.PASS,sresultMessage+""+test.addScreenCapture(screencapture(driver,"Pass")));
	}
 
		
//Screenshotcapture.screencapture(driver, System.getProperty("user.dir")+"//test-output//bhagya.html"));
	else
{
		test.log(LogStatus.FAIL,sresultMessage+""+test.addScreenCapture(screencapture(driver,"Fail")));
		Assert.assertTrue(false);
}
}

}
