package learncollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample11 {
	public static void main(String[] args) {
		
		
		
		// List<Integer> numbers = Arrays.asList(12,45,3,4,9);
		
		// if list is empty it give NoSuchElementException
		List<Integer> numbers = new ArrayList<Integer>();
		
		Optional<Integer> first = numbers.stream().findAny();
		 System.out.println(first);
		 
		 //Integer integer = first.get();// get method provide number
		// System.out.println(integer);
		 
		
		 Integer i = first.
		 orElseThrow(()->new ArithmeticException("List is empty"));
		 
		 
		 
	}

}
