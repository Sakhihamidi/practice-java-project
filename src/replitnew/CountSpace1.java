package replitnew;

public class CountSpace1 {
	
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
 
	 