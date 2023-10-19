package javaproject;

public class ElectronicDevice {
	public static void main(String[] args) {
		Telvision tvObj = new Telvision();
		tvObj.brand= "Samsung";
		tvObj.turnOn();
		
		tvObj.changeVolume(30, 80);
		System.out.println("New valune us " + tvObj.changeVolume(30, 80));
		
		
		tvObj.turnoff();

	}

}

class ElectricDevices {

	String brand;
	boolean powerStatus;

	public void turnOn() {
		System.out.println(brand + " is turned On");
	}

	public void turnoff() {
		System.out.println(brand + " is turned Off");

	}
}

class Telvision extends ElectricDevices {

	public int changeVolume(int valume, int newValume) {
		if(newValume <= 100) {
			valume = newValume;

		}else {
			System.out.println("valume should be between 0 and 100");
		}
		return valume;

	}

}