package learncollection;

import java.util.ArrayList;

public class ListExample1 {

	public static void main(String[] args) {
		
		ArrayList list= new ArrayList<>();
		list.add(56);
		list.add("A");
		list.add(23.96);
		list.add(null);
		
		System.out.println(list);
		
		for(Object i:list)
		{
			System.out.println(i);
		}
	}
}
