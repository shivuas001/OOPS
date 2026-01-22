package oopt1;

class Human{
// when we make variables private it can be used only with the class not in other class
//but we can access the data using methods ,this is encapsulation.
	private int age;
	private String name ;
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
//this is used to represent the current object why it used bcoz in previous we two different variables.
//a variable has global and age variable as instance var instead we create same variable.
//my mentioning this.age = age represent the current object obj with method setAge()
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
	    obj.setAge(11);
	    obj.setName("Shivu");
	    
	    
	    System.out.println(obj.getName() + " : " + obj.getAge());
	}
	
}

