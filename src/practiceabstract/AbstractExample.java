package practiceabstract;

public class AbstractExample {
	public static void main(String[] args) {
		Bike1 bikeObj = new Bike1();
		bikeObj.honk();
		bikeObj.start();
		bikeObj.stop();
		
		ElectricCar elecCarObj = new ElectricCar();
		elecCarObj.honk();
		elecCarObj.start();
		elecCarObj.stop();
		
	}

}


abstract class Car{
	public abstract void stop();
	public abstract void start();
	
		public void honk() {
		System.out.println("car is Honking");
	}
}

class Bike1 extends Car{

	@Override
	public void stop() {
		System.out.println("Bike is Stopping");
	}

	@Override
	public void start() {
		System.out.println("Bike is Strating");
	}
	public void honk() {
		System.out.println("Bike is not Honking");
	}
	
}


class ElectricCar extends Car{

	@Override
	public void stop() {
		System.out.println("Electric Car is Stopping");
	}

	@Override
	public void start() {
		System.out.println("Electric Car is Starting");
		
	}
	
}