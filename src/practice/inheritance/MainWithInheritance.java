package practice.inheritance;
// single inheritance
public class MainWithInheritance {

	public static void main(String[] args) {
		// Now I want accss all feilds and method of class A and B trough inheritance

		/*
		 * A aObj = new A(); aObj.a = 100; aObj.b = 200; aObj.display();
		 */

		B1 bObj = new B1();
		bObj.a = 1;
		bObj.b = 2;
		bObj.x = 3;
		bObj.y = 4;
		bObj.display();
		bObj.show();

	}

}

class A1 {
	int a;
	int b;

	public void display() {
		System.out.println(a + b);
	}
}

class B1 extends A1 {
	int x;
	int y;

	public void show() {
		System.out.println(x + y);
	}

}