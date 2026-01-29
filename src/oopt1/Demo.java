package oopt1;

abstract class Car{
//here we two abstract methods and one is resolved in class Wagnor.
//if this is the case it gives an error becoz only when all abstract method are resolved that defined in another class it works
	public abstract void drive();
	public abstract void fly();
	
	public void playMusic(){
		{
			System.out.println("playing Music");
		}
	}
}

class Wagnor extends Car{
	public void drive()
	{
		System.out.println("i can drive");
	}
}


public class Demo {

	public static void main(String[] args) {
		Car obj = new Wagnor();
		obj.drive();
		obj.playMusic();
		
		
   }
}


