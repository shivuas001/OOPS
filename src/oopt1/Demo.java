package oopt1;
import oopt2.*;

//we can access protected present in another package as subclass
class C extends B {
	public void abc()
	{
		System.out.println(marks);
	}
}


public class Demo {

	public static void main(String[] args) {
          A obj = new A();
    //we cant use protected present in another package as non-subclass
          System.out.println(obj.marks);
      
   
          B obj1 = new B();
          System.out.println(obj1.marks);
	}
}


