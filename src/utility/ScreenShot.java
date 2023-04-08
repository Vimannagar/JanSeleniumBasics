package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import basic.BaseTest;

public class ScreenShot {
	
	
//	WAP to capture the screenshot using a method that ask the filename from user
	
	public static void getScreenshotWithFilename(WebDriver driver, String filename) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

//		String path = "F:\\Desktop\\VimanNagar\\May 21\\Jan7SeleniumBasics\\Screenshots\\google.jpg";

		String path = System.getProperty("user.dir")+"\\Screenshots\\"+filename+".jpg";
		
		File file = new File(path);

		FileHandler.copy(source, file);
	}
	
	

	public static void main(String[] args) throws IOException {

		WebDriver driver = BaseTest.launchBrowser("https://www.google.com/");

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

//		String path = "F:\\Desktop\\VimanNagar\\May 21\\Jan7SeleniumBasics\\Screenshots\\google.jpg";

		String path = System.getProperty("user.dir")+"\\Screenshots\\google1.jpg";
		
		File file = new File(path);

		FileHandler.copy(source, file);

	}

}
