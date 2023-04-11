package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basic.BaseTest;

public class Handling2Windows {
	
	
	public static void main(String[] args) {
	WebDriver driver = BaseTest.launchBrowser("https://www.facebook.com/signup");
	
	String parentid = driver.getWindowHandle();// parent id
	
	System.out.println("parent id is :"+parentid);
		
	driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
	
	String childid = "";
	
	Set<String> allwindowid = driver.getWindowHandles();
	
				for(String winid :allwindowid)
				{
					System.out.println(winid);
					
					if(!(parentid.equals(winid)))
							{
						
						childid = winid;
						driver.switchTo().window(winid);
						
						
							}
					
				}
		
	driver.findElement(By.xpath("//*[@type='search']")).sendKeys("Test text");	
	
	
	driver.switchTo().window(parentid);
	
	
	driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("parent window handling");
	
	
	driver.switchTo().window(childid);
	
	
	}

}
