package oopt1;

public class Demo {

	public static void main(String[] args) {
		
		int nums [][] = new int [3][4];
		
	//to generate a random number for an array of MultiDimensional array
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++) {
				nums[i][j] = (int)(Math.random() * 10);
			}
		}
		
	// Normal for loop to print an array of MultiDimentional array
		
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
	//enhanced for loop to print MultiDimentional array
		
		for(int n[]: nums) {
			for(int m: n) 
			{
				System.out.print(m + " ");
			}
			System.out.println();
		}
	}
		
}

