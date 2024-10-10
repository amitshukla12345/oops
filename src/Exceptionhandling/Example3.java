package Exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Example3 {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		try
		{
		
		System.out.println("Enter first number");
		
		 int c=Sc.nextInt();
		 
		 System.out.println("Enter second number");
		 int d=Sc.nextInt();
		 System.out.println(c/d);
		 
		}
		catch(InputMismatchException e)
		{
			System.out.println("You cannot divide number ");
		}
		
		 
		
	}

}
