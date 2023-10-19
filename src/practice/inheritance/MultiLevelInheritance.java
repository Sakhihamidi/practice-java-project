package practice.inheritance;

public class MultiLevelInheritance {
		// MultiLevel inheritance

	public static void main(String[] args) {

			D2 B2Obj2 = new D2();
			
			B2Obj2.a = 1; 
			B2Obj2.b = 2; 
			B2Obj2.c = 3; 
			B2Obj2.d = 4; 
			B2Obj2.x = 5; 
			B2Obj2.y = 6; 
			
			B2Obj2.display();
			B2Obj2.show();
			B2Obj2.print();


		}

	}

	class B2{
		int a;
		int b;

		public void display() {
			System.out.println(a + b);
	}
	}

	class C2 extends B2{
		int c;
		int d;

		public void show() {
			System.out.println(c + d);
		}
	}

	class D2 extends C2 {
		int x;
		int y;

		public void print() {
			System.out.println(x + y);
		}

	}


