package testngdiscussion;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after suite");
	}
	
	
	@Test
	public void testCase3()
	{
		System.out.println("test case 3");
		
	}

}
