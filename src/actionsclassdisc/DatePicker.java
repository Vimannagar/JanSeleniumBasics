package actionsclassdisc;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.BaseTest;
import utility.ScreenShot;

public class DatePicker {
	
	public static void selectDate(WebDriver driver, String monthyr, String date)
	{
		String expectedmonth = monthyr;
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
		driver.findElement(By.xpath("//*[@data-handler='selectDay']//a[text()='"+date+"']")).click();
		
	}
	
	
	
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = BaseTest.launchBrowser("https://jqueryui.com/datepicker/");
		

		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
//		switch into the frame
		driver.switchTo().frame(iframe);
		String expectedmonth = "July 2022";
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
		driver.findElement(By.xpath("//*[@data-handler='selectDay']//a[text()='20']")).click();
		
		ScreenShot.getScreenshotWithFilename(driver, "datepicker");
	}

}
