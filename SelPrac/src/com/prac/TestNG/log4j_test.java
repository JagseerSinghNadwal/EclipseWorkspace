package com.prac.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class log4j_test {
  @Test
  public void testFun() {
	  	 System.out.println("helo this is test fun");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

}
