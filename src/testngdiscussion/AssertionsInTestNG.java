package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import basic.BaseTest;

public class AssertionsInTestNG {

	
	@Test
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
		
		Assert.assertEquals(titleofpage, "Amazon.in : Mobile");
		
		
		Assert.assertEquals(ispresent, true);
	}
	
	
	
}
