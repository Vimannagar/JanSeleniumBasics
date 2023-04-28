package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basic.BaseTest;

public class ImplicitWaitDisc {
	
	
	@Test
	public void searchFlight() throws InterruptedException
	{
		 WebDriver driver = BaseTest.launchBrowser("https://www.makemytrip.com/");
		
	
		
		WebElement searchbutton = driver.findElement(By.xpath("//*[text()='Search']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", searchbutton);
	
	}
	

}
