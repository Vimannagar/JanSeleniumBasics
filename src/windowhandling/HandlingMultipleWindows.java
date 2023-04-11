package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basic.BaseTest;

public class HandlingMultipleWindows {
	
	
	public static void main(String[] args) {
		WebDriver driver = BaseTest.launchBrowser("https://www.facebook.com/signup");
		
		String parentid = driver.getWindowHandle();// parent id
		
		System.out.println("parent id is :"+parentid);
			
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
	
Set<String> allwindow = driver.getWindowHandles();
			
		int	numberofwindow = allwindow.size();

System.out.println(numberofwindow);

String [] winarray = new String [numberofwindow];
int i = 0;
			for(String winid :allwindow)
			{
				winarray[i] = winid;
				
				i++;
			}
			
			
			driver.switchTo().window(winarray[2]);
			
			driver.get("https://www.google.com/");
			
			driver.quit();
			
		
	}

}
