
class MyMath{
	
	//By using synchronized keyword only one thread allow to access at a time
	//By using Synchronized we can achieve Thread Safety
	//Thread requires object level lock
	//we can achieve by using synchronized modifier
	public synchronized void printMulTable(int num) {
		for(int i=1; i<=10; i++) {
		
		System.out.println(num+"*"+i+"="+(num*i));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		  }
			
		}
	}
	//static synchronized method
	//requires class level lock
	public static synchronized void printSquare(int num){
		for(int i=1 ; i<=num; i++) {
		
		System.out.println(i*i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		  }
		
	}
 }
}

class NTR extends Thread{
	MyMath m;
	
	public NTR(MyMath m) {
		this.m = m;
		
	}
	
	@Override
	public void run() {
		m.printMulTable(10);
		m.printSquare(10);
	}
	
}
class Ram extends Thread{
	MyMath m;
	
	public Ram(MyMath m) {
		this.m = m;
		
	}
	
	@Override
	public void run() {
		m.printMulTable(11);
	}
	
}

class Arjun extends Thread{
	MyMath m;
	
	public Arjun(MyMath m) {
		this.m = m;
		
	}
	
	@Override
	public void run() {
		m.printMulTable(12);
		
	}
	
}


public class SynchronizationDemo {
	public static void main(String[] args) {
		MyMath m = new MyMath();
	
		NTR ntr = new NTR(m);
		Ram ram = new Ram(m);
		Arjun arjun = new Arjun(m);
				
		
		ntr.start();
		
		ram.start();
		
		arjun.start();
		
		
	}

}
