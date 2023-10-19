package practicewithelaha;

public class inheritance1 {

	public static void main(String[] args) {
		
			B1 bObj = new B1();
			bObj.a = 1;
			bObj.b = 2;
			bObj .x =3;
			bObj.y = 4;
			bObj.display();
			bObj.print();

			
				}
			
		}

		class A1{
			int a;
			int b;
			public void display() {
				System.out.println(a+b);
			}
		}

		class B1 extends A1{
			int x;
			int y;
			public void print() {
				System.out.println(x+y);
			}
			
		}

		
			


