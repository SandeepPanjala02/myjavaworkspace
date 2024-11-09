
public class EmployeeTest {

	public static void main(String[] args) {
		Address employeeAddress = new Address("Hyderabad", "TG" , "India" );
		
		Employee emp = new Employee(1001,  "Sandeep", 8639653118L, employeeAddress);
		
        emp.displayEmployee();
	}

}
