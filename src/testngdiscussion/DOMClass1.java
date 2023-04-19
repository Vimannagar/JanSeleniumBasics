package testngdiscussion;

import org.testng.annotations.Test;

public class DOMClass1 {
	
	@Test(priority = 1)
	public void loginToApp()
	{
		System.out.println("Login to application testcase");
		
	}
	

	@Test(priority = 2, dependsOnMethods = {"loginToApp"} )
	public void homePage()
	{
		System.out.println("Homepage test case");
		
		throw new ArithmeticException();
	}
	

	
}
