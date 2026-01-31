package oopt1;

//class to class --> extends
//interface to class --> implements
//interface to interface --> extends

 interface A{
	 void show();
	 void config();
}
interface Bb{
	void run();
}

//interface can inherit an another interfaces that it extends other interfaces
interface C extends Bb{
	void play();
}

//class can implement one or more interfaces
class X implements A, C{
	public void show()
	{
		System.out.println("in show method");
	}
	public void config()
	{
		System.out.println("in config method");
	}
	public void run()
	{
		System.out.println("running");
	}
	public void play()
	{
		System.out.println("playing");
	}
}
 
public class Demo {
	public static void main(String[] args) {
	  A obj = new X();
	  obj.show();
	  obj.config();
	  
	//we need to create another object as reference C bcoz A interface does not know method run(); 
	  C obj1 = new X();	 
	  obj1.run();
	  obj1.play();
	  
   }
}


