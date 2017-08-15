package com.prac.TestNG;

import static org.testng.Assert.assertSame;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracTestNG {
	@BeforeTest 
	  void fg() {
		  System.out.println("bt");
	
	  }
  @Test (dependsOnMethods = {"display"},groups="sit")
  void fn(){
	  System.out.println("fn ");
//	  Log.info("sd");
  assertSame("jags", "jags");
  System.out.println("after Assert");
  }
  
  @Test (groups = "sit")
  @Parameters ({"Name"})
  void prm(String Name){
	  System.out.println("prm "+Name);
  assertSame("jags", "jags");
  }
  
  @BeforeMethod (timeOut = 50)
  public void beforeMethod() {
	  System.out.println("before mtd");
	  
  }
  @Test (expectedExceptions = { Exception.class})
  void funCheck() throws Exception{
	throw new IOException();
}
  @Test(dataProvider = "dp", invocationCount = 3, groups = "sit")
  public void dataP(Integer n, String s, String sr) {
	  
	  System.out.println(n+" "+s+" "+sr);
  }
  
  @DataProvider (name  = "dp")
  public Object[][] dp() {
	  System.out.println("data provider KJMJK");
    return new Object[][] {
      new Object[] { 1, "a","jagseer"},
      new Object[] { 2, "b" ,"singh"},
    };
    }
  
  @AfterMethod (enabled = false)
  public void afterMethod() {
	  System.out.println("after mtd");
  }
  @Test (groups = "sit")
  public void display() {
	// TODO Auto-generated method stub
	  Reporter.log("it is before TEas::");
	  System.out.println("jagseer sisplay");
}
}
