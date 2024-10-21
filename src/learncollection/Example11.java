package learncollection;

import java.util.Scanner;
import java.util.Stack;

public class Example11 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Stack<Product> products=new Stack<Product>();
		
		products.push(new Product (101,"Laptop",50000));
		products.push(new Product(102,"Mobile",35000));
		products.push(new Product(103,"Headphones",7000));
		
		System.out.println("Do you want to delete last added item?(y/N)");
		
		System.out.println(products.peek());
		
		char decision=sc.next().charAt(0);
		if(decision=='Y'|| decision=='y')
		{
			System.out.println(products.peek().getName()+ "deleted");
			
		}
		
		
		
	}

}
