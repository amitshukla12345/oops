package Rivision;

import java.util.function.Predicate;

public class Example6 {
	public static void main(String[] args) {
		Predicate<String> p1=new Predicate<String>()
				{
			public boolean test(String n) {
			return n.length()>=3;
		}
	};
	boolean ans=p1.test("Gurjeet");
	boolean ans2=p1.test("A");
	System.out.println(ans);
	System.out.println(ans2);

}
}
