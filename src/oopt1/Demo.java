package oopt1;

public class Demo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("SHIVA");
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

