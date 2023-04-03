package actionsclassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseActions {
	
	public static void main(String[] args) {
//		mouse hover
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='sub-menu']"));
	}

}
