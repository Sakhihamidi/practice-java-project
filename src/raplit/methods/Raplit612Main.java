package raplit.methods;

public class Raplit612Main {

	public static void main(String[] args) {
		/*
		 * Write a java program with following steps:
		 * 
		 * I. Add following states/Fields int Fruit class. (Do not initialize the
		 * Fields)
		 * 
		 * 1. String name 2. double basePrice 3. double quantity
		 * 
		 * II. In Fruit class, Create a method and name it getTotalPrice().
		 * 
		 * 1. This method should return basePrice multiply by quantity.
		 * 
		 * III. Once you add the method and fields in Fruit class, now head back to Main
		 * Class.
		 * 
		 * 
		 * 1. Creat main method in the Main Class. 2. Create an instance of Fruit class
		 * and name it appleObject. 3. Using appleObject, assign values to the fields
		 * name, basePrice and quantity in Fruit class. 4. Declare another variable and
		 * name it appleTotalPrice, using appleObject, call the method getTotalPrice()
		 * and assign its value to appleTotalPrice.
		 */
		 
		Raplit612Fruit appleObject = new Raplit612Fruit();
		appleObject.name = " Apple";
		appleObject.quanity = 2.11;
		appleObject.basePrice = 3.10;
		double appleTotalPrice;
		
		System.out.println("Total price for Apple is: " + appleObject.getTotalPrice());
		
		 
		Raplit612Fruit orangeObject = new Raplit612Fruit();
		orangeObject.name = " Orange";
		orangeObject.quanity = 3.41;
		orangeObject.basePrice = 2.10;
		
		System.out.println("Total price for Orange is: " + orangeObject.getTotalPrice());
		 /* 
		 * IV. Print the value that is stored in totalPrice.
		 * 
		 * V. Create an instance of Fruit class and name it orangeObject.
		 * 
		 * 1. Using orangeObject, assign values to the fields name, basePrice and
		 * quantity in Fruit class. 2. Declare another variable and name it
		 * orangeTotalPrice, using appleObject, call the method getTotalPrice() and
		 * assign its value to orangeTotalPrice.
		 * 
		 * IV. Print the value that is stored in orangeTotalPrice.
		 ** 
		 * NOTE: Use the following values:
		 * 
		 * Values For AppleObject name = "Apple" basePrice = "3.10" quantity = "2.11"
		 * 
		 * For orange Object name = "Orange" basePrice = "2.10" quantity = "3.41"
		 * 
		 * This Assignment is to understand how to create Instantiation of an
		 * Object/Class in Main class. also how to refer each state/feidls for different
		 * Objects.
		 * 
		 * we are looking for method creation and method calling best code practice.
		 * which is paying attention to naming convensions. and also assigning objects
		 * and values.
		 **
		 ** 
		 * 
		 * NOTE: Please select the correct name and data types for the above variables.
		 * **
		 ** 
		 * Hint: Look at the below expected output. **
		 * 
		 * Expected Output Total price for Apple is: 6.5409999999999995 Total price for
		 * Orange is: 7.1610000000000005
		 */
	}

}
