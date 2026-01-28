package oopt1;

//final keyword can be used with variable, method and class

public class Demo {

	public static void main(String[] args) {
	//when we make variable final we cant change it that becomes constant
	//it gives an error if we try to change it
		final int marks = 10;
		marks = 9;
		System.out.println(marks);
	
	}
}


