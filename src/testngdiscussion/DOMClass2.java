package testngdiscussion;

import org.testng.annotations.Test;

public class DOMClass2 {

	@Test(dependsOnMethods = {"testngdiscussion.DOMClass1.homePage"})
	public void logout()
	{
		System.out.println("logout test case");
	}
}
