package raplit.methods;

public class Ploymorphism811 extends Bike{
	public void show() {
		System.out.println("running safely with 60km");
	}
	public static void main(String[] args) {
		Bike bikeObj = new Ploymorphism811();
		bikeObj.show();
		
	}

}

class Bike{
	public void show() {
		System.out.println("Running");
	}
}