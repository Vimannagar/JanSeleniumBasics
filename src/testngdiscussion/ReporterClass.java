package testngdiscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterClass {

	@Test(priority = 1)
	public void login()
	{
		System.out.println("login test case");
		
		Reporter.log("Login test case for report", true);
	}
	
	
	@Test (priority = 2)
	public void home()
	{
		System.out.println("home test case");
		Reporter.log("home test case for report", true);
	}
	
	
	@Test(priority = -3)
	public void profile()
	{
		System.out.println("profile test case");
		
		Reporter.log("profile test case for report", false);
		

	}
	
}
