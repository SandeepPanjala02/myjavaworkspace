
public class Employee {
	int employeeId;
	String employeeName;
	long employeeMobile;
	Address employeeAddress; //Entity reference or HAS-a relationship
	
	//Constructor generator
	public Employee(int employeeId, String employeeName, long employeeMobie, Address employeeAddress) {
		super();
		this.employeeId =    employeeId;
		this.employeeName =   employeeName;
		this.employeeMobile =  employeeMobie;
		this.employeeAddress =  employeeAddress;
	}
	
	public void displayEmployee() {
		System.out.println("Employee Id:  "+ employeeId);
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Employee  Mobile:  "+employeeMobile);
		employeeAddress.displayAddress();
		
		 
		
			
		}
	}


