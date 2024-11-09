
class BahubaliThread extends Thread{
	int total = 0;

	@Override
	public void run() {
		System.out.println("2. Bahubali Thread Calculations Begins");
		for(int i = 1; i<=100; i++) {
		total += i;
		
		}
		System.out.println("3. Bahubali thread gives notification");
		synchronized (this) {
			//this.notify();
			this.notifyAll();
			
		}
	
		//connecting network or database connection 
	}
	
	
}
public class InterThreadCommunication {
	public static void main(String[] args) throws InterruptedException {
		BahubaliThread b = new BahubaliThread();
		b.start();
		
		//main thread
		Thread.sleep(10000);
		
	    // b.join();
		
		System.out.println("1. main thread calling wait() method");
		// to call (wait method) we should use  synchronized block 
		synchronized (b) {
			//b.wait();
			//b.wait(10000);
			b.wait(10000, 500);
			
		}
		System.out.println("4. main Thread gets notification");
		System.out.println(b.total);
		
	}

}
