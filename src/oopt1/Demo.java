package oopt1;
import oopt2.*;
//if variables are private it can be accessed from same class even if it is from same package we cant access

public class Demo {

	public static void main(String[] args) {
          A obj = new A();
    //we cant access marks bcoz we made variable as private
          System.out.println(obj.marks);
      
          
     //here we cant access marks even though B.java is in same package bcoz its private and can be used in same class
     //so this gives an error B.marks is not visible
          B obj1 = new B();
          System.out.println(obj1.marks);
	}
}


