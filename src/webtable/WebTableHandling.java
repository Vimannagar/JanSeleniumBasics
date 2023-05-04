package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basic.BaseTest;

public class WebTableHandling {
	
	
	@Test
	public void getAllValues()
	{
	WebDriver	driver = BaseTest.launchBrowser("https://demo.guru99.com/test/web-table-element.php");
		int i = 1;
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='dataTable']//tbody//tr//td"));
	
		for(WebElement element :elements )
		{
		String	text = element.getText();
		
		System.out.print(text+" ");
		
		if(i == 5)
		{
			System.out.println();
			i= 1;
		}
		else
		{
			i++;
		}
		}
	
	
	}
	

}
