package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.BaseTest;

public class ClickUsingJavaScriptExecutor {
	
	
	public static void main(String[] args) {
		WebDriver driver = BaseTest.launchBrowser("https://www.spotify.com/in-en/signup");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement maleradio = driver.findElement(By.xpath("//*[@id='gender_option_male']"));
				
		js.executeScript("arguments[0].click();", maleradio);
		
	}

}
