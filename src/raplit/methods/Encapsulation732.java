package raplit.methods;

public class Encapsulation732 {
	public static void main(String[] args) {
		Rectangle1 recObj = new Rectangle1(30,20);
		
		recObj.getLength();
		recObj.getWidth();
		System.out.println("Area: " + recObj.getLength() * recObj.getWidth());
		
		recObj.setLength(60);
		recObj.setWidth(50);
		System.out.println("New area is: " + recObj.getLength() * recObj.getWidth());

	}

}

class Rectangle1{
	private int length;
	private int width;
	
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}


	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}



	public Rectangle1(int length, int width) {
		
		this.length = length;
		this.width = width;
	}
	
	
}