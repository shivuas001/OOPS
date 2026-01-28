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

class Ca extends Ba{
	public void show()
	{
		System.out.println("in C show");
	}
}


public class Demo {

	public static void main(String[] args) {
		
	//here same method is behaving differently according to the object we refer	
         Aa obj = new Aa();
         obj.show();
     //here obj is changed from Aa to Ba 
         obj = new Ba();
         obj.show();
     //here obj is changed from Ba to Ca
         obj = new Ca();
         obj.show();
         
        //this is decided in runtime where same method behave different according to object
	}
}


