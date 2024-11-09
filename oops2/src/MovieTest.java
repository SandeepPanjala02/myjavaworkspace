
public class MovieTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Movie m1 = new Movie(111, "Devara" , "Koratala Shiva");
		Movie m2 = new Movie(222, "RRR", "SS Rajamouli");
		Movie m3 = new Movie(111, "Devara" , "Koratala Shiva");
		
		//Shallow cloning (Assigning one reference to another)
		Movie m4 = m1;
		System.out.println("m4:"+m4.hashCode());
		System.out.println("m1:"+m1.hashCode());
		
		
		//Deep cloning = (create independant object)
		Movie m5 = (Movie) m2.clone();
		
		System.out.println("m2:"+m2.hashCode());
		System.out.println("m5:"+m5.hashCode());
		
		
		
		/*
		System.out.println(m1);
		System.out.println(m2);
		*/
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
		System.out.println(m4.hashCode());
		
		
		//== operator always meant for reference comparison
		System.out.println(m1 == m2);
		System.out.println(m1 == m3);
		System.out.println(m1 == m4);
		
		//object class .equals() is meant for Reference Comparison
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		System.out.println(m1.equals(m4));
		
		String s1 = new String("Java");
		String s2 = new String("Java");
		System.out.println(s1.equals(s2));
		
		
		
	}

}
