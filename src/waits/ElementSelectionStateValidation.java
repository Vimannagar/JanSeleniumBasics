package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import basic.BaseTest;

public class ElementSelectionStateValidation {

	@Test
	public void validateCheckbox() {
		WebDriver driver = BaseTest.launchBrowser("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		driver.findElement(By.xpath("//*[@id='checkbox']")).click();


		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
									.pollingEvery(Duration.ofMillis(150))
									.withTimeout(Duration.ofSeconds(60));
		
		wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id='ch']"), true));
		
		driver.findElement(By.xpath("//*[@id='checkbox']")).click();

	}

}
