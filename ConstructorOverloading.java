package day8;

/* What is constructor overloading?
 * ---------------------------------
 * Having multiple constructors within a class is referred as 
 * constructor overloading.
 * 
 * Why do we do it?
 * ---------------
 * Constructor overlaoding is required so that different objects can be 
 * initialized differently.
 * 
 */
class Car
{
	private String name;
	private int mileage;
	private int cost;
	
	public Car() //Zero parameterized constructor
	{
		name = "BMW";
		mileage = 10;
		cost = 700000;
	}
	
	public Car(String name, int mileage, int cost) //Parameterized constructor
	{
		this.name = name;
		this.mileage = mileage;
		this.cost = cost;
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

public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		System.out.println(c1.getName());
		System.out.println(c1.getMileage());
		System.out.println(c1.getCost());
		
		System.out.println("=========================");
		Car c2 = new Car("Ferrari", 5, 9000000);
	    System.out.println(c2.getName());
		System.out.println(c2.getMileage());
		System.out.println(c2.getCost());

	}

}
