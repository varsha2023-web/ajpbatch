package day7;

class Car{
	private String name;
	private int mileage;
	private int cost;
	
	//Setter method
	public void setData(String x,int y,int z)
	{
		name = x;
		mileage = y;
		cost = z;
	}
	
	//Getter methods
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
public class ExampleForEncapsulation {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.setData("Maruthi 600", 60, 200000);
		System.out.println(c.getName());
		System.out.println(c.getMileage());
		System.out.println(c.getCost());
	}

}
