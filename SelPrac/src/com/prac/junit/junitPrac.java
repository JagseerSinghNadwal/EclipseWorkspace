package com.prac.junit;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class junitPrac {

	@Test (priority = 2)
	public void test() {
		System.out.println("hello");
		//Assert.fail("Not yet implemented");
		Assert.assertEquals("jagseer", "jagseer","In login JMJK");
		System.out.println("sdf");
	}

	@Test (priority =1)
	public void fun(){
		System.out.println("dsf");
	}
	
	@BeforeTest
	void  fun1(){
		System.out.println("before test");
	}
	
	
}
