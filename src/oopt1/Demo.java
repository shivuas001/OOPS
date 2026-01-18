package oopt1;

public class Demo {

	public static void main(String[] args) {
		
	//basically capacity is 16 but if string size 5 then extra 5 spaces
	//will be added in heap memory to relocate memory while data is changed
		StringBuffer sb = new StringBuffer("SHIVA");
		
	//these different times of methods we can perform in string buffer
		System.out.println(sb.capacity());
		
		System.out.println(sb.length());
		
		sb.append(" KUMAR");
		System.out.println(sb);
		
		String str = sb.toString();
		
		System.out.println(sb.charAt(3));
		System.out.println(sb.isEmpty());
		System.out.println(sb.deleteCharAt(4));
		System.out.println(sb.getClass());
	}
	
}

