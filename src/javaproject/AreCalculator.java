package javaproject;

import java.lang.Math;

public class AreCalculator {

	static double calculateArea(double radius) {
		return Math.PI * radius * radius;

	}

	static double calculateArea(double length, double width) {
		return length * width;
	}

	static double calculateArea(double side1, double side2, double side3, double side4) {
		return side1 + side2 + side3 + side4;
	}
	
	public static void main(String[] args) {
		
		System.out.println(calculateArea(2));
		calculateArea(2);
		calculateArea(2, 3);
		calculateArea(4, 4, 4, 4);


		
	}

	private static void claculateAre() {
		
	}
}
