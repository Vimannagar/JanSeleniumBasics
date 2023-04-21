package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

	
	@Parameters("browser")
	@Test(priority = 6)
	public void getDetails(String browsername)
	{
		
		System.out.println("value from xml is "+browsername);
		System.out.println("Get details test case");
	}
	
	@Parameters({"browser","env"})
	@Test(priority = 8)
	public void launchBrowser(String browsername, String e)
	{
		
		System.out.println(e);
		WebDriver driver;
		if(browsername.equals("Chrome"))
		{
			 driver = new ChromeDriver();
		}
		else if(browsername.equals("Firefox"))
		{
			 driver = new FirefoxDriver();
		}
		
	}
	
	@Parameters("taglevel")
	@Test(priority = 10)
	public void login(String tag)
	{
		System.out.println("Tag level value is "+tag);
		System.out.println("login test case");
	}
}
