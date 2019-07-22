package Testcases;

import org.testng.annotations.Test;

import Baseclasses.baseclass;

public class NewTest extends baseclass {
  
  @Test(description="Book a bhagya Login")
	public void booklogin() throws Exception {
		sTestcaseID = "Book Login";
		System.out.println("entered loop");
		loadconstant(sTestcaseID);
		login.clickLoginButton();
		login.setLogin();
		
	}

}
