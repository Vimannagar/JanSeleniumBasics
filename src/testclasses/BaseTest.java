package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.AddToCart;
import pages.Search;
import pages.Spirit;

public class BaseTest {
	
static WebDriver driver;

Search search;

Spirit spirit;

AddToCart addtocart;
	
	@BeforeSuite
	public void initBrowser()
	{
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://livingliquidz.com/");
	}
	
	
	@BeforeClass
	public void createObject()
	{
		search = new Search(driver);
		
		spirit = new Spirit(driver);
		
		addtocart = new AddToCart(driver);
	}
	
	
	
//	@AfterSuite
//	public void tearDown()
//	{
//		driver.close();
//	}

	
	
}
