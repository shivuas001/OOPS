package oopt1;

abstract class Computer{
	public abstract void code(); 
}

class Desktop extends Computer{
	public void code()
	{
		System.out.println("Compile, run, debug: Faster");
	}
}

class Laptop extends Computer{
	public void code()
	{
		System.out.println("Compile, run, debug");
	}
}

class Developer{
//here we are passing Computer object parameter as both laptop and Desktop extends Computer
	public void devApp(Computer lap)
	{
		lap.code();
	}
}

public class Demo {
	public static void main(String[] args) {
		//here we have Computer reference and laptop and desktop as object
		  Computer lap = new Laptop();
		  Computer des = new Desktop();
		  
		  
		  Developer shivu = new Developer();
		  shivu.devApp(des);
		 //here when we pass des it call devapp method where this method took Computer as reference calls Desktop method.
		  
   }
}


