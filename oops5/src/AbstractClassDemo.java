
interface Vehicle{
	
	void wheels();
	void start();
	void move();
	void stop();
	
}

//abstract class - when there is incomplete implementation 
abstract class MyVehicle implements Vehicle{
	public void start() {
		System.out.println("start...");
	}
	public void move() {
		System.out.println("move...");
		
	}
	public void stop () {
		System.out.println("stop...");
		
	}
	// abstract method
	public abstract void wheels();
}

//By taking another class and extending the abstract class we can create object and we can access the abstract class methods
class Bike extends MyVehicle{

	@Override
	public void wheels() {
		System.out.println("2-wheels");
		
	}
	
}

class Car extends MyVehicle{

	@Override
	public void wheels() {
		System.out.println("4-wheels");
		
		
	}
	
	
}

public class AbstractClassDemo {
	public static void main(String[] args) {
		Bike b = new Bike ();
		b.wheels();
		b.start();
		b.move();
		b.stop();
		
		System.out.println("---------------");
		
		Car c = new Car();
		c.wheels();
		c.start();
		c.move();
		c.stop();
		
		
		
		
	}

}
