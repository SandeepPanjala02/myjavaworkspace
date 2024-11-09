import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		int num1,num2,sum; //variable Declaration
		//num1=num2=sum=0;   //Variable Intialization
		
		//object Creation
		Scanner in = new Scanner(System.in);
		
		//reading 2 numbers from user 
		System.out.println("Please enter first number: ");
		num1 = in.nextInt();
		
		System.out.println("Please enter second number: ");
		num2 = in.nextInt();
		
		//calculate total
		sum= num1+num2;
		
		//Displaying Result
		System.out.println("Sum of "+num1+"and"+num2+"is"+sum);
		
		
		
	

	}

}
