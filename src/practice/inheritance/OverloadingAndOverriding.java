package practice.inheritance;

public class OverloadingAndOverriding {
	public static void main(String[] args) {
		BankOfAmerica BofObj = new BankOfAmerica();
		System.out.println(BofObj.getinterest());
		
		CapitalOne CapObj = new CapitalOne();
		System.out.println(CapObj.getinterest());
		
		WellsFargo WFObj = new WellsFargo();
		System.out.println(WFObj.getinterest());
				
	}
	
// method overriding: redefined the same method from parent class to child class
	
	
// method overloading: can be used for individual classess. Multilpe method with the same name. 
// just number of paramerter shoul be diffrent
	
	
/*			Overloading    									 Overriding					
 *	no inheritance required just on class				at least we should have 2 class one parent and one child
 * 	definition should be diffrent body can be change	definition should be same but body can be change
 * 
 */

}
class Bank{
	int getinterest(){
		return 0;
	}
}

class BankOfAmerica extends Bank{
	int getinterest(){
		return 5;
	}
}

class CapitalOne extends Bank{
	int getinterest(){
		return 6;
	}
}

class WellsFargo extends Bank{
	int getinterest(){
		return 7;
	}
}

