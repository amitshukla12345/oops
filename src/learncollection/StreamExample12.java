package learncollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample12 {
	public static void main(String[] args) {
		
	ArrayList<Integer> list = new ArrayList<Integer>();
	
		 for(int i=1; i<=100; i++)
		 {
			 list.add(i);
			 
		 }
		 System.out.println(list);
		 Optional<Integer> Any = list.parallelStream().findAny();
		 System.out.println(Any);
		 
		 list.parallelStream().forEach(n-> System.out.println(n));
		 
		 System.out.println("-------------------------------------");
		 
		 boolean evenMatch = list.stream().anyMatch(n->n%2==0);
		 System.out.println(evenMatch);
		 
		 boolean greaterthan1000 = list.stream().anyMatch(n->n>1000);
		 System.out.println(greaterthan1000);
		 
		 boolean allMatch = list.stream().allMatch(n->n>0);
		 System.out.println(allMatch);
		 
		 boolean noneMatch = list.stream().noneMatch(n->n==1);
		 System.out.println(noneMatch);
		 
		 
		 
		 
		 
	
		 
	}

}
