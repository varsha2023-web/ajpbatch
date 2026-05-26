package inheritance;
class Plane{
	void Takeoff()//parent class
	{
		System.out.println("Plane is taking off ");
	}
	void fly()
	{
		System.out.println("Plane is flying");
	}
	void land()
	{
		System.out.println("Plan is landing");
	}
}
class CargoPlane extends Plane //child class
{
	void fly()
	{
		System.out.println(" Cargo Plane is flying at low heights");
  	}
	void CarryCargo() 
	{
		System.out.println("Cargo plane carries cargo");
	}
}
class PassengerPlane extends Plane //child class
{
	void fly()
	{
		System.out.println(" Passenger plane is flying at mid heights");
  	}
	void CarryPassenger() 
	{
		System.out.println("Passenger plane carries passenger");
	}
}
class FighterPlane extends Plane//child class
{
	void fly()
	{
		System.out.println(" Fighter  Plane is flying at great heights");
  	}
	void Carryweapon() 
	{
		System.out.println("Fighter plane carries weapons");
	}
}


public class TpesOfMethod {

	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		cp.Takeoff();//inherited method
		cp.fly();//overridden method
		cp.land();//inherited method
		cp.CarryCargo();//specialized method
		
		PassengerPlane pp = new PassengerPlane();
		pp.Takeoff();//inherited method
		pp.fly();//overridden method
		pp.land();//inherited method
		pp.CarryPassenger();//specialized method
		
		FighterPlane fp = new FighterPlane();
		fp.Takeoff();//inherited method
		fp.fly();//overridden method
		fp.land();//inherited method
		fp.Carryweapon();//specialized method
		
		
	}

}