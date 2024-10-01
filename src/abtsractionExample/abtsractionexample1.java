package abtsractionExample;

abstract class Electronics
{
	abstract void start();
	abstract void stop();
	}
class TV extends Electronics
{
	void start()

	
	{
		System.out.println("TV started");
	}
	void stop()
	{
		System.out.println("TV Turned off");
	}
	}
class AC extends Electronics
{
	void start()

	{
		System.out.println("AC started");
	}
	void stop()
	{
		System.out.println("AC Turned off");
	}
	}

public class abtsractionexample1 {
	public static void main(String[] args) {
		
		new TV().start();
		new AC().start();
		
	}

}
