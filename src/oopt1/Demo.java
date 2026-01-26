package oopt1;

class A{
	
	public void show()
	{
		System.out.println("in show method");
	}
	
	public A()
	{
		System.out.println("in Constructor");
	}
}


public class Demo {

	public static void main(String[] args) {
	//anonymous object  bcoz it do not have a name that is reference
	//cons is we cant reuse this object again
	    new A();  
	}
	
}


