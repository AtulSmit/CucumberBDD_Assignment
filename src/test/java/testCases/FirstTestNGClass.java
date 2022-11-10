package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestNGClass {
	
	@Test
	public void TestMethod()
	{
		System.out.println("Test");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Before MEthod");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("After MEthod");
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("After Class");
	}

}
