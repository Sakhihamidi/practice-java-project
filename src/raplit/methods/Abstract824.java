package raplit.methods;

public class Abstract824 extends TwoDShape {

	public Abstract824(int length, int width) {
		super(length, width);
	}

	public void draw() {
		System.out.println("Drawing Rectangle");
	}

	public static void main(String[] args) {

		Abstract824 recObj = new Abstract824(10, 10);
		recObj.draw();
		double area = recObj.getAre();
		
		System.out.println("Area of given rectangle="+area);
		

	}
}

abstract class TwoDShape {
	private int length;
	private int width;

	public TwoDShape(int length, int width) {
		this.length = length;
		this.width = width;
	}

	abstract public void draw();

	public double getAre() {
		return length * width;
	}
}