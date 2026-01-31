package oopt1;

//here Status is a class and components inside it are constants
enum Status{
	Running, Failed, Pending, Success
}
public class Demo {
	public static void main(String[] args) {
	
	//values is of type array so mentioning array in reference is must if not leads to error
	   Status[] ss = Status.values();
	   
	//Enhanced for loop we used is to print all the status constants and
	//ordinal() method to print a specific values of particular constant
	   
	  for(Status s: ss) {
		  System.out.println(s + " : " + s.ordinal());
	  }
	  
   }
}


