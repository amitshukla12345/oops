package classesAndObjects;

public class amit {
	public static void main(String[] args) {
		product p1= new product();
		p1.setProductDetails(101, "Laptop", 50000);
		
		product p2=new product();
		p2.setProductDetails(102, "mobile", 35000);
		
		System.out.println("pay:"+p2.discount());
	}

}
