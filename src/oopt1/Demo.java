package oopt1;

//when FuntionalInterface annotation is used it gives error when more than methods are found in interface.
@FunctionalInterface 
interface A{
	void show(int i);
}


public class Demo {
	public static void main(String[] args) {
		//this is updated lambda expression using FuntionalInterface Annotation by passing parameters
		//here in bracket we need not mention type of variable lambda expression will look after it in JVM.
		
		A obj = (i) ->  System.out.println("in show() method" + " : " + i);
		obj.show(5);
   }
}



