
class Parent{
	// by using final keyword it cannot be overriden
	public  final void study() {
		System.out.println("Medicine");
	}
	public void property() {
		System.out.println("100Acre land + 100 kg Gold + 100cr cash ");
	}
	public void marry() {
		System.out.println("Arranged marriage");
	}
}

//overriding method
class Child extends Parent{
	@Override
	public void marry() {
		//by using super keyword we can call the parent class method
		
		super.marry();//calling Parent class
		System.out.println("Love marriage");
	}
	
	/*
	public  void study() {
		System.out.println("Acting");
	}
	*/
	
	
}

public class OverriidingDemo {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.study();
		p.property();
		p.marry();
		
		System.out.println("----------------");
		
		Child c = new Child();
		c.study();
		c.property();
		c.marry();
	}

}
