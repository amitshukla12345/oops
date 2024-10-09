package encapsulation;

public class student {
	private int id;
	private String name;
	private int age;
	public void setId(int id)
	{
		this.id=id;
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
	
	
	
	public int getId(String password)
	{
		if(password.equals("U@1"))
			return this.id;
		else
			return 0;
	}

}
