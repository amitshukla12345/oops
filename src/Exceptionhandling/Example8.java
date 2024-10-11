package Exceptionhandling;

public class Example8 {

	public static void throwException()
	{
		throw new NullPointerException("Priti");
	}
	public static void main(String[] args) {
		System.out.println("Hello");
		try
		{
		throwException();
		}catch(NullPointerException e)
	
		{
			System.out.println("Bye");
		}
		
	
		
	}
}
