package practice111;

public class Hairarical {
	
			//runner Class
		public static void main(String[] args) {
			BB bObj = new BB();
			bObj.a = 1;
			bObj.b = 2;
			bObj.y = 3;
			bObj.z = 4;
			bObj.print();
			bObj.printNumber();
			
			CC cObj = new CC();
			// now we are able to use all methods and feild in class c and AAA(Parent)
					
			
		
			
		}
		

	}

	class AAA {
		// Parent Class{
		int y;
		int z;
		public void print () {
			System.out.println(y+z);
	}
	}

	class BB extends AAA{
		//child class means child 1
		int a;
		int b;
		public void printNumber () {
			System.out.println(a+b);
		}
	}

	class CC extends AAA{
		//Child class for classA child 2
		int c;
		int d;
		public void display () {
			System.out.println(c+d);
		}
	}

	class DD extends AAA{
		// Child Class for classs A - child 3
		int e;
		int f;
		public void show () {
			System.out.println(e+f);
		}
	}



