package learncollection;
import java.util.TreeSet;
public class SetExample5 {
 public static void main(String[] args) {
	TreeSet<Integer>treeSet=new TreeSet<Integer>();
	treeSet.add(19);
	treeSet.add(100);
	treeSet.add(1);
	treeSet.add(35);
	treeSet.add(90);
	treeSet.add(500);
	
	System.out.println(treeSet);
	System.out.println(treeSet.higher(19));
	System.out.println(treeSet.lower(2));
	
	System.out.println("-------------------------------");
	
	System.out.println(treeSet.ceiling(190)); //ceiling means upper values
	
	System.out.println(treeSet.floor(350)); // floor means lower values
	
	System.out.println("---------------------------------");
	
	System.out.println(treeSet.headSet(100));
	System.out.println(treeSet.headSet(100,true));
	
	System.out.println("---------------------------------");
	
	System.out.println(treeSet.tailSet(35));
	System.out.println(treeSet.tailSet(35,false));
	
	System.out.println("-----------------------------------");
	
	System.out.println(treeSet.subSet(19, 100));
	System.out.println(treeSet.subSet(19,false,100,true));
	
	
	
	
	
	

}
}
