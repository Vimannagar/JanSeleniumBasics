package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basic.BaseTest;

public class AmazonForCarouselTest {
	
	
	@Test
	public void carouselTest()
	{
		WebDriver driver = BaseTest.launchBrowser("https://www.amazon.in/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='a-carousel-card']//*[@class='a-link-normal'])[3]")));
		
		WebElement carouselelement = driver.findElement(By.xpath("(//*[@class='a-carousel-card']//*[@class='a-link-normal'])[3]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", carouselelement);
		
		
		
	}

}
