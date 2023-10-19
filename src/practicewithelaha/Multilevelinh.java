package practicewithelaha;

public class Multilevelinh {
	public static void main(String[] args) {
		
	Z zObj=new Z();
	zObj.a=1;
	zObj.b=2;
	zObj.c=3;
	zObj.d=4;
	zObj.e=5;
	zObj.f=6;
	
	zObj.display();
	zObj.show();
	zObj.print();


	
	}
}


class X{
	int e;
	int f;
	public void display() {
		System.out.println(e+f);
	}
	
	
}

class Y extends X{
	int c;
	int d;
	public void show() {
		System.out.println(c+d);
	}
	
}

class Z extends Y{
	int a;
	int b;
	public void print() {
		System.out.println(a+b);
	}
	
}