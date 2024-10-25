package learncollection;

import java.util.ArrayList;
import java.util.List;

public class StreamExample3 {
 public static void main(String[] args) {
	
	 List<Product> products= new ArrayList<Product>();
	 
	 products.add(new Product (101,"Laptop",50000));
	 products.add(new Product (102,"Mobile",35000));
	 products.add(new Product (103,"Headphone",7000));
	 
	 products.stream().forEach(p->System.out.println(p.getName()));
	 
	 products.stream().forEach(p->System.out.println(p.getName()+ " "+(p.getPrice()*0.8)));
	
	 
	 
	 
}
}
