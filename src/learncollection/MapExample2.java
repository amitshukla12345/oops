package learncollection;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MapExample2 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		LinkedHashMap<String, String> phoneNumbers=
				new LinkedHashMap<String,String>();
		
		phoneNumbers.put("priti", "89451265");
		phoneNumbers.put("Gurjeet", "564578923");
		phoneNumbers.put("shriya", "56457823");
		
		System.out.println(phoneNumbers);
		
		//System.out.println(phoneNumbers.containsKey("Gurjeet")); 
		
		String name=sc.next();
	if(phoneNumbers.containsKey(name))
	{
		
		System.out.println("Your phone no is present"+phoneNumbers.get(name));
		System.out.println("Do you want to change it??(Y/N)");
		
		char decision=sc.next().charAt(0);
		if(decision=='y')
			
		{
			String newPhoneNo=sc.next();
			phoneNumbers.put(name, newPhoneNo);
		}

	}
	else
	{
		String phoneno= sc.next();
		phoneNumbers.put(name, phoneno);
	}
	
System.out.println(phoneNumbers);

	}

}
