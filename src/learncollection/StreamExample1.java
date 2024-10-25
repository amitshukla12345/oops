package learncollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
public class StreamExample1 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for(int i=1;i<=20;i++)
		{
			list.add(i);
		}
		System.out.println(list);
		
		System.out.println("-----------------------------------");
		
		Stream<Integer> stream = list.stream();
		
		// forEach   map filter reduce
		Consumer<Integer> c=(i)->System.out.println(i*i);
		stream.forEach(c);
		
		System.out.println("-----------------------------------");
		
		List<String> names = Arrays.asList("pooja","Amit","Joel","Joel","Shriya","Gurjeet","Hamzaa");
		Stream<String> namesStream = names.stream();
		
		//Consumer<String> nameConsumer=(n)->System.out.println(n);
		
		//Consumer<String> nameConsumer=(n)->System.out.println(n.charAt(0));
		
		Consumer<String> nameConsumer=(n)->System.out.println(n+ " "+n.length());
		
		namesStream.forEach(nameConsumer);
		
		
		
	}

}
