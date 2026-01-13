package oopt1;

class Calculator{
	 
	 public int add(int n1, int n2, int n3) {
		 int result = n1 + n2 + n3;
		 return result;
	 }
	 public int add(int n1, int n2) {
		 return n1 + n2;
	 }
}


public class Demo {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		int result = calc.add(3, 5);
		System.out.println(result);
		
	}

}
