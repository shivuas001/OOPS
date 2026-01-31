package oopt1;

class A{
	public void show()
	{
		System.out.println("in A show");
	}
}
class Bb extends A{
//@Override is an Annotation and we have many in build annotations in java and we can create of our own.
//annotation are basically to supply extra information to compile to help in fixing bugs
//@Override whill try inform compiler i am try to override help to solve bugs.here i did not use proper method to override it shows error
     @Override
	public void shov()
	{
		System.out.println("in B show");
	}
}

public class Demo {
	public static void main(String[] args) {
	 
		Bb obj = new Bb();
		obj.show();
	
   }
}



