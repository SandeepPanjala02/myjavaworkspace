
//By using Functional Interface we should us only one abstract method
@FunctionalInterface

public interface Printer {
	
	//public static final String VERSION_NO = "V1.0.0";
	//variables must be initialized
	 String VERSION_NO = "V1.0.0";
	
	//public abstract void printJob();
	// there should not be any implementation
	 //Abstract method
	 void printJob();
	// void scanJob();
	 
	 
	
	 
	 //by using default keyword we can implement without effecting any other impelementation class
	 //by using default it will be accessible in all implementation  class
	 //default Methods
	 default void tShirtPrintJob() {
		 System.out.println("T-Shirt Printing Job");
		 
	 }
	 
	 default void coffeeCupPrintJob() {
		 System.out.println("CoffeeCup Printing Job");
		 
	 }
	 
	 //static Methods
	 //static methods cannot be overrided
	 static void threeDPrintJob() {
		 System.out.println("3D Printing Job");
	 }
	


}