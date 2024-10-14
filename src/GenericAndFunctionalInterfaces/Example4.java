package GenericAndFunctionalInterfaces;

import java.util.function.Consumer;

public class Example4 {
	public static void main(String[] args) {
		Consumer<Integer> sqr=new  Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t*t);
				
			}
			
			
		};
		sqr.accept(10);
	}

}
