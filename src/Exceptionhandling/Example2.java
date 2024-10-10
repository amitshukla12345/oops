package Exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		
		Scanner Sc=new Scanner(System.in);
		 System.out.println("Enter number");
		 
		 try
		 {
			 int n=Sc.nextInt();
		 }
		 catch(InputMismatchException exc)
		 {
			 System.out.println("Invalid input");
		 }
		 System.out.println("code after taking input");
		
	}

}
