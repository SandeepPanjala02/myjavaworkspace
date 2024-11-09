import java.util.Objects;

class Employee{
	int employeeId;
	String employeeName;
	
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
 
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	


	@Override
	public void finalize(){
		System.out.println("finalize()");
		
	}
	
}
  

public class FinalizeMethodDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee(1001, "Wills");
		Employee e2 = new Employee(1000, "Wills");
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println("------------------");
		
		e1 = e2;// 1. Assigning one reference to another refernce
		System.out.println(e1);
		System.out.println(e2);
		
		//Anonymous Object
		new Employee(1003, "Jones"); //2. Anonymous object eligible for garbage collection 
		
		Employee e3 = new Employee(1004, "Alice" );
		e3 = null; //3. Nullifying Reference
				
		
		//Request JVM to call Garbage Collector
		System.gc();
	}

}
