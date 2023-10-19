package raplit.methods;

public class Abstract826 {
	public static void main(String[] args) {
		Car1 carObj = new Tesla1();
		carObj.drive();
		carObj.gearChange();
	}
	
	

}


abstract class Car1{
	public Car1() {
		System.out.println("Car is built.");
		
	}
	public abstract void drive();
	public void gearChange() {
		System.out.println("GearChanged");
	}
}

class Tesla1 extends Car1{

	public void drive() {
		System.out.println("Drive Safely");
	}
	
}
