package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.BaseTest;

public class Scrolling {
	
	
	public static void main(String[] args) {

		WebDriver driver = BaseTest.launchBrowser("https://jqueryui.com/datepicker/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;

//		scrolling by pixel value over the page
//		js.executeScript("window.scrollBy(0, 500)");
//
//		js.executeScript("window.scrollBy(0, -200)");
		
//		Scrolling till element is visible over the screen
		WebElement scrollelement = driver.findElement(By.xpath("//*[text()='Effect']"));
		
		js.executeScript("arguments[0].scrollIntoView();", scrollelement);
		
		
	}

}
