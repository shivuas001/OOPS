package oopt1;

class Mobile{
	String brand;
	int price;
//its is static variable which shared by all objects as name in both objects are same 
	static String name;
	
	public void display() {
		System.out.println(brand + " : " + price + " : " + name);
	}
}

public class Demo {

	public static void main(String[] args) {
		
		Mobile obj1 = new Mobile();
		obj1.brand = "redmi";
		obj1.price = 12000;
	//correct type to call static variable is by its class name not by its objects name bcoz they share same name
		Mobile.name = "smartphone";
		
		Mobile obj2 = new Mobile();
		obj2.brand = "vivo t3";
		obj2.price = 22000;
		Mobile.name = "smartphone";
		
		Mobile.name = "phone";
		
		obj1.display();
		obj2.display();
		
	
	}
	
}

