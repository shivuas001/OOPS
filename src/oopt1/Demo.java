package oopt1;

enum Laptop{
//all these are objects in enum
     Macbook(2000), Vivobook(1000), Hp(1500), Ideapad(1200);
	
	 private int price;
	 
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



