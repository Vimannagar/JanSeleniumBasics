package pages;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search {
	
	WebDriver driver;
	
	By searchbox = By.xpath("//*[@class='wbr-main-search']");
	
	By searchresults = By.xpath("//*[@class='typeahead__list']//span[@class='title']");
	
	
	
	public Search(WebDriver driver)
	{
		this.driver	= driver;
		
		
	}
	
	public void searchItems(String searchtext)
	{
		driver.findElement(searchbox).sendKeys(searchtext);
		
	}
	
	
	public String getTitleOfPage()
	{
		String titleofpage = driver.getTitle();
		
		return titleofpage;
	}
	
	
	public void getSearchResults()
	{
		List<WebElement> searchresult = driver.findElements(searchresults);
		
		for(WebElement result :searchresult)
		{
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			String value = result.getText();
			
			System.out.println(value);
		}
	}
	
	
	
		

}
