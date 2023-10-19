package inheritance;

public class Constructor {
	
	// block of code
	// special method
	//default 
	//prameterize
	// nonparameterize
	//default values
	
	public int numberOne ;
	public String firstName;
	public boolean result;
	
	
	public Constructor() {
		numberOne = 0;
		firstName = null;
		result = false;
	}
		
		
		public Constructor(int numberOne, String firstName, boolean result) {
			this.numberOne=numberOne;
			this.firstName=firstName;
			this.result=result;
			
		}
	}


