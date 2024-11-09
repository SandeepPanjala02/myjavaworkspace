
public class BankAccount {
	long accountNo;
	String name;
	String ifsc;
	String branch;
	
	public BankAccount(long accountNo, String name, String ifsc, String branch) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.ifsc = ifsc;
		this.branch = branch;
	}
	
	public void displayAccountDetails() {
	System.out.println("Account N0:  "+accountNo);
	System.out.println("Account HolderName:  "+name);
	System.out.println("IFSC:  "+ifsc);
	System.out.println("branch: "+branch);
	

}
}