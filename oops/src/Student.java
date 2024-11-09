
public class Student {
	//Instance Variables
	int studentID;
	String studentName;
	double studentMarks;
	
	//Static Variable
	static String studentbatchCode = "2024-12634";
	
	//CONSTRUCTOR
	public Student() {
		System.out.println("0-arg constructor...");
	}
	//Constructor name should be class name
	//we should not use return type if we use it considers as normal method
	
	public Student(int studentID,String studentName,double studentMarks) {
		System.out.println("constructor....");
		
		//if both are same we no need this keyword
		
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
		
		// if we use mutliple constructor we call it as overload constructor
		
	}
	
	//Instance methods
	public void studentResult() {
		if(studentMarks > 40) {
			System.out.println("Student Result: Pass");
		}
		else {
			System.out.println("Student Result: Fail");
	
		}
	}
	//Instance methods
	public void displayStudentDetails() {
		System.out.println("Student Id: "+ studentID);
		System.out.println("Student Id: "+ studentName);
		System.out.println("Student Id: "+ studentMarks);
		System.out.println("Student BatchCode:"+ studentbatchCode);
		
	}

}
