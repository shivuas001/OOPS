package oopt1;

//when FuntionalInterface annotation is used it gives error when more than methods are found in interface.
@FunctionalInterface 
interface A{
	int add(int a, int b);
}


public class Demo {
	public static void main(String[] args) {
	
	//now we used here is add() method and we passed parameters we see in line one 
	//that a + b there we need not mention return type bcoz lambda know it and in bracket no need mention type of variable.
		A obj = (a,b) ->  a + b;
		int result = obj.add(5, 12);
		System.out.println(result);
		
	//inner class code without lambda Expression
		
	/*	A obj = new A() {
			public int add(int a, int b) {
				return a+b;
			}
		}; 
		int result = obj.add(5, 12);
		System.out.println(result);   */
   }
}



