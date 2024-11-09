
class MyCalc{
	//Overloaded Methods 
	public static int findMax(int a, int b) {
		return (a>b) ? a:b;
	
	}
	
	public static long findMax(long a, long b) {
		return (a>b) ? a:b;
	}
	
	public static double findMax(double a, double b) {
		return (a>b) ? a:b;
	}
	
    //Variable Length Argument Method or VAR Arg Method  it is based on arrays 
	public static void sum(int... a) {
		//System.out.println("java");
		int total = 0;
		for(int x : a) {
			total += x;
			
		}
		System.out.println(total);
	}
}
	
public class OverloadingDemo {
	public static void main(String[] args) {
		MyCalc.sum(10);
		MyCalc.sum(10,20);
		
		MyCalc.sum(new int[] {11,22,33,44,55});
		
		
		int maxInt = MyCalc.findMax(100, 200);
		System.out.println(maxInt);
		
		long maxlong =MyCalc.findMax(9988776655L, 8877665544L);
		System.out.println(maxlong);
		
		double maxdouble =MyCalc.findMax(65000.1, 7000.3);
		System.out.println(maxdouble);
		
		
		
	}
}
		
		
		
		



