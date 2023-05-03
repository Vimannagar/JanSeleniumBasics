package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basic.BaseTest;

public class ValidateTextWrittenIntoField {
	
	@Test
	public void getTextFromField()
	{
		WebDriver driver = BaseTest.launchBrowser("https://www.facebook.com/signup");
		
		WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
		
		firstname.sendKeys("Test Text");
		
		String text = firstname.getAttribute("value");
		
		System.out.println(text);
		
		Assert.assertEquals(text, "Test Text");
		
		String attvalue = firstname.getAttribute("class");
		
		System.out.println(attvalue);
		
	}

}
