package practice.inheritance;
		//inherance 
		// the works are destrobuted between develooper and each work on diffrent function
		// and they can use one classs for diffretnt time means class reuseability
		// aquiring methods and variables from parent class to child class is called inheritance
		// parent class can be called as supper class or base class
		// child class can be called as sub class or derived class
// Single inheritance --> extends
// multilevel inheritance --> extends
// multliple inheritance:  a single child class with multiple parent classn --> interface
// hiraricalinheritance: one parrent class inherited by multiple chil --> can be achieved by method overriding

class A{
	int a;
	int b;
	public void display() {
		System.out.println(a+b);
	}
}

class B{
	int x;
	int y;
	public void show () {
		System.out.println(x+y);
	}
	
}

public class MainWithoutInheritance {
	
	 public static void main(String[] args) {
		 // in order to access Class A and class B we should creat and object of that classes
		A aObj = new A();
		aObj.a = 100;
		aObj.b = 200;
		aObj.display(); 
		
		
		
		B bObj = new B();
		bObj.x = 10;
		bObj.y = 20;
		bObj.show();
		
	}
}



