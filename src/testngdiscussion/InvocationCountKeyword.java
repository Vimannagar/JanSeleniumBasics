package testngdiscussion;

import org.testng.annotations.Test;

public class InvocationCountKeyword {

	@Test(priority = 1)
	public void login()
	{
		System.out.println("login test case");
	}
	
	
	@Test (priority = 2, invocationCount = 5)
	public void home()
	{
		System.out.println("home test case");
	}
	
	
	@Test(priority = -3)
	public void profile()
	{
		System.out.println("profile test case");
	}
	
}
