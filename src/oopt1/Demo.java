package oopt1;
class Students
{
	int rollno;
	String name;
	int marks;
}

public class Demo {

	public static void main(String[] args) {
		
		Students s1 = new Students();
		s1.rollno = 23;
		s1.name = "shivu";
		s1.marks = 100;
		
		Students s2 = new Students();
		s2.rollno = 25;
		s2.name = "rakesh";
		s2.marks = 140;
		
		Students s3 = new Students();
		s3.rollno = 26;
		s3.name = "santosh";
		s3.marks = 57;
		
		Students Students[] = new Students[3];
		Students[0] = s1;
		Students[1] = s2;
		Students[2] = s3;
		
		for(int i=0;i<Students.length;i++)
		{
			System.out.println(Students[i].name + " : " + Students[i].rollno + " : " + Students[i].marks);
		}
		
		
		
	}
	
}

