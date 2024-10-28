package learncollection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample8 {
 public static void main(String[] args) {
	
 List<String> names = Arrays.asList("pooja","Amit","Joel","Joel","Shriya","Gurjeet","Hamzaa");
	
 List<Integer> length = names.stream()
		 .map(name->name.length())
		 
		 .collect(Collectors.toList());
 
 System.out.println(length);
 
 
	 
}
}
