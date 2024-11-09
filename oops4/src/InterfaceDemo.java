
public class InterfaceDemo {

	public static void main(String[] args) {
		//object creation or instantation not allowed
		//printer p1 = new Printer();
		
		EpsonPrinter ep = new EpsonPrinter();
		ep.printJob();
		
		ep.tShirtPrintJob();
		ep.coffeeCupPrintJob();
		
		System.out.println("=====================");
		
		CannonPrinter cp = new CannonPrinter();
		cp.printJob();
		
		cp.tShirtPrintJob();
		cp.coffeeCupPrintJob();
		
		System.out.println("=======================");
		
		HPPrinter hp = new HPPrinter();
		hp.printJob();
		
		hp.tShirtPrintJob();
		hp.coffeeCupPrintJob();
		
		System.out.println("=========================");
		
		//By using interface class we will call the method
		Printer.threeDPrintJob(); 
			
		
		
		//interface can allow as reference but not as value type
		//Printer p = new CannonPrinter();
		//p.printJob();

	}

}
