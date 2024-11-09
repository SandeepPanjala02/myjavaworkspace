import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		//Normal ArrayList
		//No Type Safety
		
		ArrayList al = new ArrayList<>();
		al.add(100);
		al.add(200);
		
		al.add("Java");
		al.add("Python");
		System.out.println(al);
		
		Object obj = al.get(0);
		int i = (Integer) obj;//Type casting is mandatory.
		System.out.println(i);
	
		
		//Generic Syntax
		//Type safety and avoid type casting
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("Java");
		courses.add("Python");
		
		//Type safe
		System.out.println(courses);
		
		//No type casting
		
		String course = courses.get(0);
		System.out.println(course);
		
		
		
	}

}
