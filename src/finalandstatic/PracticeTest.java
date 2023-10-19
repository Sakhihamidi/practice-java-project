package finalandstatic;

import java.util.Scanner;

public class PracticeTest {
	public static void main(String[] args) {
		
	try {
	double num1;
	double num2;
	System.out.println("Enter 2 numbers");

	Scanner input = new Scanner(System.in);
	num1= input.nextDouble();
	num2 = input.nextDouble();
	System.out.println(calculateDevide(num1,num2));
	}catch(ArithmeticException e) {
		System.out.println();
	}
	}
	
	public static double calculateDevide(double a, double b) {
		return a/b;
	}

	}


