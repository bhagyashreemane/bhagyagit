package Testcases;

import org.testng.annotations.Test;

import Baseclasses.baseclass;
import POM.Login;


public class BookLogin extends baseclass{
	@Test(description="Book a bhagya Login")
	public void BookLogin() throws Exception {
		sTestcaseID = "TC_Book_Login";
		System.out.println("entered loop");
		loadconstant(sTestcaseID);
		driver.get("https://www.makemytrip.com/");
		login.clickLoginButton();
		//login.setLogin();
		
	}
	
}
