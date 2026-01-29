package oopt1;
//if we have abstract method we should compulsory make class abstract
//but we can have non abstract methods in abstract class


abstract class Car{
//here i have declared method drive() but i dont know to define it so i used abstract for method
	public abstract void drive();
	
	public void playMusic(){
		{
			System.out.println("playing Music");
		}
	}
}

class Wagnor extends Car{
//here i have defined method drive() now we can create object Wagnor and  call this method
	public void drive()
	{
		System.out.println("i can drive");
	}
}


public class Demo {

	public static void main(String[] args) {
	
	//we cant create object of abstract class the class which defines abstract method that class object can be create
		Car obj = new Wagnor();
		obj.drive();
		obj.playMusic();
		
		
   }
}


