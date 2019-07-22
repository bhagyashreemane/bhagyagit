package POM;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentTest;

import Baseclasses.GlobalVariables;
import Baseclasses.baseclass;
import Baseclasses.factory;
import Utility.Extentreport;

public class Login extends baseclass{
//=========================Actions===========================================
	
	@FindBy(xpath="//p[contains(text(),'Login or Create Account')]") public WebElement Button_Login;
	@FindBy(xpath="//input[@id='username']") public WebElement Input_Username;
	@FindBy(xpath="//input[@id='password']") public WebElement Input_Password;
	
	@FindBy(xpath="//button[@class='capText font16']//span[contains(text(),'Login')]") public WebElement Button_Login2;

//============================Methods==============================================
	
public void clickLoginButton() throws IOException
{
	getWaitmethod().waituntilelementexists(Button_Login,eTIMEOUT.wait5sec,true);
	Extentreport.CompareResultwithscreenshot(Button_Login.isDisplayed(),true,"Login Button present",test);
Button_Login.click();


}



public void setLogin()
{
	try {
	getWaitmethod().waituntilelementexists(Input_Username,eTIMEOUT.wait10sec,true);
	Input_Username.sendKeys(lslogin.get(0));
	Input_Password.sendKeys(lslogin.get(1));
	
		Extentreport.CompareResultwithscreenshot(Input_Username.isDisplayed(),true,"input field present",test);
	} catch (IOException e) {
		System.out.println("Setlogin failed");
	}
	Button_Login2.click();
	
}
}
