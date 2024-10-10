package Exceptionhandling;

public class Example4 {
	public static void main(String[] args) {
	
		String s="Laptop";
		try
		{
			System.out.println(s.charAt(20));
		}
		catch(StringIndexOutOfBoundException e)
	}
	{
		System.out.println("invalid index");
	}

}
