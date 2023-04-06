package actionsclassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import basic.BaseTest;

public class DragAndDrop {
	
	public static void main(String[] args) {
		WebDriver driver = BaseTest.launchBrowser("https://jqueryui.com/droppable/");
				
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(iframe);
		
		WebElement draggable = driver.findElement(By.xpath("//*[@id='draggable']"));

		WebElement droppable = driver.findElement(By.xpath("//*[@id='droppable']"));

		Actions act = new Actions(driver);
	
		act.dragAndDrop(draggable, droppable).perform();

	}

}
