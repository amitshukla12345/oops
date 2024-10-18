package learncollection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Example7 {
	
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(12,56,45,0,1);
	System.out.println(numbers);
	
LinkedList<Product> products= new LinkedList<Product>();
	
	
	Collections.sort(numbers);
	System.out.println(numbers);
	
	System.out.println("smallest Elements "+numbers.get(0));
	System.out.println("largest Element "+numbers.get(numbers.size()-1));


	
}
}
