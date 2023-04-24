package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActualAnnotations {
	
	@BeforeSuite
	public void initBrowser()
	{
		System.out.println("Opening the browser");
	}

	
	@AfterSuite
	public void tearDown()
	{
		System.out.println("Quit the browser");
	}
	
	@BeforeTest
	public void navToElectronics()
	{
		System.out.println("Navigating to Electronics module");
	}
	
	@AfterTest
	public void navBackToHome()
	{
		System.out.println("navigating to home page");
	}
	
	@BeforeClass
	public void navToMobile()
	{
		System.out.println("Navigating to mobile");
	}
	
	@AfterClass
	public void navBackToElectronics()
	{
		System.out.println("Navigating back to electronics");
	}
	
	
	@BeforeMethod
	public void navToProductPage()
	{
		System.out.println("Navigating to product page");
	}
	
	@AfterMethod
	public void navBackToListPage()
	{
		System.out.println("Navigating back to list of product page");
	}
	
	@Test
	public void addToCart() 
	{
		System.out.println("add to cart test case");
	}
	
	@Test
	public void addToCart2() 
	{
		System.out.println("add to cart test case2");
	}
}
