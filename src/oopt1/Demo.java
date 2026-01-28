package oopt1;

//when we make class as final we can't inherit that class if we extends it it through an error
final class  Calculator1{
	public void show()
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


