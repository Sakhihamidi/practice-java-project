package replitnew;

public class CountSpace1 {
	/*
	 * = * = * = * = * = * = * = (Count Blank Spaces ) = * = * = * = * = * = * =
	 * 	I.. You are giving a String.
	 * 1. "Tek School of America"
	 * II. Write a java program to count the blank spaces in a String:
	 * Note: Please select the correct data type for the above variable. **
	 * Expected Output The number of blank spaces are: 3
	 */
			
		
	
	/*  public static void main(String[] args) {

	      String givenString = "Tek School of America";
	        int count = 0;
	        for(int i = 0; i < givenString.length(); i++){
	          if(givenString.charAt(i) == ' '){
	            count++;
	          }

	        }
	          System.out.println("The number of blank spaces are: "+ count);

	      }
	  }
	*/
	    
		    public static int countSpace(String givenString) {
		    
		      int count = 0;
		      for(int i = 0; i < givenString.length(); i++){
		        if(givenString.charAt(i) == ' '){
		          count++;
		        }

		      }
		      return count;
		    }
		    public static void main(String[] args) {
		    	int spaces = countSpace("Tek School of America");
		    	System.out.println(spaces);
			    

		}
}
 
	 