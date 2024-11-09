package pack2;

import pack1.Calc;

public class MyCalc extends Calc {
	public static void main(String[] args) {
		MyCalc mc = new MyCalc();
		
		//protected method
		System.out.println(mc.doubleIt(10));
		
		//public method
		System.out.println(mc.findCube(10));
		
		//public property
		System.out.println(mc.MAX_VALUE);
		
		//protected property
		System.out.println(mc.size);
		
	}
	

}
