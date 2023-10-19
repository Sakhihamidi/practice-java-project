package raplit.methods;

public class Abstract827 {
	public static void main(String[] args) {
		
		Addition AdditionObj = new Addition();
		AdditionObj.calc(20, 30);
		
		Subtract SubtractObj = new Subtract();
		SubtractObj.calc(10, 5);
		
		Multiply MultiplyObj = new Multiply();
		MultiplyObj.calc(10, 20);
		
	}

}


abstract class MyTest{
	public abstract void calc(int a, int b);
	
	
}

class Addition extends MyTest{

	public void calc(int a, int b) {
		System.out.println("Sum: " + (a+b));	
	}
}

class Multiply extends MyTest{

	public void calc(int a, int b) {
		System.out.println("Multiply: " + a*b);
	}
		
}

class Subtract extends MyTest{

	public void calc(int a, int b) {

		System.out.println("Subtract: " +( a-b));		
	}
	
}