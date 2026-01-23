package oopt1;

//every class in java extends to Object class and object is type class.
//here in this program class B extends A and A extends Object Class in default whether u mention are not.

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
		super(5);
		System.out.println("in B cons");
	}
	
	public B(int n)
	{
		super();
		System.out.println("in B int cons");
	}
}

public class Demo {

	public static void main(String[] args) {
	    B obj = new B();
	}
	
}


