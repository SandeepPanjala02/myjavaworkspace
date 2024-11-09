class Parent1{
	
    int a = 10;
    int b = 20;
    int x = 111;
}
class Child extends Parent1 {
    int a = 100;
    int b = 200;
    int y = 222;
    
    void add(int a, int b) {
        System.out.println(a + b);
        //this keyword use to call current  methods or variable 
        System.out.println(this.a + this.b);
        //super keyword use to call the parent class methods or variables
        System.out.println(super.a + super.b);
         System.out.println(x);
        
       
    }
}
public class Test1 {

	public static void main(String[] args) {
		Child c = new Child();
        c.add(1000, 2000);
	}

}
