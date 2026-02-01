package oopt1;

//when FuntionalInterface annotation is used it gives error when more than methods are found in interface.
@FunctionalInterface 
interface A{
	void show();
}


public class Demo {
	public static void main(String[] args) {
	 //we used Anonymous inner class here
		A obj = new A() {
			public void show() {
				System.out.println("in show() method");
			}
		};
		obj.show();
	
   }
}



