package oopt1;

class Mobile{
	String brand;
	int price;
	static String name;

	public void display()
	{
		System.out.println(brand + " : " + price + " : " + name);
	}
	
//non static variables cannot be called in static method so we need to the which obj to be called	
	public static void display1(Mobile obj1)
	{
		System.out.println(obj1.brand + " : " + obj1.price + " : " + name);
	}
	
}

public class Demo {

	public static void main(String[] args) {
	     Mobile obj1 = new Mobile();
	     obj1.brand = "redmi";
	     obj1.price = 34033;
	     Mobile.name = "phone";
	     
	     Mobile obj2 = new Mobile();
	     obj2.brand = "redmi 4a";
	     obj2.price = 545422;
	     Mobile.name = "phone";
	     
	     obj1.display();
	     obj2.display();
	     
	   //we need to call this method using class bcoz it is static method 
	     Mobile.display1(obj1);
	     
	
	}
	
}

