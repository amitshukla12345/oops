package learncollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Set_example1 {
public static void main(String[] args) {
	
	HashSet<Integer> set= new HashSet<Integer>();
	set.add(14);
	set.add(14);
	set.add(18);
	set.add(23);
	set.add(null);
	
	System.out.println(set);
	
	System.out.println("-----------------------------------------");
	
	List<Integer> list = Arrays.asList(12,67,67,89,90,90);
	
	System.out.println(list);
	
	HashSet<Integer> hashSet = new HashSet<Integer>(list);
	System.out.println(hashSet);
	
	
}
}
