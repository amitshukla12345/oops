package learncollection;
 import java.util.TreeMap;
public class MapExample3 {
	public static void main(String[] args) {
		
		TreeMap<Integer, Product>products=
				new TreeMap<Integer, Product>((i1,i2)->i2-i1);
		
		
		
		products.put(101, new Product(101,"Laptop", 50000));
		products.put(102, new Product(102,"Mobile",350000));
		products.put(103, new Product(103,"Mobile",30000));
		
		System.out.println(products);
		Product laptop = products.get(101);
		System.out.println(laptop.getPrice());
		
		System.out.println("----------------------------------------------");
		
	
		
		
		
	}

}
