package navigationalbasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalSteps {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
			
//		maximize the browser
		
		driver.manage().window().maximize();
		
//		Navigate to a url:
		
		driver.get("https://www.amazon.in");
		
//		navigate to another url
		
		driver.get("https://www.google.com/");
		
//		perform back operation
		
		driver.navigate().back();
		
//		perform forward operation
		
		driver.navigate().forward();
		
//		perform refresh operation
		
		driver.navigate().refresh();
		
//		perform browser close
		
		driver.close();
	
		
		
		
	}

}
