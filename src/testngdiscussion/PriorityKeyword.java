package testngdiscussion;

import org.testng.annotations.Test;

public class PriorityKeyword {
	
	@Test(priority = 6)
	public void getDetails()
	{
		System.out.println("Get details test case");
	}
	
	@Test(priority = 6)
	public void setDetails()
	{
		System.out.println("Set details test case");
	}
	
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
	
	
	@Test(priority = -3)
	public void profile()
	{
		System.out.println("profile test case");
	}
	
	
	@Test
	public void logout()
	{
		System.out.println("Logout test case");
	}

}
