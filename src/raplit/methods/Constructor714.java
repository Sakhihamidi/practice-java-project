package raplit.methods;

public class Constructor714 {
	
	public static void main(String[] args) {
		Array1[] array = new Array1[4];
		
		for (int i= 0; i< array.length; i++) {
			array[i] = new Array1();

			
		}
		
	}
	
}


class Array1{
	public Array1() {
		System.out.println("Hello Java");
	}
}