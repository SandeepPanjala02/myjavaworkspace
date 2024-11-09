
public class FinallyDemo {

	public static void main(String[] args) {
		String s = null;
		
		System.out.println("hello");
		
		try {
			//by using system.exit() it will terminates the code
			System.exit(0);
			System.out.println(s.charAt(0));
		} catch (NullPointerException e) {
			
		System.out.println("nothing");
	    }
		
	 //by using finally block we can execute code if any exception
	// without try& catch we cannot use finally 
		finally {
		System.out.println("finally block");
      	}
		
		System.out.println("tata");
  }
}
