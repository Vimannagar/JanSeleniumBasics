package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.BaseTest;

public class SendKeysUsingJS {

	public static void main(String[] args) {
		WebDriver driver = BaseTest.launchBrowser("https://www.spotify.com/in-en/signup");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement email = driver.findElement(By.xpath("//*[@id='email']"));

		js.executeScript("arguments[0].value='velocity@pune.com'", email);

	}

}
