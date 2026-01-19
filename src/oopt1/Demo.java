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

	public static void main(String[] args) throws ClassNotFoundException {
	
		//when we want to create object, class is loaded from library and object is created.
		//when class loads, first static block is called. then object is created and constructor is called
		
		//when u want to load class but u dont have object.....
		
		//here it loads class to call static block.its an method to load class.
		Class.forName("oopt1.Mobile");
		 
	
	}
	
}

