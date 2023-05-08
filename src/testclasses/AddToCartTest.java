package testclasses;

import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {
	
	
	@Test(priority = 7)
	public void selectItem()
	{
		addtocart.selectBrandSize();
	}
	
	@Test(priority = 8)
	public void verifyAddToCart()
	{
		addtocart.addItemToCart();
	}

	
	@Test(priority = 9)
	public void searchOnCartPage()
	{
		addtocart.searchItems("wine");
		
		addtocart.getSearchResults();
	}
}
