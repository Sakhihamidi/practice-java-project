package practice111;
public class ConstructorChaining {
	
	    private int value;

	    public ConstructorChaining() {
	        // Call the parameterized constructor with a default value
	      this(10, 5);
	    }
	    // Parameterized constructor
	    public ConstructorChaining(int value) {
	        // Initialize the instance variable
	        this.value = value;
	    }
	    
	    public ConstructorChaining(int value, int value2) {
	        // Initialize the instance variable
	    	int b = value + value2;
	    	System.out.println("Sume is " + b);
	        this.value = value;
	    }
	    
	    
	    // Other methods...
	    public static void main(String[] args) {
	        // Create an object using the default constructor
	    	ConstructorChaining obj1 = new ConstructorChaining();
	        System.out.println("Value of obj1: " + obj1.value);

	        // Create an object using the parameterized constructor
	        ConstructorChaining obj2 = new ConstructorChaining(42);
	        System.out.println("Value of obj2: " + obj2.value);
	    }
	}