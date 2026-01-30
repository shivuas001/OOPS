package oopt1;

abstract class A{
	public abstract void show();
}

public class Demo {
	public static void main(String[] args) {
	//when we have only one abstract method to define in other other class instead using anonymous inner class it works
	// we can also use if we have multiple abstract method.
		A obj = new A() 
		{
			public void show() 
			{
				System.out.println("in new show");
			}
		};
		obj.show();
		  
   }
}


