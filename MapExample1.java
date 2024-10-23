package Learncollection;

import java.util.HashMap;
import java.util.Set;

public class MapExample1 {
	public static void main(String[] args) {
		
		HashMap<Integer, String> students=new HashMap<Integer, String>();
		
		students.put(101, "Gurjeet");
		students.put(102, "Shriya");//
		students.put(103, "Joel");
		students.put(null,null);
		students.put(101, "rohit");
		
		
		System.out.println(students);
		
		System.out.println(students.get(1));
		
		System.out.println(students.getOrDefault(1011, "Hello"));
		
		System.out.println("------------------------------------------------");
		
		System.out.println(students.remove(101));
		System.out.println(students);
		
		System.out.println("------------------------------------------------");
		
		System.out.println(students.keySet());
		
		System.out.println("------------------------------------------------");
		
		Set<Integer> keys = students.keySet();
		 
		for(Integer k:keys)
			
			System.out.println(k+" "+students.get(k));
		
		System.out.println("------------------------------------------------");
		
		System.out.println(students.containsKey(102)); // contains pass the values in  boolean forms
		
		System.out.println(students.containsValue("Gurjeet"));
		

		
		
		
		
		
		
		
	
		
	}

}
