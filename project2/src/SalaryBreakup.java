import java.util.Scanner;

public class SalaryBreakup {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Accept Employee Id, Employee Name, Basic Salary
	        System.out.print("Enter Employee ID: ");
	        int employeeId = scanner.nextInt();
	        System.out.print("Enter Employee Name: ");
	        String employeeName = scanner.next();
	        System.out.print("Enter Basic Salary: ");
	        double basicSalary = scanner.nextDouble(); 


	        // Calculate allowances and deductions
	        double hra = 0.15* basicSalary;
	        double pf = 0.05*basicSalary;
	        double ta = 0.02* basicSalary;
	        double esi = 0.0125* basicSalary;
	        double pt = 200;

	        // Calculate Gross Pay and Net Pay
	        double grossPay = basicSalary + hra + pf + ta + esi + pt;
	        double netPay = grossPay - pf - pt;

	        // Print the salary break-up
	        System.out.println("\nEmployee ID: " + employeeId);
	        System.out.println("Employee Name: " + employeeName);
	        System.out.println("Basic Salary: " + basicSalary);
	        System.out.println("HRA: " + hra);
	        System.out.println("PF: " + pf);
	        System.out.println("TA: " + ta);
	        System.out.println("PT: " + pt);
	        System.out.println("ESI: " + esi);
	        System.out.println("Gross Pay: " + grossPay);
	        System.out.println("Net Pay: " + netPay);
	}

}
