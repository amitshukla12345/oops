package inheritance;

public class CollegePassOutPerson extends SchoolPassOutPerson{
	
	String collegeCertificateNo;
	CollegePassOutPerson(int id, String name, String schoolCertificateNo,
			String collegeCertificateNO)
	{
	super(id,name,schoolCertificateNo);
	this.collegeCertificateNo=collegeCertificateNo;
	}

}
