package actionsclassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.BaseTest;

public class DatePicker {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = BaseTest.launchBrowser("https://jqueryui.com/datepicker/");
		

		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
//		switch into the frame
		driver.switchTo().frame(iframe);
		String expectedmonth = "June 2022";
//		clicking on datepicker
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		
		
		while(true)
		{
		String monthyear= driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
		
		System.out.println(monthyear);
		
		if(!(monthyear.equals(expectedmonth)))
		{
			driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			
		}
		
		else
		{
			break;
		}
		
		}
		
		
	}

}
