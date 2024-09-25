package statickeyword;

 class counter1 
{
	static int count=0;
	counter1()
	{
		count++;
		System.out.println(count);
		
	}

}

public class counter{
	public static void main(String[] args) {
		new counter1();
		new counter1();
		new counter1();
		new counter1();
		new counter1();
	}
}
