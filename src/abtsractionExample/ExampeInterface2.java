package abtsractionExample;

public class ExampeInterface2 {
	public static void main(String[] args) {
		Bank sb=new ICICI();
		sb.Details();
		sb.address();
		sb.methodBank();
		Bank.staticmethod();
		
		Bank HDFC= new Bank() {
			public void Details()
			{
				System.out.println("HDFC Bank");
			}
			public void address()
			{
				System.out.println("address of HDFC bank");
			}
			
		};
		
		HDFC.address();
		HDFC.Details();
		
		
		
	}

}
