package geeksForGeeks;

import java.util.ArrayList;

public class Geeks {

	public static void main(String[] args) {
		
		//creating arraylist and elements
		ArrayList<String> list = new ArrayList<>();
		 
		 list.add("A");
		 list.add("KUMAR");
		 System.out.println("after adding"  + " : " + list);
		 
		 list.add(1,"SHIVA");
		 System.out.println("after adding element at index 1" + " : " + list);
		 
		 list.remove(0);
		 System.out.println("removes index 0 element" + " : " + list);
		 
		 list.remove("KUMAR");
		 System.out.println("removing elemnts using value" + " : " + list);
		 
		 list.set(0,"Hello");
		 System.out.println("to remove the element from index 0 and replace it given string" + " : " +list);
	}

}
