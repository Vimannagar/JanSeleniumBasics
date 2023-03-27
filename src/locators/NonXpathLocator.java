package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NonXpathLocator {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
//	id locator	
//		driver.get("https://www.amazon.in/");
//		
//		driver.manage().window().maximize();
//		
//	WebElement carticon = driver.findElement(By.id("nav-cart"));
//	
//		carticon.click();
		
// name locator
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement username = driver.findElement(By.name("username"));
		
		username.sendKeys("typing username by selenium");
		
		
		
		
	}

}
