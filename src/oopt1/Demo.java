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
	// we call call the methoud using this anonymous object
	//but cant reuse it with other methods
	    new A().show();  
	}
	
}


