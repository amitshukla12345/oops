package encapsulation;

public class Example2 {
 public static void main(String[] args) {
	product product = new product(101,"Laptop");
	System.out.println(product);
	
	product  product2 = new product(102, "mobile");
	System.out.println(product2);
}
}
