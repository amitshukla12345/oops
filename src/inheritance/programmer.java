package inheritance;

public class programmer extends FulltimeEmployee{
	
	String programing_language;

	public programmer(int numberof_leaves, int insurance, String programing_language) {
		super(numberof_leaves, insurance);
		this.programing_language = programing_language;
	}

}
