package oopt1;

//here Status is a class and components inside it are constants
enum Status{
	Running, Failed, Pending, Success
}
public class Demo {
	public static void main(String[] args) {
	
	//by Status reference we can call constants
	  Status s = Status.Failed;
	  System.out.println(s);
   }
}


