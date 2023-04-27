package testngdiscussion;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.ScreenShot;
	
	public class TestNGListeners extends MMTTestClass implements  ITestListener {
	
		@Override
		public void onTestStart(ITestResult result) {
			System.out.println("Test case "+result.getName()+" started");
		}
	
		@Override
		public void onTestSuccess(ITestResult result) {
			System.out.println("Test case "+result.getName()+" has passed");
		}
	
		@Override
		public void onTestFailure(ITestResult result) {
			System.out.println("Test case "+result.getName()+" has failed");
			
			try {
				ScreenShot.getScreenshotWithFilename(driver, result.getName());
			} catch (IOException e) {
				System.out.println("Exception arrived while capturing the screenshot");
			}
		}
	
		@Override
		public void onTestSkipped(ITestResult result) {
			System.out.println("Test case "+result.getName()+" has skipped");
		}
	
		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
		}
	
		@Override
		public void onTestFailedWithTimeout(ITestResult result) {
			
		}
	
		@Override
		public void onStart(ITestContext context) {
			System.out.println("Test tag "+context.getName()+" has started");
		}
	
		@Override
		public void onFinish(ITestContext context) {
			System.out.println("Test tag "+context.getName()+" has completed");
		}

//	Source --> Add unimplemented method
	
	
	
	
	
}
