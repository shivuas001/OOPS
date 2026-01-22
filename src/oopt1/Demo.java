package oopt1;

class Human{
	private int age;
	private String name ;
	
	//Default Constructor
	public Human(){
	   name = "shivu";
	   age = 12;
	}
	
	//Parameterized Constructor as values assigned in object when its created
	public Human(int age, String name){
		  this.age = age;
		  this.name = name;
		}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}


public class Demo {

	public static void main(String[] args) {
	    Human obj = new Human();
	    Human obj2 = new Human(15,"madhu");
	    System.out.println(obj.getName() + " : " + obj.getAge());
	    System.out.println(obj2.getName() + " : " + obj2.getAge());
	    
	}
	
}

