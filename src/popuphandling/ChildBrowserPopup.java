package popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basic.BaseTest;

public class ChildBrowserPopup {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = BaseTest.launchBrowser("https://groww.in/");
		
		driver.findElement(By.xpath("//*[@class='btn51Btn btn51RipplePrimary btn51Primary']//span[text()='Login/Register']")).click();
	
		driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("velocity.ctc@gmail.com");
		
		driver.findElement(By.xpath("//*[text()='Continue']")).click();
		
	}

}
