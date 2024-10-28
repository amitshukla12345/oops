package learncollection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExample7 {
	public static void main(String[] args) {
		
		// "Hello" length(); // 5
		
		// map Stream
		
		List<Integer> numbers = Arrays.asList(12,5,6,7);
		
		Function<Integer, Integer> squareFunction=(n)->n*n;
		List<Integer> square = numbers.stream()
				.map(squareFunction)
				.collect(Collectors.toList());
		
		System.out.println(square);
		
		List<Integer> collect = numbers.stream().map(n->n*10)
				.collect(Collectors.toList());
		
		System.out.println(collect);
		
		
		
		
	}

}
