package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basic.BaseTest;

public class ImplicitWait2 {
	
	
	@Test
	public void clickOnLink() throws InterruptedException
	{
		WebDriver driver = BaseTest.launchBrowser("https://www.google.com/");
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("India");
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//a//*[text()='Air India'])[1]")).click();
		
		
		
		
	}

}
