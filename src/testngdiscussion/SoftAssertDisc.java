package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import basic.BaseTest;

public class SoftAssertDisc {
	
	@Test(priority = 1)
	public void loginTest()
	{
		WebDriver driver = BaseTest.launchBrowser("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Mobile");
		
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
		
		String titleofpage= driver.getTitle();
		
		System.out.println(titleofpage);
		
//		applying assertion
		System.out.println("Before assertion code");
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(titleofpage, "Amazon.in : Mobiile");
		
		System.out.println("After assertion code");
		
		sa.assertAll();
		
		
		
	}

}
