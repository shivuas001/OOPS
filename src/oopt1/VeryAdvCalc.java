package oopt1;

//here VeryAdvCalc is inherited Advcalc and Advcalc is inherited calc this is multilevel
public class VeryAdvCalc extends Advcalc {
	
  public double power(int n1, int n2)
  {
	  return Math.pow(n1, n2);
  }
}

//Math.pow() method returns double value so we used double
