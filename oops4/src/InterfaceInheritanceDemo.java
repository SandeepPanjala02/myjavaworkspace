
interface A{
	
}


//Single Inheritance
interface B extends A{
	
}
//Multilevel Inheritance
interface c extends B{
	
}

interface X{
	void m1();
	
}

interface Y{
	void m1();
	
	
}
//Multiple Inheritance
interface Z extends X,Y {
	
}

class Employee{
	
	
}

class XYZ extends Employee implements X,Y{

	@Override
	public void m1() {
		System.out.println("m1() implemented");
		
	}
	
	
	
	
}
public class InterfaceInheritanceDemo {

}
