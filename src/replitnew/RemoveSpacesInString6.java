package replitnew;

public class RemoveSpacesInString6 {
	public static void main(String[] args) {
		
	String myString = "Welcome to all TekSchool students ... !!!";
	String filaString = removingSpaces(myString);
	System.out.println(filaString);
	}
	public static String removingSpaces(String myString) {
		String finalString = myString.replaceAll(" ", "");
		return finalString;

	}

}
