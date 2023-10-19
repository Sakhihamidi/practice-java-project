package practice.wekk_7.overriding;

public class MethodOverriding {
	
	//Method Overriding allows a subclass or child class to provide a specific implementation of a method 
	//that is already exist in parent class.
		
	// overriding is declearing a method in Child class that is already exist in the parent class, 
	//so that child class can have its own implementation

	// Rules for Method Overriding
	//The method must have the same name as in the parent class.
	//The method must have the same parameter as in the parent class.
	//There must be in 2 classes (inheritance)
		
	// Simply Overriding means to have the parend class method in child class.
	public static void main(String[] args) {
		Child childObj = new Child ();
		childObj.show();
		
	}

}


class Parent{
	public void show() {
		System.out.println("Parent is Showing");
	}
	
}

class Child  extends Parent{

	public void show() {
		System.out.println("Child is Prenting");
	}

	
	}
	
	
