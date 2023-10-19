package inheritance;

public class Inheritance1 {
	// runner
	public static void main(String[] args) {
		
		B bObj = new B();
		bObj.a = 1; 
		bObj.b = 2; 
		bObj.x = 3; 
		bObj.y = 4; 
		bObj.print();
		bObj.show(); 

		
	}
	

}


class A{
	// this is my parent class
	int a ;
	int b;
	
	public void print () {
		System.out.println(a+b);
	}
	
}

class B extends A{
	//thoi is my child Class
	
	int x;
	int y;
	public void show() {
		System.out.println(x+y);
		
	}
}