package revision;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import basic.BaseTest;
import utility.ScreenShot;

public class TryFinally {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		BaseTest.launchBrowser("https://facebook.com/signup");
		
		ScreenShot.getScreenshotWithFilename(driver, "abc");
		
		
		
	}

}
