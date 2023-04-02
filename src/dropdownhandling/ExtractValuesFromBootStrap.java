package dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtractValuesFromBootStrap {

	public void printAllValues(String xpath, WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@tabindex='1']//*[@type='text']")).click();
		
		List<WebElement> allvalues = driver.findElements(By.xpath(xpath));
		
		int countofvalues = allvalues.size();
		
		for(int i = 0; i<countofvalues; i++)
		{
			String text = allvalues.get(i).getText();
			
			System.out.println(text);
		}
		
	}
	//div[@class='_3xI1']//span
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://paytm.com/recharge");
		
		ExtractValuesFromBootStrap ev = new ExtractValuesFromBootStrap();
		
		ev.printAllValues("//div[@class='_3xI1']//span", driver);
		
		
	}
}
