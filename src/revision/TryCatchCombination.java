package revision;

public class TryCatchCombination {
	
	
	public static void main(String[] args) {
		
		try {
		String s = "two";
		
		int i = Integer.parseInt(s);
		
		System.out.println(i);
		}
		
	
		catch(NullPointerException e)
		{
			
			System.out.println("Number format exception catch block");
		}
		
		catch (ArithmeticException e) 
		{
		System.out.println("Arithmetic catch block");
		}
		
	
		
		finally
		{
			System.out.println("finally block");
		}
		
	}

}
