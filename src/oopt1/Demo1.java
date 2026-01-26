package oopt1;

class Calculator{
	public int add(int n1, int n2) {
		return n1+n2;
	}
}

//here AdvanceCalc overrides Calculator and returns n1+n2+1
//both class methods have same method and parameters but superclass overrides by subclass
class AdvanceCalc extends Calculator{
	public int add(int n1, int n2) {
		return n1+n2+1;
	}
}

public class Demo1 {

	public static void main(String[] args) {
		AdvanceCalc obj = new AdvanceCalc();
		int r1 = obj.add(3,4);
		
		System.out.println(r1);
	}

}
