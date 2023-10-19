package practice.stringequality;

public class StringEquality1 {
	public static void main(String[] args) {
		
	//Agend:
	/*what is String: is a class not a data type / set of characters/ it is an object
	 * Types of String: `1- String litral 2-Reffrence or Object 
	 * 1-
	 * Stack Memory and Heap Memory in Java
	 * Example of String litral in Memory and Hashcodes
	 * String Reffrence/ Object
	 * Example of String Reffrence in Memory and Hashcodes
	 * String Equality : == and .equals
	 * Examples
	 * Mutable
	 * Immutable

	 */
	String name = "Elaha";
	//Decleration in memory it is called Reffrence
	//initializtion
	// now where it store in Java - it is called Object in Memory
	// now change the value
	
	name = "Elaha Sharif"; // This is Assignment 
	

	 String n = "Mushfique"; // - 101
	    System.out.println("n" +n.hashCode());
     String n1 = "Hamidi"; // - 102
	    System.out.println("n1"+ n1.hashCode());

     n1 = "Ghulam Hamidi"; // - 104
	    System.out.println("n1" + n1.hashCode());

     String n2 = "Gheza" ; // - 103
     String n3 = "Mushfique"; // - 101
	    System.out.println("n3" + n3.hashCode());

     
     String text = "Hello"; // - 105
     text = "Hello world";  // - 106  
}
	
}