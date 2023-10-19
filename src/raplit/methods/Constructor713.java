package raplit.methods;

public class Constructor713 {
	public static void main(String[] args) {
		
	Constructor222 conObj = new Constructor222();
	
	Constructor222 conObj1 = new Constructor222(20);

	Constructor222 conObj2 = new Constructor222(20, 30);

}
}

class Constructor222{
	public Constructor222() {
		System.out.println("Zero argument constructor");
	}
	
	public Constructor222(int a) {
		System.out.println("One argument constructo");
	}
	
	public Constructor222(int a, int b ) {
		System.out.println("Two arguments constructo");

	}
}
