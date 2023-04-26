package testngdiscussion;

import org.testng.Assert;
import org.testng.annotations.Test;

	public class TestClass {
		
		
		@Test(priority = 1)
		public void getDetails()
		{
			System.out.println("Get details test case");
		}
		
		@Test(priority = 2)
		public void setDetails()
		{
			System.out.println("Set details test case");
			
			Assert.assertEquals(false, true);
		}
		
		@Test(priority = 3, dependsOnMethods = "setDetails")
		public void login()
		{
			System.out.println("login test case");
		}
		@Test (priority = 4, dependsOnMethods = "login")
		public void home()
		{
			System.out.println("home test case");
		}
		
		
		@Test(priority = 5)
		public void profile()
		{
			System.out.println("profile test case");
		}
		
		
		@Test(priority = 6)
		public void logout()
		{
			System.out.println("Logout test case");
		}
	
	
	}
