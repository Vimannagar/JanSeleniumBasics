package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement daydropdown = driver.findElement(By.xpath("//*[@id='day']"));
		
		Select selday = new Select(daydropdown);
//		first method to select the value from select dropdown
		
		selday.selectByVisibleText("15");
		
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		
		Select selmonth = new Select(month);
		
//		second method to select the value from select dropdown
		selmonth.selectByValue("9");
		
		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		
		Select selyear = new Select(year);
		
//		Third method to select the value from select dropdown
		
		selyear.selectByIndex(9);
	
		
		
		
		
		
		
		
		
	}

}
