package oopt1;

interface Computer{
	void code();
}

class Laptop implements Computer{
	public void code()
	{
		System.out.println("compile, run, debug");
	}
}
class Desktop implements Computer{
	public void code()
	{
		System.out.println("compile, run, debug : Faster");
	}
}


class Developer{
	public void devApp(Computer lap)
	{
		lap.code();
	}
}

public class Demo {
	public static void main(String[] args) {
		Computer lap = new Laptop();
		Computer des = new Desktop();
		
		Developer shivu = new Developer();
		shivu.devApp(des);
   }
}


