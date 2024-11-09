package java8features;

@FunctionalInterface
interface Greet{
	void wish();
	
}


public class MethodReferencesDemo {
	public static void sayHello(){

	System.out.println("Hello......everybody!");
	
	}
	public void sayHi() {
		System.out.println("hi....everyone");
	}
	public static void main(String[] args) {
		 Greet g = () -> MethodReferencesDemo.sayHello();
		 g.wish();
		 
		 //Static Method References
		 Greet g2 = MethodReferencesDemo :: sayHello;
		 g2.wish();
		 
		 MethodReferencesDemo d = new MethodReferencesDemo();
		 Greet g3 = () -> d.sayHi();
		 g3.wish();
		 
		 // Instance Method References
		 Greet g4 = d :: sayHi;
		 g4.wish();
		 
		 
		
	}
	

}
