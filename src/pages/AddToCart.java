package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {

	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath = "//*[@id='term-656']")
	WebElement amrutcheckbox;

	@FindBys({
		@FindBy(xpath = "//*[@id='flush-5']"),
		@FindBy(xpath = "//*[@id='term-5']")
	
	})
	WebElement size;
	
//	@FindBy(xpath = "//*[@id='term-5']")
//	WebElement size;
	
	@FindAll({ 
	   @FindBy(xpath = "//*[text()='APPLY']")
	, @FindBy(xpath = "//*[text()='APPLYButton']")
	   })
	WebElement applybutton;

	@FindBy(xpath = "//*[text()='ADD TO CART']")
	WebElement addtocartbutton;

	@FindBy(xpath = "//*[@class='typeahead__list']//span[@class='title']")
	List<WebElement> searchresults;

	@FindBy(xpath = "//*[@class='wbr-main-search']")
	WebElement searchbox;

	public AddToCart(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));

	}

	public void selectBrandSize() {
		amrutcheckbox.click();

		size.click();

		applybutton.click();
	}

	public void addItemToCart() {
		addtocartbutton.click();
	}

	public void searchItems(String searchtext) {

		searchbox.sendKeys(searchtext);
	}

	public void getSearchResults() {
		wait.until(ExpectedConditions.visibilityOfAllElements(searchresults));

		for (WebElement result : searchresults) {

			String value = result.getText();

			System.out.println(value);

		}
	}

}
