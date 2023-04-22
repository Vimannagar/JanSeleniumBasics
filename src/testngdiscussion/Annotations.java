package testngdiscussion;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method");
	}
	
	@Test
	public void testCase1()
	{
		System.out.println("Test case 1");
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("Test case 2");
	}

}
