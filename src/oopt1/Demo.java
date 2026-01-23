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


//when u wont pass any parameters in in object it will intializes default constructor that is "in A cons"
//but we want to intialize parametric constructor of super class A
class B extends A{
	public B()
	{ 
	//so u need to pass an parameter in default constructor then a paremetric Constructor of super class will be called
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


