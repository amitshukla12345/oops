package GenericAndFunctionalInterfaces;

import java.util.function.Predicate;

import encapsulation.student;

public class Example3 {
	public static void main(String[] args) {
		
		Predicate<student> checkAge=new Predicate<student>()
				{
			public boolean test (student t) {
				return t.getAge()>=18;
			}
				};
				
				student student = new student(101, "Amit", 20);
				 boolean ans = checkAge.test(student);
				 System.out.println(ans);
				 
		
	}

}
