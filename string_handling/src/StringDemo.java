
public class StringDemo {

	public static void main(String[] args) {
		
		//Using Literal Syntax
		String s1 = "Java";
		
		//Using new operator
		String s2 = new String("Python");
		
		System.out.println(s1);
		System.out.println(s2);
		
		String s3 = "Java";
		String s4 = new String("Python");
		
		//reference comparison
		System.out.println(s1 == s3);
		System.out.println(s2 == s4);
		
		//content comparison
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));
		
		System.out.println(s1.equals(null));
		System.out.println(s1.equals(new StringBuffer()));
		
		String s = "java";
		s.codePoints();
		
		
	}

}
