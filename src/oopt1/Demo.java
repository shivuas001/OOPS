package oopt1;

class  Calculator1{
//when we make method as final we can't override that method if we override it through an error
	public final void show()
	{
		System.out.println("by Shivakumar");
	}
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
}

class AdvCalc1 extends Calculator1
{
	public void show()
	{
		System.out.println("by chirag");
	}
	}

public class Demo {

	public static void main(String[] args) {
		Calculator1 obj = new Calculator1();
	   obj.show();
	
	}
}


