
class  Parent{
    public  static void study() {
        System.out.println("Medicine");
    }
}
class  Child extends Parent{
	//Method Hiding - when we use static keyword in both parent and child class the it is method hiding
    public  static  void study() {
        System.out.println("Acting");
    }
}


public class RunTimePolymorphism {

	public static void main(String[] args) {
		/* Parent p = new Parent();
	        p.study();
	        
	       /* Child c = new Child();
	        c.study();
	        */
	        
	        Parent p2 = new Child();
	        p2.study();
	        
	        
	        //Child c2 = (Child) new Parent();
		

	}

}
