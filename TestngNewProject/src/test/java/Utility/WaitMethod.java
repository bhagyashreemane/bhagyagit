package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Baseclasses.GlobalVariables.eTIMEOUT;
import Baseclasses.baseclass;

public class WaitMethod extends baseclass{
public  boolean waituntilelementexists(WebElement element,eTIMEOUT etimeout,boolean errormessagerequired)
{
	try {
		int waitTime=etimeout.value;
		WebDriverWait wait=new WebDriverWait(driver,waitTime);
		wait.until(ExpectedConditions.visibilityOf(element));
		return true;
		}
	catch(Exception e)
	{
		if(errormessagerequired==true)
		{
			System.out.println("couldnt find the elemnt" +e);
		}
		return false;
	}
	
}
}
