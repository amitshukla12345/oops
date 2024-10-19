package Rivision;

import java.util.function.Predicate;

public class Example5 {
	public static void main(String[] args) {
		Predicate<Integer> p1=new Predicate<Integer>() {
			public boolean test (Integer i)
			{
				return i%7==0;
			}
		};
		boolean ans=p1.test(49);
		System.out.println(ans);
		
		Predicate<Integer>p2=(i)->i%7==0;
		boolean ans2= p2.test(71);
		System.out.println(ans2);
		
	}

}
