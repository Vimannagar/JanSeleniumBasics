package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import basic.BaseTest;

public class AssertionsInTestNG {

	
		@Test(priority = 1, enabled = false)
		public void loginTest()
		{
			WebDriver driver = BaseTest.launchBrowser("https://www.amazon.in/");
			
			driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Mobile");
			
			driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
			
			String titleofpage= driver.getTitle();
			
			System.out.println(titleofpage);
			
			boolean ispresent = titleofpage.contains("Mobiile");
			
			System.out.println(ispresent);
			
	//		applying assertion
			System.out.println("Before assertion code");
			
			Assert.assertEquals(titleofpage, "Amazon.in : Mobiile");
			
			System.out.println("After assertion code");
			
			
			
		}
		
		@Test(priority = 2)
		public void getVerify()
		{
			
			String actual = "Shopping";
			
			String expected = "Shoppingg";
			
			
			boolean isequal = actual.equals(expected);
			
			
//			Assert.assertTrue(isequal);
			
			Assert.assertTrue(isequal, "Test case is failed please raise a bug");
			
			
			Assert.assertFalse(isequal);
			
		}
	
	
	
}
