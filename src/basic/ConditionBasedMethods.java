package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ConditionBasedMethods {

	public static void main(String[] args) {

		WebDriver driver = BaseTest.launchBrowser("https://www.amazon.in/");

		WebElement carticon = driver.findElement(By.xpath("//*[@id='nav-cart']"));

		boolean isdisplay = carticon.isDisplayed();
		
		System.out.println(isdisplay);// true

		WebElement hiddenelement = driver.findElement(By.xpath("//*[@id='glowValidationToken']"));

		boolean isdisplay2 = hiddenelement.isDisplayed();

		System.out.println(isdisplay2);// false

		WebElement searchbox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));

		boolean isenable = searchbox.isEnabled();

		System.out.println(isenable);
		
		
	}
	
	@Test
	public void isSelectedValidation() {
		
		WebDriver driver = BaseTest.launchBrowser("https://www.facebook.com/signup");
		
		WebElement radiobutton = driver.findElement(By.xpath("//*[@type='radio' and @value = '1']"));
		
		System.out.println("Before selecting status");
		
		boolean isselected = radiobutton.isSelected();
		
		System.out.println(isselected);
		
		radiobutton.click();
		
		System.out.println("After selecting status");
		boolean isselectedafter = radiobutton.isSelected();
		
		System.out.println(isselectedafter);
		
		
		
	}
	
	public void clickOnCheckbox(String companyname) {
		
		WebDriver driver = null;
		driver.findElement(By.xpath("//*[text()='"+companyname+"']/preceding-sibling::div/child::label/child::input")).click();
	}

}
