package oopt2;

//here we are importing the file that is present in other package that is from oopt1 folder and file Calc
import oopt1.Calc;
import oopt1.Advcalc;

//here it imports, selects java folder inside it util folder and selects all files in it.
import java.util.*;



//now after importing inheritance program

class AdvanceCalc extends Advcalc{
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
		int r4=obj.multi(5, 6);
		int r5=obj.mod(5, 6);
		
		System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
		

	}

}
