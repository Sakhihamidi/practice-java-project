package raplit.methods;

import java.util.Scanner;

public class method631 {
	public static void main(String[] args) {
		Scanner userInput =  new Scanner(System.in);
		System.out.println("Please enter your first name");
		String firstName = userInput.nextLine();
		
		System.out.println("Please enter your last Name");
		String lastName = userInput.nextLine();
		
		Student stuObj = new Student();
		stuObj.fullName(firstName, lastName);
	}

}


class Student{
	public void fullName(String firstName, String lastName) {
		System.out.println(firstName.concat(" ").concat(lastName));
	}
}