package oopt1;

class Computer{
	 
	public void playMusic() {
		System.out.println("music playing...");
		}
	public String getMePen(int cost) {
	if(cost >= 10)
		return "pen";
	else
		return "i will not give";
	}
}


public class Demo {

	public static void main(String[] args) {
		
		Computer obj1 = new Computer();
		obj1.playMusic();
		String str = obj1.getMePen(5);
		System.out.println(str);
	}

}
