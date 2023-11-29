package replitnew;

public class RemovingSpaceInString2 {
	
		/* public static void main (String[] args) { 
			  
		    String myString = "wefeqf878979797fewfewrf879797efds&^&^*^*^";
		    int countedCharacter = 0;
		    
		    for (int i =0; i < myString.length(); i++){
		    	countedCharacter++;
		    }
		    System.out.println(countedCharacter);
		  }
		}
		*/
		
		public static int countCharacter(String myString) {
			int countedCharacter = 0;
			for (int i =0; i < myString.length(); i++){
		    	countedCharacter++;
			}
			return countedCharacter;

		}
		public static void main(String[] args) {
			int coutnedCharacter = countCharacter("wefeqf878979797fewfewrf879797efds&^&^*^*^");
			System.out.println(coutnedCharacter);

	}

}
