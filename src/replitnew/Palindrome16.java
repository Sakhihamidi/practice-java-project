package replitnew;

public class Palindrome16 {
	
	/* = * = * = * = * = * = (Palindrome) = * = * = * = * = * = * = = * = * =
	 * 	 I.. You are given a following String.
	 * 	 1. String name = "rotor";
	 * II. Check if the above String is palindrome or not, if yes return true if
	 * not, return false. Use the below three methods and check if it is palindrome
	 * or not.
	 * 1. String builder method. 2. String reverse. 3. For loop
	 * Expected Output String builder method = true String reverse method = true For
	 * loop method = true
	 */
			
	public static void main(String[] args) {
	    System.out.println("string builder method = " + isPalindromeWithStringBuilder("rotor"));
	    System.out.println("string reverse method = " + isPalindromeWithStringReverse("rotor"));
	    System.out.println("for loop method = " + isPalindromeWithForLoop("rotor"));
	}
	
	
	public static boolean isPalindromeWithForLoop(String myString) {
		int length = myString.length();
        for (int i = 0; i < length / 2; i++) {
			if(myString.charAt(i)!=myString.charAt(length-i-1)) {
			return false;
		}
			
	}
	
	return true;
	}
	
	 public static boolean isPalindromeWithStringBuilder(String myString) {
	        StringBuilder sb = new StringBuilder(myString);
	        return myString.equals(sb.reverse().toString());
	    }
	 
	 public static boolean isPalindromeWithStringReverse(String myString) {
	        String reversed = new StringBuilder(myString).reverse().toString();
	        return myString.equals(reversed);
	    }
}


