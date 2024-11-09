package pack1;

public class CalcTest {
	public static void main(String[] args) {
		Calc c = new Calc();
		
		int result = c.findSquare(10);
		System.out.println(result);
		
		System.out.println(c.findCube(10));
		
		System.out.println(Calc.PI_VALUE);
		System.out.println(Calc.MAX_VALUE);
		
		System.out.println(c.doubleIt(10));
		
	}
	
	

}
