import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println(al);
		System.out.println(al.size());
		
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(null);
		System.out.println(al);
		System.out.println(al.size());
		
		al.add("Java");
		al.add("Python");
		System.out.println(al);
		System.out.println(al.size());
		
		
		
		al.set(0, 100);
		System.out.println(al);
		System.out.println(al.size());
		
		
		
		al.add(1, 123);
		System.out.println(al);
		System.out.println(al.size());
		
		al.remove(0);
		al.remove(3);
		System.out.println(al);
		System.out.println(al.size());
		
		System.out.println(al.get(1));
		
		al.clear();
		System.out.println(al);
		System.out.println(al.size());
		
	}

}
