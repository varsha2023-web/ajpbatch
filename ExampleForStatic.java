package day8;


class Test {
	
	//Static members
	static int a, b; //Static variables
	
	static //Static block
	{
		System.out.println("Inside static block");
		a = 10;
		b = 20;
	}
	
	static void fun1() //Static method
	{
		System.out.println("Inside static method");
	}
	
	//Instance members
	int x, y;
	{
		System.out.println("Inside instance block");
	}
	void fun2()
	{
		System.out.println("Inside instance method");
	}
	Test()
	{
		System.out.println("Inside constructor");
		x = 20;
		y = 30;
	}
	
}
public class ExampleForStatic {

	public static void main(String[] args) {
		
		//calling the static method
		Test.fun1();
		
		Test t = new Test();
		//calling the instance method
		t.fun2();
		
	}

}
