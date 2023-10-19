package practice.stringequality;

public class StringEqualityP {
	
	
	
		//ii. String Reference/Object:

	        String name = new String("Mushfique");

	        

	        //String Equality: Inother to compare the values of two strings, we use String equality:

	        //Types:

	        //i. double equal (==): Has two condition in order for us to get (True)

	        //1. Objects/values should be similar

	        //2. Memory Locations of the strings should be same

	        

	        //(==) String literal ex:

	        

	        String n = "Welcome";

	        n = "tekschool";

	        

	        

	        String n1 = "Welcome";

	        

	        System.out.println(n == n1);

	        

	        

	        //String reference Ex using ==;

	        

	        String n2 = new String("car");

	        

	        String n3 = new String ("car");

	        

	        System.out.println(n2 == n3);

	        

	        System.out.println(n2.hashCode());

	        System.out.println(n3.hashCode());

	        

	        //Comparison between string literal and string reference

	        

	        String text = "Hello world";

	        text = "kljfskl";

	        String text1 = new String ("Hello World");

	        

	        System.out.println(text == text1);


	        //String Equality:

	        //2. .equals();

	        

	        //1. String objects should be similar... it will print true

	        //2. Doesnt care about location

	        

	        

	        String n = "Mushfique"; //- Immutable

	        n = "Shujee";

	        

	        

	        String text = new String ("SAM"); //- Immutable

	        text = "Smith";

}
