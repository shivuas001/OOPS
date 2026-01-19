package oopt1;

class Mobile{
	String brand;
	int price;
	static String name;

//Static Block to mention static variable
	static
	{
		name = "";
		System.out.println("static block called");
	}
//Constructor
	public Mobile()
	{
		brand = "";
		price = 200;
		System.out.println("Constructor block called");
	}
	
}

public class Demo {

	public static void main(String[] args) {
	//we have two objects so two times the constructor will call
	//but has name var is static we want call it once so static block is used
		Mobile obj1 = new Mobile();
		Mobile obj2 = new Mobile();
		
	
	}
	
}

