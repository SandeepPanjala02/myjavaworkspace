import java.util.Scanner;

public class ATMApp {
	
	public static void main(String[]args) {
		
		ATMService service = new ATMService();
     Scanner in =new Scanner(System.in);
    int option = 0;
    
    do {

    	System.out.println("XYZ ATM APP");
    	System.out.println("-----------");
    	System.out.println("1. Deposit");
    	System.out.println("2. Withdraw");
    	System.out.println("3. Balance");
    	System.out.println("0. Exit");
    	System.out.println("Please chose option: ");
    	option = in.nextInt();
    	
    	switch (option) {
    	
    	case 1:
    		System.out.println("Enter Deposit Amount:");
    		int depositAmount = in.nextInt();
    		//service.balance = service.balance + depositAmount;
    		service.deposit(depositAmount);
    		System.out.println("Deposit is Successfill!!!");
    		break;
    	case 2:
    		System.out.println("Enter Withdraw Amount: ");
    		int withdrawAmount = in.nextInt();
    		
    		if(withdrawAmount > service.balance()) {
    			System.out.println("Insufficient Balance");
    		}
    		else if(withdrawAmount < 100) {
    			System.out.println("Minimum withdrawn amount is 100");
    		}
    		else {
    			System.out.println("Withdraw processing");
    			try {
    			Thread.sleep(1000);
    			}
    			catch(InterruptedException e) {
    				e.printStackTrace();
    			}
    			service.withdraw(withdrawAmount);
    			System.out.println("Withdraw is Successful!!!");
    			
    		}
    		
    		break;
    		
    	case 3:
    		int balance = service.balance();
    		System.out.println("Balance: "+balance);
    		break;
    	case 0:
    		System.out.println("Bye!!!");
    		System.exit(0);//shutdown JVM
    	default:
    		System.out.println("Invalid Option!");
    		break;
    	
    	
    	}
    }
    while (option !=0);
	}
}
