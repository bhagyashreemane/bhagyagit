package Utility;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Baseclasses.GlobalVariables;

public class DriversInit  extends GlobalVariables{
//static WebDriver driver;
	public static WebDriver getbrowser(String browser) {
		//String browser;
		if (browser.equalsIgnoreCase("chrome")){
			
			//System.setProperty("webdriver.chrome.driver",".//Driver/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver",".//Drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
		}else if(browser.equalsIgnoreCase("Firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver",".//Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
	}else if(browser.equalsIgnoreCase("IE"))
	{
		
		System.setProperty("webdriver.ie.driver",".//Drivers/IEDriverserver.exe");
		driver=new InternetExplorerDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
		return driver;
}
	}

