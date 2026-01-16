package oopt1;
class Students
{
	int rollno;
	String name;
	int marks;
}

public class Demo {

	public static void main(String[] args) {
		
	/*	Students s1 = new Students();
		s1.name = "shivu";
		s1.rollno = 24;
		s1.marks = 44;
		
		Students s2 = new Students();
		s2.name = "shivu";
		s2.rollno = 24;
		s2.marks = 44;
		
		Students s3 = new Students();
		s3.name = "shivu";
		s3.rollno = 24;
		s3.marks = 44;
		
		Students Students[] = new Students[3];
		Students[0] = s1;
		Students[1] = s2;
		Students[2] = s3;
		
	//using Enhanced for loop	
		for(Students S : Students)
		{
			System.out.println(S.name + " : " + S.rollno);
		} */
		
		int nums[] = new int[3];
		nums[0] = 2;
		nums[1] = 4;
		nums[2] = 7;
		
		for(int n : nums)
		{
			System.out.println(n);
		}
	}
	
}

