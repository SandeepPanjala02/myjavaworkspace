
public class UnCheckedExceptionDemo2 {

	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		String s = "java";
		
		try {
			System.out.println(a[5]);
						
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("no element is existed");
			
		}
		
		try {
			
			char c = s.charAt(4);
			System.out.println(c);
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("no character is existed");
	     
		}
	}

}
