/*
 * it is mutable object - in which can be done
 */

public class StringBufferDemo {

	public static void main(String[] args) {
	
		//String Buffer
		StringBuffer sb1 = new StringBuffer("Java");
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(sb1);
		
		StringBuffer s1 = new StringBuffer("Python");
		StringBuffer s2 = new StringBuffer("Python");

		System.out.println(s1==s2);
		//in stringBuffer it is for reference comparison
		System.out.println(s1.equals(s2));
		
		sb1.append(true);
	}

}
