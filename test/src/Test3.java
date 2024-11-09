class Parent2 {
    Parent2(){
        this(10);
        System.out.println("Java");
    }
    Parent2(int i) {
        this(10,20);
        System.out.println("Python");
    }
    Parent2(int i, int j) {
        System.out.println("Angular");
    }
}
class Child1 extends Parent2 {
    Child1() {
        super();
        System.out.println("React");
    }
}
public class Test3 {
	public static void main(String[] args) {
		 
        new Child1();

}
}
