package oopt1;


class A extends Object{

	public A()
	{
		super();
		System.out.println("in  A constroctor");
	}
	
	public A(int n)
	{
		super();
		System.out.println("in  A int constrctor");
	}
}

class B extends A{
	public B()
	{ 
		super();
		System.out.println("in B cons");
	}
//we use this method bcoz as we pass parameters in object it calls super class constructor
//and it intialize parametric Constructor and 
//then by this method default constructor of class is also called
	public B(int n)
	{
		this();
		System.out.println("in B int cons");
	}
}

public class Demo {

	public static void main(String[] args) {
	    B obj = new B(5);
	}
	
}

//before when when used super method only parametric constructor and default constructor of super class is called
// by usig this method both default and parametric constructor class B and default Constructor of Class A is called.


