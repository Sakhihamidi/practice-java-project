package practicewithelaha;


// inheritance : the works are detrobuted between develoopers and each developer will work on one functionality
// diffrent class and each dev one 
// the most reason of uusing inheritance i code useability
// parent class --> supper class --> base class
// child class --> sub class --? derived cladd 

// Single inheritance : one child and one parent -- > extends 
// Multilevel; one grand father one father and one child --> extend

public class inheritacne {
		public static void main(String[] args) {
		A aObj = new A();
		aObj.a=1;
		aObj.b=2;
		aObj.display();
		
		B bObj = new B();
		bObj.x =3;
		bObj.y =4;
		bObj.print();

	
		}
	
}

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
	public void print() {
		System.out.println(x+y);
	}
	
}

	
	