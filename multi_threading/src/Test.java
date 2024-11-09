//user defined Threads

class Programming{
	
}


//1. Using Thread class
class JavaThread extends Thread{

	// we should override to implement it
	@Override
	public void run() {
		for(int i =1; i<=5; i++) {
		System.out.println("Java");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	
   }
}

//2. Using Runnable interface
// it is best interface
class PythonThread extends Programming implements Runnable{

	@Override
	public void run() {
		for(int i =1; i<=5; i++) {
			System.out.println("Python");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			
		 }
			
		
		 }
		
		
	 }
	
}

class AngularThread extends Thread{

	@Override
	public void run() {
		for(int i =1; i<=5; i++) {
			System.out.println("Angular");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			
		 }
			
		
		 }
		
		
	}
	
}


public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		//child thread or javaThread
		JavaThread j = new JavaThread();
		
		j.start();// to begin user-defined thread.
	    j.join();
		//when we call run method new thread won't be created , executed like a normal method.
		//j.run();
		
		//j.start(); start method should not call more than once
	
		
		PythonThread p = new PythonThread();
		//p.start();  //cCompilation error
		
		Thread t = new Thread(p);//by using Python object reference we can start python implementation
		t.start();
		t.join();
		
		AngularThread a = new AngularThread();
		a.start();
		
		
		//main thread
		/*for(int i = 1; i<=10; i++) {
			System.out.println("main");
		}*/
		
		
	 }

}
