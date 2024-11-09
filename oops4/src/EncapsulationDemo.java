
public class EncapsulationDemo {
	public static void main(String[] args) {
		
		Student s1= new Student(1001, "Sandeep", "Sandeep@gmail.com", 8639653128L);
		
		 s1.setStudentName("sai");// overriden the constructor by setter methods
		 
		System.out.println(s1.getStudentId());
		System.out.println(s1.getStudentName());
		System.out.println(s1.getStudentEmail());
		System.out.println(s1.getStudentMobile());
		
		System.out.println("--------------------");
		
		Student s2= new Student();
		s2.setStudentName("sandy");
		s2.setStudentId(1003);
		s2.setStudentEmail("sandy@gmail");
		s2.setStudentMobile(9867656545L);
		
		System.out.println(s2.getStudentId());
		System.out.println(s2.getStudentName());
		System.out.println(s2.getStudentEmail());
		System.out.println(s2.getStudentMobile());
		
		
		
		
		
		
		
		
	}

}
