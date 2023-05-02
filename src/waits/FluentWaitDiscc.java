package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import basic.BaseTest;

public class FluentWaitDiscc {
	
	
	
	@Test
	public void fluentWaitTest()
	{

		WebDriver driver = BaseTest.launchBrowser("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
//		<> --> Generics 
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
										.pollingEvery(Duration.ofSeconds(9))
										.withTimeout(Duration.ofSeconds(60));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disable']")));
		
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
											
		
		
	}

}
