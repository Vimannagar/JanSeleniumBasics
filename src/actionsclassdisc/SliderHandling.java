package actionsclassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.BaseTest;

public class SliderHandling extends BaseTest {
	
	public static void main(String[] args) {
		BaseTest.launchBrowser("https://jqueryui.com/slider/");
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
//		switch into the frame
		driver.switchTo().frame(iframe);
		
		
		WebElement slider = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		
		
//		Actions class
		
		Actions act =  new Actions(driver);
		
		act.clickAndHold(slider).moveByOffset(200, 0).release().build().perform();
		
		act.clickAndHold(slider).moveByOffset(-100, 0).release().build().perform();
		
	
	}

}
