package inheritance;

public class sportstudent extends student {
	int gracemarks;
	String sportsName;
	
	sportstudent(int rollno,String name, int gracemarks,String sportName)
	{
		super(rollno,name,marks);
		this.gracemarks=gracemarks;
		this.sportsName=sportsName;
		
	}

}
