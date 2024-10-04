package abtsractionExample;

@FunctionalInterface
interface I8
{
	int square(int n);
	}
interface I7
{
	int add(int a, int b);
	
	}
interface I6
{
	void printName(String name);
	}
public class ExampleInterface5 {
	public static void main(String[] args ) {
		
		I6 obj=(name)->System.out.println("My name is "+name);
		obj.printName("Amit");
		
		I6 obj1=(name)->{
			for(int i=1;i<=100;i++)
			{
				System.out.println(name);
			}
		};
		
		obj1.printName("Amit");
		
		I7 i=(a,b)->a+b;
		System.out.println(i.add(12, 12));
		
		I8 e=(n)->n*n;
		System.out.println(e.square(5));
		
		
	}

}
