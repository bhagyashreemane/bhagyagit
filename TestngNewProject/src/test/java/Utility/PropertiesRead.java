package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRead {
	FileInputStream fin;
	Properties pro;
public  PropertiesRead()
{
	 try {
		fin=new FileInputStream(".//Values.properties");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
pro	=new Properties();
	try {
		pro.load(fin);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public   String getexcelpath_Login()
	{System.out.println(System.getProperty("user.dir")+pro.getProperty("Login"));
		return (System.getProperty("user.dir")+pro.getProperty("Login"));
	}

	public  String getexcelpath_TestcaseOrder()
	{
		return (System.getProperty("user.dir")+pro.getProperty("TestcaseOrder"));
	}
	
	public  String getDriverpath_ChromeDriver(){return (System.getProperty("user.dir")+pro.getProperty("ChromeDriver"));
	}
	public  String getDriverpath_FirefoxDriver(){return (System.getProperty("user.dir")+pro.getProperty("FirefoxDriver"));
	}
	public  String getDriverpath_IEDriver(){return (System.getProperty("user.dir")+pro.getProperty("IEDriver"));
	}
}

