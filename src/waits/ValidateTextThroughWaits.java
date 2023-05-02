package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import basic.BaseTest;

public class ValidateTextThroughWaits {
	
	
	
	@Test
	public void validateTillTextPresent()
	{
WebDriver driver = BaseTest.launchBrowser("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.findElement(By.xpath("//*[@id='populate-text']")).click();
		
//		<> --> Generics 
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
										.pollingEvery(Duration.ofMillis(150))
										.withTimeout(Duration.ofSeconds(60));
		
	wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id='h2']"), "Selenium Webdriver"));
	
	driver.findElement(By.xpath("//*[@id='populate-text']")).click();
	
	
	}

}
