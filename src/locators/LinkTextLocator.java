package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {
	
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/client");
		
//		WebElement forgotpwd = driver.findElement(By.linkText("Forgot password?"));
		
		WebElement forgotpwd = driver.findElement(By.tagName("Forgot pass"));
		
		forgotpwd.click();
	
	}

}
