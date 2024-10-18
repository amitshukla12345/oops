package learncollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Example6 {

	public static void main(String[] args) {
		
		LinkedList<String> names= new LinkedList<String>();
		names.add("chetan");
		names.add("gurjeet");
		names.add("joel");
		names.add("shriya");
		
	names.removeIf(name->name.startsWith("c"));
	System.out.println(names);
	
	System.out.println("---------------------");
	
	LinkedList<Product> products= new LinkedList<Product>();
	
	products.add(new Product (101,"Laptop",50000));
	products.add(new Product(102,"Mobile",35000));
	products.add(new Product(103,"Headphones",7000));
	

	
	System.out.println(products);
	
products.removeIf(p->p.getPrice()<10000);
System.out.println(products);



System.out.println(products);

		
		
		
	}
}
