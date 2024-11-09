
public class BlocksDemo {
	static int x;
	
	//static block
	static 
	{
		// if we divide by 0 then we get arithmetic exception
		//x= 10/0;
		x=10;
		System.out.println("static block");
	}
	
	//instance block
	{
		
		System.out.println("instance block");
	}
	
	//constructor - it will execute after instance block
	public BlocksDemo() {
		
		System.out.println("constructor");
	}
	
	
	public static void main(String[] args) {
		System.out.println("main()");
		System.out.println(x);
		
		//instance block execute after object creation
		//object creation
		new BlocksDemo();
		new BlocksDemo();
		
	}
	

}
