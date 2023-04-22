package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basic.BaseTest;

public class TestClass1 {
	
WebDriver driver;
	
	
	@Test(priority = 1)
	public void navToUrl()
	{
		driver = BaseTest.launchBrowser("https://www.amazon.in/");
			
	}
	
	
}
