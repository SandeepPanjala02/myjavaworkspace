//Checked Exception
public class CheckedExceptionDemo {

	public void m1() throws InterruptedException {
	System.out.println("hi.........");
	
	Thread.sleep(1000);
	
	System.out.println("Java");
	}
	
	public void m2() throws InterruptedException {
		m1();
		
	}
	public void m3() throws InterruptedException {
		m2();
		
	}
	
	public static void main(String[] args) {
		CheckedExceptionDemo demo = new CheckedExceptionDemo();
		try {
			demo.m3();
		}catch (InterruptedException e) {
			System.out.println("interrupted");
	
		}
   }
}