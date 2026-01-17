package oopt1;

public class Demo {

	public static void main(String[] args) {
		
		//string is an object this how it works 
		String name = new String("A SHIVA KUMAR");
		System.out.println(name + " from HALEHALLI");
		
		
		// these are some methods since it is class. to check char at index 3 and concat two strings
		System.out.println(name.charAt(3));
		System.out.println(name.concat(" YADAV"));
		
		
		//But this is the synatx for string as jvm automatically creates the object 
		String Name = "RAKESH";
		System.out.println(Name);
	}
	
}

