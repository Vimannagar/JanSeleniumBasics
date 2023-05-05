package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
	
		

}
