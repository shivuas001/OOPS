package oopt1;

class Aa{
	public void show()
	{
		System.out.println("in A show");
	}
}
class Ba extends Aa{
	public void show()
	{
		System.out.println("in B show");
	}
}


public class Demo {

	public static void main(String[] args) {
		
	//here we have different reference of Aa but object is Ba and this works
         Aa obj = new Ba();
         obj.show();
	}
}


