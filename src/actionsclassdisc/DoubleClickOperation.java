package actionsclassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.BaseTest;

public class DoubleClickOperation {
	
	public static void main(String[] args) {
		
		WebDriver driver = BaseTest.launchBrowser("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
			
		WebElement element = driver.findElement(By.xpath("//*[@id='double-click']"));
	
		Actions act = new Actions(driver);
		
		act.doubleClick(element).perform();
	
	
	
	}

}
