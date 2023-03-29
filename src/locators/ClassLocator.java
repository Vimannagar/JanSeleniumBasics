package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocator {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/client");
		
		WebElement registerbutton = driver.findElement(By.className("btn1"));
		
		registerbutton.click();
	}

}
