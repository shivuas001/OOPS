package oopt1;

//we have inner class here class inside class
class Aa{
	int a;
	
	public void show() 
	{
		System.out.println("in A show");
	}
	
	class Ba{
		public void config()
		{
			System.out.println("in Config");
		}
	}
}

public class Demo {

	public static void main(String[] args) {
			Aa obj = new Aa();
			obj.show();
			
		//if we want call the method that present class inside class we need specify in which class this class present
			Aa.Ba obj1 = obj.new Ba(); //as class Ba is non static we need object to refer it so we obj.new Ba();			
			obj1.config();
		
		  
   }
}


