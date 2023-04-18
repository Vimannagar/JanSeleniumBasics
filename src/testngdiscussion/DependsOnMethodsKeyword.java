package testngdiscussion;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class DependsOnMethodsKeyword {
	
	
	@Test(priority = 1)
	public void loginToApp()
	{
		System.out.println("Login to application testcase");
		
	}
	

	@Test(priority = 1000, dependsOnMethods = {"loginToApp"} )
	public void homePage()
	{
		System.out.println("Homepage test case");
		
		throw new ArithmeticException();
	}
	
	@Test(priority = 1001, dependsOnMethods = {"homePage", "loginToApp"})
	public void logout()
	{
		System.out.println("logout test case");
	}
	
	


}
