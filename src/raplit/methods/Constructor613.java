package raplit.methods;

public class Constructor613 {
	public static void main(String[] args) {
		Fruit appleObject = new Fruit("Peach", 3.30);
		System.out.println("Fruit " + appleObject.fruitName + " with Price " + appleObject.basePrice);
		
	}
	
	

}


class Fruit{
	
	String fruitName = "";
	double basePrice;
	
	Fruit(String fruitName, double basePrice){
	this.fruitName = fruitName;
	this.basePrice = basePrice;
		
}
}
