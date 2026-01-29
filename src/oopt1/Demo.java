package oopt1;

abstract class Car{
	
	public abstract void drive();
	public abstract void fly();
	
	public void playMusic(){
		{
			System.out.println("playing Music");
		}
	}
}

//since we defined only one method in this class and another abstract method is not resolved so we need make this class abstract
//bcoz this is inherited of class Car
abstract class  Wagnor extends Car{
	public void drive()
	{
		System.out.println("i can drive");
	}
}

//here we defined method fly and inherited Wagnor now this is multilevel inheritance and all methods are resolved
//we can create this object and call all the methods
class UpdatedWagnor extends Wagnor{
	public void fly()
	{
		System.out.println("i can fly");
	}
}


public class Demo {

	public static void main(String[] args) {
		Car obj = new UpdatedWagnor();
		obj.drive();
		obj.playMusic();
		obj.fly();
		
		
   }
}


