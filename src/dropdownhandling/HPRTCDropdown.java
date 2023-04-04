package dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HPRTCDropdown {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
		
		driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys("shi");
		
		Thread.sleep(2000);
		
		List<WebElement> allcities = driver.findElements(By.xpath("//*[@id='ui-id-1']//a"));
		
		for(WebElement city :allcities)
		{
			String cityname = city.getText();
			System.out.println(cityname);
		}
		
				
	}

}
