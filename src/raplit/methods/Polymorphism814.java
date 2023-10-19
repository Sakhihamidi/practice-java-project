package raplit.methods;

public class Polymorphism814 {
	public static void main(String[] args) {
		
		Bank boaObj = new BOA();
		System.out.println("BOA rate of interest: " + boaObj.interestRate());
		
		Bank chaseObj = new Chase();
		System.out.println("CHASE rate of interest: " + chaseObj.interestRate());
		
		Bank CaponeObj = new Capone();
		System.out.println("CAPONe rate of interest: " + CaponeObj.interestRate());		
	}

}


class Bank{
	public double interestRate() {
		return 0;
	}
	
}
class Chase extends Bank{

	public double interestRate() {
		return 7.3;
	}

	
	
}

class Capone extends Bank{
	public double interestRate() {
		return 9.7;
	}
	
}

class BOA extends Bank{
	public double interestRate() {
		return 8.4;
	}
	
}

