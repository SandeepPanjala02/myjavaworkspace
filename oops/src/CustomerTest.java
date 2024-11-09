
public class CustomerTest {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(11122233455L, "Sandeep",  "HDFC1234", "Ameerpet");
		BankAccount account2 = new BankAccount(45234566655L, "Sandeep",  "SBI2345", "Ameerpet");
		
		BankAccount[] customerBankAccounts = {account1, account2};
		
		Customer customer = new Customer(111, "Sandeep", customerBankAccounts);
		customer.displayCustomerDetails();
		

	}
}
