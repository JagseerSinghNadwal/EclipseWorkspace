package com.prac.junit;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
  @Test (groups="sit")
  public void fun() {
	  System.out.println("demo");
  }
  @BeforeTest (groups="sit")
  public void fun1() {
	  System.out.println("fun1");
	  assertEquals("jags","jags");
  }
  @AfterMethod 
  public void fun2() {
	  System.out.println("fun2");
  }
}
