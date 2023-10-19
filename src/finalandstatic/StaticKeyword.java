package finalandstatic;

public class StaticKeyword {
	
	
// Now if I make my variable to static or private it canot be access here 
// it is because a static variable can be access only in its class.
					
// Static 
		
// 1. Static Variable: A static variable belongs to the class and not to any specific instance. 
//It is shared among all instances 
// (objects) of the class. It gets memory only once during class loading.

// static int numberOne = 10; // static Variable
		
// 2. Static Methods: A static method belongs to the class and can't 
// access instance (non-static) members directly. Static methods can be 
// called without creating an instance of the class.

	
	String name;
	static String nameA;
	public static void printinfo() {
		System.out.println("This is STATIC");
	}
	public void print() {
		System.out.println("This is NONSTATIC");
	}
	
	public static void main(String[] args) {
		
	//System.out.println(name); can not call becauese it in nonSTATIC
	System.out.println(nameA);
	printinfo();
	//Print(); Can not call because it in non STATIC
	
	
}	

}
