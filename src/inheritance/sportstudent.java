package inheritance;

public class sportstudent extends student {
	int gracemarks;
	String sportsName;
	
	sportstudent(int rollno,String name, int graceMarks,String sportName)
	{
		super(rollno,name,marks);
		this.graceMarks=graceMarks;
		this.sportsName=sportsName;
		
	}

}
