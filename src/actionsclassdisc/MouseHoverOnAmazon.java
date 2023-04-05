package actionsclassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverOnAmazon {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement hoverelement = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(hoverelement).perform();
		
		WebElement signinbutton = driver.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']//*[@class='nav-action-button']"));
	
		signinbutton.click();
		
//		Right click using Actions class
		WebElement continuebutton = driver.findElement(By.xpath("//*[@type='submit']"));
		
		act.contextClick(continuebutton).perform();
	
	}

}
