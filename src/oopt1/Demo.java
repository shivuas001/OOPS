package oopt1;

class Aa{
	public void show1()
	{
		System.out.println("in A show");
	}
}
class Bb extends Aa{
	public void show2()
	{
		System.out.println("in B show");
	}
}

public class Demo {

	public static void main(String[] args) {
		
	//this is upcasting as object is Bb it refers up that is parent class Aa
	   Aa obj = (Aa) new Bb();
	   obj.show1();
	 
	}
}


