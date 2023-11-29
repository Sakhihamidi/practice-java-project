package replitnew;

public class Palindrome16 {
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


