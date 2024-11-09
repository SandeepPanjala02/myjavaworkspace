
//implementation class 
public class EpsonPrinter implements Printer{
	
	
   //public modifier should implemented compulsory
	@Override
	 public void printJob() {
		System.out.println("print job using EpsonPrinter");
		
	}

  
		
	
	

  // we can override the default methods by making public modifier
  public  void tShirtPrintJob() {
		 System.out.println("T-Shirt Printing Job overrided");
		 
	 }

}
