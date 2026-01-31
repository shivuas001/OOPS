package oopt1;

enum Status{
	Running, Failed, Pending, Success
}
public class Demo {
	public static void main(String[] args) {
	
	  Status s = Status.Success;
	
//here s refering already an Status so we need no mention status directly state the Constant and print
	 switch (s) {
	   case Running:
		   System.out.println("All Good");
		   break;
		   
	   case Failed:
		   System.out.println("Try Again");
		   break;
		   
	   case Pending:
		   System.out.println("Please Wait");
		   break; 
		   
	   default:
		   System.out.println("Done");
		   break; 
	 }
   }
}


