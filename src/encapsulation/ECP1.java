package encapsulation;

public class ECP1 {
	public static void main(String[] args) {
		student s1=new student();
		s1.setId(101);
	System.out.println(s1.getId());
		int id= s1.getId();
		System.out.println();
		s1.setName("amit");
	String name=s1.getName();
	System.out.println(name);
	
id = s1.getId("U@1");
	System.out.println(id);
	
		
		
		
	}

}
