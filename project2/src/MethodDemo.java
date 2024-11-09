
public class MethodDemo {
	//static methods used for  utility purpose
	public static void findSquare(int num) {
		int square = num*num;
		System.out.println(square);
	}
	//Instance Method or non-static 
	public void findCube(int num) {
		int cube = num*num*num;
		System.out.println(cube);
	}
	public static int findMax(int num1, int num2) {
		int max = (num1 > num2) ? num1:num2;
		return max;
	}
		
		public static double findTotal(double num1,double num2) {
			return num1+num2;
		}
		
		public static double findAvg(double num1,double num2) {
			double total = findTotal(num1,num2);
			double avg = total/2;
			return avg;
		
	}
	
		
		
	public static void main(String[] args) {
		int max = findMax(123,515);
		double avg = findAvg(44.5,55.5);
		System.out.println(avg);
		System.out.println(max);
		
		//Accessing Instance methods
			MethodDemo m = new MethodDemo();
			m.findCube(10);
			
			//Accessing Static Methods
		  findSquare(5);//Directly within sample class
		  m.findSquare(10); //Reference variable
		  MethodDemo.findSquare(20);  //using class name
	
	
	}

}
