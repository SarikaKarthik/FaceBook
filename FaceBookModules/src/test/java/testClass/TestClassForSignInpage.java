package testClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassForSignInpage {
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	public void beforeMEthod()
	{
		System.out.println("BeforeMethod");

	}
	@Test
	public void test1()
	{
		System.out.println("TestMethod1");
	}
	@Test
	public void test2()
	{
		System.out.println("TestMethod2");
	}
	@Test
	public void test3()
	{
		System.out.println("TestMethod3");
	}


	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod");

	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass");

	}	
	
}
