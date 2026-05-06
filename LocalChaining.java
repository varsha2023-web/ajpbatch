package day8;

/* What is local chaining?
 * -----------------------
 * Local chaining is the process of a constructor of a class calling another
 * constructor of the same class.
 * 
 * Why do we do it?
 * ----------------
 * Local chaining allows you to maintain your initialization from a
 * single location, while providing multiple constructors to the user.
 * 
 * How to achieve local chaining?
 * ------------------------------
 * Local chaining can be achieved using this() function call.
 * this() should compulsorily be the first line in the constructor.
 */
class Car1
{
	private String name;
	private int mileage;
	private int cost;
	
	public Car1()
	{
		name = "BMW";
		mileage = 10;
		cost = 7000000;
	}
	
	public Car1(String name, int mileage, int cost) //Parameterized constructor
	{
		this();
		/*this.name = name;
		this.mileage = mileage;
		this.cost = cost;*/
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getMileage()
	{
		return mileage;
	}
	
	public int getCost()
	{
		return cost;
	}
}
public class LocalChaining {

	public static void main(String[] args) {
		
		Car1 c1 = new Car1("Ferrari", 5, 9000000);
		System.out.println(c1.getName());
		System.out.println(c1.getMileage());
		System.out.println(c1.getCost());

	}

}
