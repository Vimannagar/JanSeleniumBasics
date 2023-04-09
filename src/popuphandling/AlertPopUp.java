package popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basic.BaseTest;

public class AlertPopUp {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = BaseTest.launchBrowser("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
		
		driver.findElement(By.xpath("//*[@id='searchBtn']")).click();
		
		String textoveralert= driver.switchTo().alert().getText();// get the text over the alert popup
		
		System.out.println(textoveralert);
		
		driver.switchTo().alert().accept();
		
		
	}

}
