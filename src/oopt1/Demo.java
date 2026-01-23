package oopt1;

class A{
//by default super method will be in constructor to refer super class  
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
	
//here when u use parametric constructor when u extend A class an default constructor is called in super class
//and we two constructor in super class that is A. 
//when u pass an parameters in super method then the parametric constructor of A also will be called orelse an default will be called
	public B(int n)
	{
		super(n);
		System.out.println("in B int cons");
	}
}

public class Demo {

	public static void main(String[] args) {
	    B obj = new B(5);
	}
	
}


