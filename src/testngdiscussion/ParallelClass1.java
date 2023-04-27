package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelClass1 {

	
	@Test
	public void testCase1()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
	}
	
	@Test
	public void testCase2()
	{
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
	}
	
}
