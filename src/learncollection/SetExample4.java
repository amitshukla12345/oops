package learncollection;

import java.util.Comparator;
import java.util.TreeSet;

public class SetExample4 {
public static void main(String[] args) {
	
	//sortedset Navigableset
	
	Comparator<Integer> c=(o1,o2)->o1-o2;
	
	
TreeSet<Integer> treeSet=new TreeSet<Integer>(c);
treeSet.add(20);
treeSet.add(20);
treeSet.add(90);
treeSet.add(1);
treeSet.add(5);
//treeSet.add(null); null values are not allowed


System.out.println(treeSet);
}
}
