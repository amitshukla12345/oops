package learncollection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample9 {
 public static void main(String[] args) {
	
 List<Product> products= new ArrayList<Product>();
	 
	 products.add(new Product(101,"Laptop",50000));
	 products.add(new Product(102,"Mobile",35000));
	 products.add(new Product(103,"Headphone",7000));
	 
List<String> names = products.stream()
			 .map(a->a.getName())
			 .collect(Collectors.toList());
       System.out.println(names);
       
       
       
	 
}
}
