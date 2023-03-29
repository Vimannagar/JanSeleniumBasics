package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/client");
		
		WebElement username = driver.findElement(By.id("userEmail"));
		
		username.sendKeys("gouravjawale28@gmail.com");
		
		WebElement password = driver.findElement(By.id("userPassword"));
		
		password.sendKeys("Test@1234");
		
		WebElement loginbutton = driver.findElement(By.id("login"));
		
		loginbutton.click();
		
		
		
	}

}
