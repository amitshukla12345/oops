package Rivision;
@FunctionalInterface
interface I3
{
	void printAnyName(int n);
	
}
public class Example2 {
	public static void main(String[] args) {
		
		I3 amit=(n)->{
			for(int i=1;i<=n;i++)
			{
				System.out.println("amit");
			}
		};
		amit.printAnyName(6);
		
	}
	

}
