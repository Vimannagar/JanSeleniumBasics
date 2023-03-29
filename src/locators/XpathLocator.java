package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {
	
	
	public static void main(String[] args) {
		
	ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/client");
		
		 WebElement username = driver.findElement(By.xpath("//input[@type='email']"));
		
		username.sendKeys("username by sendkeys method");
		
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='enter your passsword']"));
	
		password.sendKeys("this is password");
	
	}

}
