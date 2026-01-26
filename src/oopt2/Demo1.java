package oopt2;

//here we are importing the file that is present in other package that is from oopt1 folder and file Calc
import oopt1.Calc;


//now after importing inheritance program

class AdvanceCalc extends Calc{
	public int mod(int n1,int n2){
		{
			return n1%n2;
		}
	}
}

public class Demo1 {

	public static void main(String[] args) {
		AdvanceCalc obj = new AdvanceCalc();
		int r1=obj.add(5, 6);
		int r2=obj.sub(5, 6);
		int r3=obj.mod(5, 6);
		
		System.out.println(r1 + " " + r2 + " " + r3);
		

	}

}
