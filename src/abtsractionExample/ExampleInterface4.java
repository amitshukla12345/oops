package abtsractionExample;

@FunctionalInterface
interface Test
{
	boolean isEven(int n);
	}
// (n)->n%2==0;

public class ExampleInterface4 {
	public static void main(String[] args)
	{
		
		Test t1=(n)->n%2==0;
		boolean ans = t1.isEven(50);
		System.out.println(ans);
	}
	

}
