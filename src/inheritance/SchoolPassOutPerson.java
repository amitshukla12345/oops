package inheritance;

public class SchoolPassOutPerson extends person {

	String schoolCertificateNo;
	 SchoolPassOutPerson(int id,String name,String schoolCertificateNo)
	 {
		 super(id,name);
		 this.schoolCertificateNo=schoolCertificateNo;
	 }
}
