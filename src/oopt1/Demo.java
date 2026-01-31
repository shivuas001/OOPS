package oopt1;

enum Laptop{
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
	 
		Laptop lap = Laptop.Macbook;
		System.out.println(lap + " : " + lap.getPrice());
		
   }
}



