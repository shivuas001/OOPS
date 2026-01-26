package oopt1;

class A{
	public void A() {
		System.out.println("in A class");
	}
}

//here both class have same methods A and same parameters 
//but class B overrides class A and prints class B
class B extends A {
	public void B() {
		System.out.println("in B class");
	}
}

public class Demo {

	public static void main(String[] args) {
		B obj = new B();
		obj.B();
	
	}
}


