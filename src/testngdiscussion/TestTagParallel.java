package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestTagParallel {
	
	

	@Test
	public void testCase1()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
	}
	
	

}
