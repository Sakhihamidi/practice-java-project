package inheritance;

public class EncapsulationRunner {

	public static void main(String[] args) {
		
		Encapsulation encObj = new Encapsulation();
		encObj.setNumberOne(15);
		encObj.setNumberTwo(50000);
		
		System.out.println(encObj.getNumberOne());
		
		System.out.println(encObj.getNumberTwo());

	}

}
