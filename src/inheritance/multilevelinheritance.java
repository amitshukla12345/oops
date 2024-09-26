package inheritance;

class P
{
	void method()
	{
		System.out.println("Method of P class");
	}
	}
class Q extendS P
class 	Q	
{
	void method()
	{
		System.out.println("Method of Q	class");
	}
	}
class R
{
	void method()
	{
		System.out.println("Method of R class");
	}
	}
class S
{
	void method()
	{
		System.out.println("Method of S class");
	}
	}

public class multilevelinheritance {

	public static void main(String[] args) {
		
		S s1=new S();
		s1.methodP();
		s1.methodQ();
		s1.methodR();
		s1.methodS();
		
	}
}
