
public class BillProcess {

	

		public void displayFinalBill(int totalBillAmount) {
		  DiscountCalci Calc= new DiscountCalci();
			double discount = Calc.findDiscount(totalBillAmount);
			System.out.println("Bill Amount :"+ totalBillAmount);
			System.out.println("Discount: "+discount);
			System.out.println("Final Bill Amount:"+(totalBillAmount - discount));
		





 
	}

}
