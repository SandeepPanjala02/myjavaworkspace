
class  Yellow extends Thread{

	@Override
	public void run() {
		for(int i =1; i<=3; i++) {
			System.out.println(" Yellow ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}
	
}

class Red extends Thread{
	@Override
	public void run() {
		for(int i =1; i<=3; i++) {
			System.out.println(" Red ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}

class Green extends Thread{
	@Override
	public void run() {
		for(int i =1; i<=3; i++) {
			System.out.println(" Green ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}



public class Task {

	public static void main(String[] args) throws InterruptedException {
		while (true) {
		Green g = new Green();
		g.start();
		g.join();
	
	
		Red r = new Red();
		r.start();
		r.join();
		
		
		
		Yellow y = new Yellow();
		y.start();
		y.join();
		
		}
		
		
		
	}
	

}
