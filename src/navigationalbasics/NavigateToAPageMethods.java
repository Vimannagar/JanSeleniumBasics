package navigationalbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToAPageMethods {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
	
		driver.navigate().to("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
		
	}

}
