package Rivision;

interface I2
{
	void display();
	}
public class Example1 {
	public static void main(String[] args) {
		I2 i=new I2() {
			public void display()
			{
				System.out.println("Display method from I2");
			}
		};
		
		i.display();
		  i.display();
		  I2 j=()->System.out.println("Display method from I2(lambda)");
		  j.display();
	}

}
