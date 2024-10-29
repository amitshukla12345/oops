package learncollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample10 {
	public static void main(String[] args) {
		
		//List<Integer> numbers = Arrays.asList(1,3,6,2);
		
		List<Integer> numbers=new ArrayList<Integer>();
		
		Optional<Integer> reduce = numbers.stream().reduce((a,b)->a+b);
		
		System.out.println(reduce);
		
		
		System.out.println("----------------------");
	
		Integer integer = reduce.get();
		
		System.out.println(integer);
		
		System.out.println("----------------------");
		
		
		Integer i = reduce.orElseThrow(()->new RuntimeException("List is empty"));
		
		System.out.println(i);
		
	}

}
