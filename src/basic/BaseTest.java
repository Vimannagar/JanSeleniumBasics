package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
public static WebDriver driver;
	
	public static void launchBrowser(String url)
	{
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
			
	}

}
