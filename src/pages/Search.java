package pages;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search {

	WebDriver driver;

	By searchbox = By.xpath("//*[@class='wbr-main-search']");

	By searchresults = By.xpath("//*[@class='typeahead__list']//span[@class='title']");

	WebDriverWait wait;

	public Search(WebDriver driver) {
		this.driver = driver;

		wait = new WebDriverWait(driver, Duration.ofSeconds(60));

	}

	public void searchItems(String searchtext) {
		driver.findElement(searchbox).sendKeys(searchtext);

	}

	public String getTitleOfPage() {
		String titleofpage = driver.getTitle();

		return titleofpage;
	}

	public void getSearchResults() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(searchresults));

		List<WebElement> searchresult = driver.findElements(searchresults);

		WebElement optedvalue = null;
		for (WebElement result : searchresult) {

			String value = result.getText();

			System.out.println(value);

			if (value.equals("THE BALVENIE 17 YRS SINGLE MALT")) {
				optedvalue = result;

			}

		}
		optedvalue.click();
	}

}
