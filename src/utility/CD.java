package utility;

public class CD implements W, T
{

	@Override
	public void getScreenShot() {
		System.out.println("screenshot");
		
	}

	@Override
	public void get() {
		System.out.println("get method");
		
	}
	
	public static void main(String[] args) {
		
		W driver = new CD();
		
		driver.get();
		
		T dt = (T)driver;// type casting
		
		dt.getScreenShot();
		
	}

}
