package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest
{
	
	
	@Test
	public void verifyTitle()
	{
		String title = search.getTitleOfPage();
		
		boolean ispresent = title.contains("Mumbai");
		
		Assert.assertEquals(ispresent, true);
	}
	
	@Test
	public void searchProduct()
	{
		search.searchItems("Malt");
	}

}
