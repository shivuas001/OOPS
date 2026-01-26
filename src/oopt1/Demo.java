package oopt1;


public class Demo {

	public static void main(String[] args) {

		Advcalc obj = new Advcalc();
		int r1 = obj.add(5, 12);
		int r2 = obj.sub(12, 5);
		int r3 = obj.multi(5, 2);
		int r4 = obj.div(25, 5);
		
		System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
		
	}
}


