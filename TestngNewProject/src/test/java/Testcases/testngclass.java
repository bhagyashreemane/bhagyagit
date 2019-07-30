package Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

public class testngclass {
	@BeforeClass
	  public void fbeforeclass() {
		  System.out.println("before class");
	}
	 
	
	@BeforeTest
	  public void fbefore() {
		  System.out.println("before test");
	}
	  
  @Test
  public void f() {
	  System.out.println("test1");
  }
@Test(expectedExceptions = { IOException.class })
  public void exceptionTestOne() throws Exception {
	  System.out.println("exception");
      throw new IOException();
  }
  @Test(priority=1)
  public void f2() {
	  System.out.println("test2");
	  Assert.assertTrue(true);
  }
  @Test(priority=2)
  public void f1() {
	  System.out.println("test3");
	  Assert.assertTrue(true);
  }
  
  @AfterTest
  public void fafter() {
	  System.out.println("After test");
  }
	
	  
	  @AfterClass
	  public void fafterclass() {
		  System.out.println("After class");
		  
		  
	}
	  @AfterMethod
	  public void faftermethod() {
		  System.out.println("this is after method");
		  
		  
	}
	  @BeforeMethod
	  public void fbeforemethod() {
		  System.out.println("this is before method");
		  
		  
	}
	 
}

