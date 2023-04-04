package actionsclassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		WebElement scrollelement = driver.findElement(By.xpath("//*[text()='Best Sellers in Computers & Accessories']"));
	
		Actions act = new Actions(driver);
		
		act.scrollToElement(scrollelement).perform();
		
		
	
	}

}
