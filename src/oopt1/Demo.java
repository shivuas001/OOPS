package oopt1;

//A is now an interface not an class. when we interface by default methods in interfaces are public and abstract
//we can have variables in interface but by default they are final and static
 interface A{
	 
	 int age = 21;
	 String area = "Bengaluru";
	 
	 void show();
	 void config();
}
 //implemented that defined show() and config() method in B class 
 
public class Demo {
	public static void main(String[] args) {
	  A obj = new B();
	  obj.show();
	  obj.config();
	  
// as variables in interfaces static we can directly call them with interface name
//we cant change variables data as they final in default
	  System.out.println(A.age + " : " + A.area);
	  
   }
}


