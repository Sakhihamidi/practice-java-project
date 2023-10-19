package practice111;

public class MultipleInheritance {
	
	//runner Class
	public static void main(String[] args) {
		D dObj = new D();
		dObj.a = 1;
		dObj.b = 2;
		dObj.c = 3;
		dObj.d = 4;
		dObj.e = 5;
		dObj.f = 6;
		dObj.display();
		dObj.print();
		dObj.show();

		
	}
	

}

class A {
	// Parent Class{
	
}

class B extends A{
	//child class for Parent(A)
	int a;
	int b;
	public void print () {
		System.out.println(a+b);
	}
}

class C extends B{
	//Child class for class B
	int c;
	int d;
	public void display () {
		System.out.println(c+b);
	}
}

class D extends C{
	// Child Class for classs C
	int e;
	int f;
	public void show () {
		System.out.println(e+f);
	}
}

