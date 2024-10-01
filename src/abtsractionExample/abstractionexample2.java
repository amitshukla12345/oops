package abtsractionExample;

abstract class Product
{
	abstract void details();
	}
class Mobile extends Product
{
	void details()
	{
		System.out.println("Mobile details");
	}
	}

public class abstractionexample2 {
	public static void main(String[] args) {
		
		Mobile mobile= new Mobile();
		mobile.details();
		
		// Anonymous Inner class
		Product laptop= new Product() {
			void details()
			{
				System.out.println("Laptop details");
			}
		};
	laptop.details();
	
	Product headphone=new Product() {
		void details()
		{
			System.out.println("headphone details");
		}
	};
	headphone.details();
	
	
	}
	


}
