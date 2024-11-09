
//Unchecked exception 
class InvalidAgeException extends RuntimeException{
private static final long serialVersionUID = 1L;
	
	public InvalidAgeException() {
		super();
	}
	public InvalidAgeException(String message) {
		super(message);
	}
	
}

//Checked exception
class InvalidIncomeException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public InvalidIncomeException() {
		super();
	}
	public InvalidIncomeException(String message) {
		super(message);
	}
}


public class CustomizedExceptionDemo {
	
	public static void checKVoterAge(int age) {
		if(age >= 18) {
			System.out.println("Congrats! you are elgible");
			
		}
			else {
				System.out.println("Not elgible to vote");
				
			}
		}
	public static void checkIncome(int income) throws InvalidIncomeException {
		if (income <= 800000) {
			System.out.println("Eligible to enroll for JFS");
		}
		else {
			throw new InvalidIncomeException("Not Eligible for admission");
		}
	}
	

	public static void main(String[] args)  {
		try {
			checKVoterAge(17);
			
		} catch (InvalidAgeException e) {
			System.out.println(e);
			
		}
		try {
			checkIncome(900000);
		} catch (InvalidIncomeException e) {
			System.out.println(e);
			
		}
		
	}
	
}


	
		
	

