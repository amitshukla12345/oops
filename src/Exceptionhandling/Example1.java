package Exceptionhandling;

public class Example1 {
	public static void main(String[] args) {
		System.out.println("Hello");
		try
		{
			System.out.println(5/1);
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("code after exception");
	}

}
