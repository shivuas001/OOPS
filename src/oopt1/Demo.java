package oopt1;
import oopt2.*;
//here we can access marks that is in other package we have imported that package 

public class Demo {

	public static void main(String[] args) {
          A obj = new A();
       //we access the marks only when it is made public in other package
          System.out.println(obj.marks);
	}
}


