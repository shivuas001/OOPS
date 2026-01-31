package oopt1;

enum Laptop{
//if we wont mention price of one object we can use default constructor
     Macbook(2000), Vivobook(1000), Hp, Ideapad(1200);
	
	 private int price;
	 
	 private Laptop() {
	//now default price value for Hp will be 500.
		 price = 500;
	 }
	 
	 private Laptop(int price) {
		 this.price = price;
	 }
	 
	 public int getPrice()
	 {
		 return price;
	 }
	 public void setPrice(int price)
	 {
		 this.price = price;
	 }
}
public class Demo {
	public static void main(String[] args) {
	 
	//to print all objects with prices Enhanced for loop used
		for(Laptop lap : Laptop.values())
		{
			System.out.println(lap + " : " + lap.getPrice());
		}
		
   }
}



