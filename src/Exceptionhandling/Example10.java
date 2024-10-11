package Exceptionhandling;

public class Example10 {
	public static void checkNumber(int n) throws NegativeNumberException
	{
		if(n>0)
		{
			System.out.println();
		}
		else
		{
			throw new NegativeNumberException("Number is negative");
		}
	}
	
	
public static void main(String[] args) {
	
	try {
		checkNumber(-5);
	} catch (NegativeNumberException e) {
		// TODO Auto-generated catch block
	System.out.println(e);
	
	}
	
}
}
