package oopt1;

class Launch{
	public void abc()
	{
		B obj = new B();
	//we can use protected variables present in same package
		System.out.println(obj.marks);
	}
}

public class B {

    protected int marks = 4;
}
