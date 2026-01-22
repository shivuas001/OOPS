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

