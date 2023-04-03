package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizationOfXpath {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");

//		contains()

		WebElement firstname = driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]"));

		firstname.sendKeys("7 Jan Batch");

////		indexing
//		WebElement mobile = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
//
//		mobile.sendKeys("9876543210");
//		
//		
//		WebElement text = driver.findElement(By.xpath("//div[text()='Create a new account']"));
//
//		
//		String textvalue = text.getText();
//		
//		System.out.println(textvalue);
		
		
		
	}

}
