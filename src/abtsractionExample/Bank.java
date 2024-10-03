package abtsractionExample;

public interface Bank {
	void Details();
	void address();
	
	default void methodBank()
	{
		System.out.println("Default mehtod");
	}
	
	static void staticmethod()
	{
		System.out.println("Static method From Bank");
	}

}
