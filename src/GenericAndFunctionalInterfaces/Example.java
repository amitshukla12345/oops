package GenericAndFunctionalInterfaces;
import java.util.function.Predicate;
public class Example {
public static void main(String[] args) {
	Predicate<Integer> isEven=new Predicate<Integer>() {
		
		public boolean test(Integer t) {
			return t%2==0;
		}
		               
	};
	boolean ans = isEven.test(10);
	System.out.println(ans);
}
}
