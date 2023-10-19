package javaproject;

public class GeometricShapes {
	public static void main(String[] args) {
		Circle circleObj = new Circle();
		circleObj.radius =3;
		System.out.println("Area of the Circle is: " + circleObj.calculateArea());
		
		Square squareObj = new Square();
		squareObj.edge = 4;
		System.out.println("Area of the Square is: " + squareObj.calculateArea());

		Triangle triangleObj = new Triangle();
		triangleObj.base = 2;
		triangleObj.hight = 3;
		System.out.println("Area of the triangle is: " + triangleObj.calculateArea());

		
	}

}

class Shape3 {
	String color;
	double area;

	public double calculateArea() {
		System.out.println("Calculate area of shapes");
		return area;
	}
}

class Circle extends Shape3 {
	double radius;

	public double calculateArea() {
		area = Math.PI * radius * radius;
		return area;
		// System.out.println(area);
	}

}

class Square extends Shape3 {

	double edge;

	public double calculateArea() {
		area = edge * edge;
		return area;
	}

}

class Triangle extends Shape3 {

	double base;
	double hight;

	public double calculateArea() {
		area = (base * hight)/2;
		return area;
}
}