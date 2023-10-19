package practice.wekk_7.overriding;

public class OverridingPolymprphism {
	public static void main(String[] args) {
		Vehicle vehicleObj = new Vehicle();
		vehicleObj.move();// vehicle is moving
		
		Car carObj = new Car();
		carObj.move(); // Car is moving
		
		Bike bikeObj = new Bike();
		bikeObj.move();// Bike is Moving
		
	}

}


class Vehicle{
	public void move() {
		System.out.println("Vehicle is Moving");
	}
	
}

class Car extends Vehicle{
	public void move() {
		System.out.println("Car is Moving");
	}
	
}

class Bike extends Vehicle{
	public void move() {
		System.out.println("Bike is Moving");
	}
	
}