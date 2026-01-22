package oopt1;

class Human{
	private int age;
	private String name ;

	//here constructor is special type of method which has name of class
	//constructor is called when obj is created every time u create object constructor is called
	
	public Human(){
	//in main class we have two object then two time constructor is called
	   System.out.println("in constructor");
	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}


public class Demo {

	public static void main(String[] args) {
	    Human obj = new Human();
	    Human obj2 = new Human();
	    System.out.println(obj.getName() + " : " + obj.getAge());
	    
	    //obj.setAge(11);
	    //obj.setName("Shivu");
	}
	
}

