package navigationalbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
	
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		
	List<WebElement> yearelements = driver.findElements(By.xpath("//*[@id='year']//option"));
		
		for(int i=0; i<119; i++)
		{
			String yearvalue= yearelements.get(i).getText();
			
			System.out.println(yearvalue);
		}
	
	
	
	}

}
