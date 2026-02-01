package oopt1;

//when FuntionalInterface annotation is used it gives error when more than methods are found in interface.
@FunctionalInterface 
interface A{
	void show();
}


public class Demo {
	public static void main(String[] args) {
	//now will use lambda expressions to reduce Anonymous inner class code
	//we need not mention object A, method just what to define is required. all these will look after by lambda expression ->
	//this can be used only with @FuntionalInterface
		
		A obj = () ->  System.out.println("in show() method");
		obj.show();
   }
}



