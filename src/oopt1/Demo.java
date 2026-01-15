package oopt1;

public class Demo {

	public static void main(String[] args) {
		
	//3 Dimentional Arrays
		int nums [][][] = new int [3][3][4];
		
		
	//to generate a random number for an array of 3D array
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<4;k++) {
					nums[i][j][k]=(int)(Math.random() * 10);
				}
			}
		}
		
	//for loop to print 3D arrays
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<4;k++) {
					System.out.print(nums[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
	
}

