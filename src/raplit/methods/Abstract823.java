package raplit.methods;

public class Abstract823 {
	public static void main(String[] args) {
		
		var bmwObj = new BMW();
		bmwObj.accelerat();
	}
	

}

abstract class Car{
	public abstract void accelerat();
	
	
	
}
class BMW extends Car{
	public void  accelerat() {
		System.out.println("BMW ::accelerate");
	}
	
}