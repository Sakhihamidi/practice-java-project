package raplit.methods;

public class Abstract825 {
	public static void main(String[] args) {
		Bank1 bankObj;
		// or we can directly crat each child Object  that will be same
		
		bankObj = new CitiBank();
		System.out.println("Citi Rate of Interest is: " + bankObj.interestRate() + "%");
		
		bankObj = new BOA1();
		System.out.println("BOA Rate of Interest is: " + bankObj.interestRate()+ "%");

		
	}

}
abstract class Bank1{
	abstract public int interestRate();
	
	
}

class BOA1 extends Bank1{
	public int interestRate() {
		return 5;
	}
	
}

class CitiBank extends Bank1{
	public int interestRate() {
		return 7;
	}
	
}