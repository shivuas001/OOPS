package oopt1;

//we have inner class here class inside class
class Aa{
	int a;
	
	public void show() 
	{
		System.out.println("in A show");
	}
	
	static class Ba{
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
			
		//when we have inner class static we do not need object reference as we done in previous
		//if inner class is static we can directly call from class
			Aa.Ba obj1 = new Aa.Ba(); 			
			obj1.config();
		
		  
   }
}


