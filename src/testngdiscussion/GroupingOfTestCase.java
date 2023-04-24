package testngdiscussion;

import org.testng.annotations.Test;

public class GroupingOfTestCase {
	
	@Test(priority = 1,  groups = "functional")
	public void getDetails()
	{
		System.out.println("Get details test case");
	}
	
	@Test(priority = 2, groups = "regression")
	public void setDetails()
	{
		System.out.println("Set details test case");
	}
	
	@Test(priority = 3, groups = {"sanity", "functional"})
	public void login()
	{
		System.out.println("login test case");
	}
	
	
	@Test (priority = 4,  groups = "sanity")
	public void home()
	{
		System.out.println("home test case");
	}
	
	
	@Test(priority = 5, groups = {"functional", "regression"})
	public void profile()
	{
		System.out.println("profile test case");
	}
	
	
	@Test(priority = 6,  groups = "functional")
	public void logout()
	{
		System.out.println("Logout test case");
	}

}
