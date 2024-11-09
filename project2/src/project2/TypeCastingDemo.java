package project2;

public class TypeCastingDemo {

	public static void main(String[] args) {
		int i = 100;
		byte b= (byte)i;
		System.out.println(i);
		System.out.println(b);
		
	    long l = 1000l;
	    int i2= (int)l;
	    System.out.println(1);
	    System.out.println(i2);
	    
	    double d = 123.456;
	    int i3 = (int)d;
	    System.out.println(d);
	    System.out.println(i3);
	    
	    String s= "10";
	    int num = Integer.parseInt(s);
	    System.out.println(s);
	    System.out.println(num);
	    
	    String s2 = "3.14";
	    double num2 = Double.parseDouble(s2);
	    System.out.println(s2);
	    System.out.println(num2);
	    
	    int num3=100;
	    String s3 = String.valueOf(num3);
	    System.out.println(num3);
	    System.out.println(s3);   
	      

	}

}
