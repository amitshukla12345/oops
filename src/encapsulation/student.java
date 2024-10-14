package encapsulation;

public class student {
	private int id;
	private String name;
	private int age;
	public void setId(int id)
	{
		this.id=id;
	}
	
	public student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId()
	{
		return this.id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId(String password)
	{
		if(password.equals("U@1"))
			return this.id;
		else
			return 0;
		
		
	}

} 
