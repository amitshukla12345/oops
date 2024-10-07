
package StringExample;
import java.util.Scanner;
public class Example3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	String password="x#123";
	System.out.println("Enter password");
	String pwd=sc.nextLine();
	sc.close();
	
	//  if(password.compareTo(pwd)==0)
	
	if(password.equals(pwd))
		System.out.println("login succesfull");
	else
		System.out.println("Login failed");
	
	
	
	
	
	
	
}
}
