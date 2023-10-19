package practicewithelaha;

public class StringEqualityReffrence {
	

	public static void main(String[] args) {
		
	
//String Equality: Inother to compare the values of two strings, we use String equality:

//i. double equal (==): Has two condition in order for us to get (True)
//1. Objects/values should be similar
//2. Memory Locations of the strings should be same
	String n = "Welcome";
	String n1 = "Welcome";
	
    //(==) String literal ex:

	System.out.println(n == n1); // Two Conditions
    
	System.out.println(n == n1); // Two Conditions


    
    //String Reffrence
	
	String n2 = new String ("Car");
	String n3 = new String ("Car");
	
	System.out.println(n2 == n3); // Two Conditions be cause the it save in 2 places in memory
	       

  //Comparison between string literal and string reference

    

	String text = "Hello world";
	String text1 = new String ("Hello World");
	System.out.println(text == text1); // values are same but reffrence saved in 2 place of memory
// if we print hashcode we will get heap memory address

	//2. .equals() just check on condition --> just chekc the Values
    //1. String objects should be similar... it will print true
    //2. Doesnt care about location
    System.out.println(text.equals(text1));

	
	String n4 = "Mushfique";
    String n5 = "Mushfique";
    System.out.println(n4.equals(n5));
    
    // So string litral is immutable
    // So String reffrence immutable
    
        

   
   
   
   
    
    
	
	}	
	
}