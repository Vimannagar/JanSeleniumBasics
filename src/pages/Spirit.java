package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Spirit {
	
WebDriver driver;
	
	By spirit = By.xpath("(//*[normalize-space(text())='SPIRITS'])[2]");
	
	By maltwiskey = By.xpath("(//*[text()='Malt Whiskey'])[2]");
	
	By sortdropdown = By.xpath("//*[@id='ddlProductSortyBy']");
	
	
	
	public Spirit(WebDriver driver)
	{
		this.driver	= driver;
	}
	
	public void selectSpirits()
	{
		driver.findElement(spirit).click();
		driver.findElement(maltwiskey).click();
	}
	
	public void sortDropdown(String visible)
	{
		WebElement dropdown = driver.findElement(sortdropdown);
		
		Select sel = new Select(dropdown);
		
		sel.selectByVisibleText(visible);
		
	}

}
