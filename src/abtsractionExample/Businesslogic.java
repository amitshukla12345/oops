package abtsractionExample;

public abstract class Businesslogic {
	abstract void coupons();

}
class Weekdays extends Businesslogic
{
	void coupons()
	{
		System.out.println("Wed20");
	}
	}
class WeekEnd extends Businesslogic
{
	void coupons()
	{
		System.out.println("WeeKENDFUN");
	}
	}
