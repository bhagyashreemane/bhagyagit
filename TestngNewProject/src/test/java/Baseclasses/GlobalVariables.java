package Baseclasses;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import POM.BusesPage;
import POM.Login;
import POM.Trains;

public class GlobalVariables {
 
	
	public static WebDriver driver;
 public static JavascriptExecutor jse;
 public static Action action;
 public static String sTestcaseID;
 
public static ExtentReports extentReport;
public static ExtentTest test;

 
public static BusesPage bus;
public static Trains trains;
public static Login login;

public static List<String> lslogin;


 public enum eTIMEOUT
 {
	 wait5sec(5),wait10sec(10);
	  public int value;
	 private eTIMEOUT(int value)
	 {
		 this.value=value;
	 }
	}
}

