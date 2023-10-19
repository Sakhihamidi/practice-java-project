package raplit.methods;

public class Encapsulation731 {
	public static void main(String[] args) {
		
		Number numberObj = new Number();
		numberObj.setNum(6);
		System.out.println("Number is " + numberObj.getNum());
	}
	

}

class Number{
	private int num;

	public int getNum() {
		return num;
	}

	
	public void setNum(int num) {
		this.num = num;
	}
	

}
