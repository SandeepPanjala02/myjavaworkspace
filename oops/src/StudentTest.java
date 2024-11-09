
public class StudentTest {

	public static void main(String[] args) {
		//object Creation or object Instant
		Student s1= new Student(101, "Wills", 45.0);
		s1.displayStudentDetails();
		s1.studentResult();
		
		System.out.println("----------------");
		
		Student s2= new Student(102 , "Smith" , 39.0);
		s2.displayStudentDetails();
		s2.studentResult();
		
		System.out.println("-----------------");
		
		Student s3 = new Student();
		s3.displayStudentDetails();
		s3.studentResult();


	}

	
	
	
	
}