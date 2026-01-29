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
	   Aa obj = (Aa) new Bb();
	   obj.show1();
	   
	//Downcasting 
	//there is problem that we created object of Bb but we unable to call show2() though it belongs to Bb class
	//this is because object Bb have an reference of Aa in object and Aa class  doen't know Bb 
	   
	   Bb obj1 = (Bb) obj;
	   obj1.show2();
	 //now we can call show2() method because we downcasted Aa 
	 //we created another reference Bb of variable obj1 and downcasted obj of refence Aa is from Bb
   }
}


