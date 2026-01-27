package oopt1;
import oopt2.*;
//here we can access marks that is in other package we have imported that package 

public class Demo {

	public static void main(String[] args) {
          A obj = new A();
    //we access the marks only when it is made public in other package
          System.out.println(obj.marks);
      
          
     //we have another variable that is present in same package we can access it directly even though its default
          B obj1 = new B();
          System.out.println(obj1.marks);
	}
}


