package oopt1;

public class Demo {

	public static void main(String[] args) {
		
		String name = "shivu";
		name = name + "kumar";
		
	//here string does not changed from shivu to shivu kumar.
	//heap as allocated different memory to name with of previous one.
	//hence Strings are default immutable that is cant be changed.
		System.out.println(name);
		
		String s1 = "Shivu";
		String s2 = "Shivu";
		
	//it returns true bcoz s1 and s1 have same string name,
	//so memory allocation in heap for both variable are same address.
		System.out.println(s1 == s2);
	}
	
}

