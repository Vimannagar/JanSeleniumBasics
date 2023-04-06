package actionsclassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.BaseTest;

public class DroppableWithClickAndHold {

	public static void main(String[] args) {

		WebDriver driver = BaseTest.launchBrowser("https://jqueryui.com/droppable/");

		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(iframe);
		
		WebElement draggable = driver.findElement(By.xpath("//*[@id='draggable']"));

		WebElement droppable = driver.findElement(By.xpath("//*[@id='droppable']"));

		Actions act = new Actions(driver);

		act.clickAndHold(draggable).moveToElement(droppable).release().build().perform();

		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//*[text()='Datepicker']")).click();
		
	}

}
