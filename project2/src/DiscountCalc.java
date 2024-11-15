
public class DiscountCalc {
	public double findDiscount(int totalBillAmount) {
		double discount = 0.0;
		
		if(totalBillAmount < 100) {
			discount = totalBillAmount * .05;
		}
		else if(totalBillAmount < 250) {
			discount = totalBillAmount * .1;
		}
		else if(totalBillAmount < 500) {
			discount = totalBillAmount * 0.15;
		}
		else if(totalBillAmount < 750) {
			discount = totalBillAmount * 0.2;
		}
		else if(totalBillAmount < 1000) {
			discount = totalBillAmount * 0.25;
		}
		else {
			discount = totalBillAmount*.3;
		}
		return discount;
		
		}
		
	public void displayFinalBill(int totalBillAmount) {
		double discount = findDiscount(totalBillAmount);
		System.out.println("Bill Amount :"+ totalBillAmount);
		System.out.println("Discount: "+discount);
		System.out.println("Final Bill Amount:"+(totalBillAmount - discount));
	}
	public static void main(String[] args) {
		DiscountCalc c = new DiscountCalc();
		
		c.displayFinalBill(1500);
	
		

	}

}
