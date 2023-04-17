package testngdiscussion;

import org.testng.annotations.Test;

public class EnableKeyword {
	@Test(priority = 1)
	public void login()
	{
		System.out.println("login test case");
	}
	
	
	@Test (priority = 2)
	public void home()
	{
		System.out.println("home test case");
	}
	
	
	@Test(priority = -3, enabled = false)
	public void profile()
	{
		System.out.println("profile test case");
	}
}
