package replitnew;

public class RemoveSpacesInString6 {
	public static void main(String[] args) {
		
		/*
		 * = * = * = * = * = * = * = (Remove Spaces in a String) = * = * = * = * = * = *
		 * I.. Write java program to remove white space from below String.
		 * 1. "Welcome to all TekSchool students ... !!!"
		 * Expected Output WelcometoallTekSchoolstudents...!!!
		 */
				
				
		
	String myString = "Welcome to all TekSchool students ... !!!";
	String filaString = removingSpaces(myString);
	System.out.println(filaString);
	}
	public static String removingSpaces(String myString) {
		String finalString = myString.replaceAll(" ", "");
		return finalString;

	}

}
