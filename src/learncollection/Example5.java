package learncollection;

import java.util.LinkedList;
import java.util.function.Predicate;
public class Example5 {
	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(12);
		list.add(15);
		list.add(20);
		
		System.out.println(list);
		
		for(Integer i:list)
		{
			System.out.println(i);
		}
		
		System.out.println("----------------------------------");
		
		list.add(2,100);// add will shift the thing
		System.out.println(list);
		
		System.out.println("----------------------------------");
		
		Integer i = list.get(2);
		
		System.out.println("----------------------------------");
		list.set(0, 200); //set will replace the thing 
		System.out.println(list); 
		
		System.out.println("----------------------------------");
		
		Predicate<Integer> even=(num)->num%2==0;
		list.removeIf(even);
		System.out.println(list);
	}

}
