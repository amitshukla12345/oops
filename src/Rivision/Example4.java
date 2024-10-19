package Rivision;
@FunctionalInterface
interface I4
{
	int add(int a, int b);
	}

public class Example4 {
	public static void main(String[] args) {
		I4 a= new I4() {
			public int add(int a, int b)
			{
				return a+b;
			}
			 
		};
		System.out.println(a.add(12, 12));
		
		I4 b=(c,d)->c+d;
		System.out.println(b.add(6, 5));
		
		
	}
	

}
