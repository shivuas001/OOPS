package oopt1;

class A{
	public void show() 
	{
		System.out.println("in A show");
	}
	
}

public class Demo {
	public static void main(String[] args) {
	//this anonymous inner class where inner class is created inside demo class but it does not have an class name
	//once we call the method it overides previous class and class anonymous class method
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


