package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basic.BaseTest;

public class MMTTestClass {
	
static WebDriver driver;
	
	@Test
	public void searchFlight() throws InterruptedException
	{
		 driver = BaseTest.launchBrowser("https://www.makemytrip.com/");
		
		Thread.sleep(3000);
		
		WebElement searchbutton = driver.findElement(By.xpath("//*[text()='Search123']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", searchbutton);
	
	}

}
