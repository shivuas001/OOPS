package oopt1;

class Human{
	private int age;
	private String name ;

//when values are not assigned and we want print age and name
//we get default values of it that is string as null and int as 0
//as constructor is called when object is created we can assign the values in constructor as default 
//now when constructor is called name and age values is assigned as u mentioned in it instead of default null and 0
	
	public Human(){
	   name = "shivu";
	   age = 12;
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

