package testclasses;

import org.testng.annotations.Test;

public class SpiritsTest extends BaseTest {
	
	
	
	@Test(priority = 4)
	public void selectProduct()
	{
		spirit.selectSpirits();
	}
	
	@Test(priority = 5)
	public void sortByHighPrice() throws InterruptedException
	{
		Thread.sleep(3000);
		spirit.sortDropdown("Price High to Low");
		
	}
	
	
	@Test(priority = 6)
	public void sortByAlphabet() throws InterruptedException
	{
		Thread.sleep(3000);
		spirit.sortDropdown("Name A - Z");
	}
	
	
	

}
