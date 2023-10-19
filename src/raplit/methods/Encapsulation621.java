package raplit.methods;

public class Encapsulation621 {
	public static void main(String[] args) {
		
	Rectangle recObj = new Rectangle(10.0, 20.0);
	recObj.prinArea();
		
	}
	
}



class Rectangle{
	private double length;
	private double width;
	
		
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}

	Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	public double recAre() {
		double area = width * length;
		return area;
	}

	public void prinArea() {
		System.out.println("Rectangle area is " + recAre());
	}
}