package pack1;

//Default Scope or Default method we can access in this package
public class Calc {
	
	//constant value
	 static final double PI_VALUE = 3.14;
	
	//by using public we can access in any package (pack1) & (pack2)
	public static final int MAX_VALUE = 10;
	
	//Accessible only within class(Calc)
	private static final int length = 5;
	
	protected int size = 15;
	
	
	//Accessible only within package (pack1)
	  int findSquare(int num) {
		return num*num;
		 
	}
	
	  //
	  public int findCube(int num) {
		  return num*num*num;
	  }

	  private int findTotal(int a,int b) {
		return a+b;
	}
	  
	  protected int doubleIt(int num) {
		return num+num;
		  
	  }
}
