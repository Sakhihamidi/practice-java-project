package replitnew;

import java.util.HashSet;

public class HashSetIsEmpty925 {
	public static void main(String[] args) {
		
	  HashSet<String> colorSet = new HashSet<>();
	  	colorSet.add("Red");
	  	colorSet.add("Green");
	  	colorSet.add("Black");
	  	colorSet.add("White");
	  	colorSet.add("Pink");
	  	colorSet.add("Yellow");

	    System.out.println("Original Hash Set: " +colorSet);
	    
	    boolean isEmptyFalse = colorSet.isEmpty();
	    System.out.println("Checking the above Hash Set is empty: " + isEmptyFalse);
	    
	    colorSet.clear();
	    boolean isEmptyTrue = colorSet.isEmpty();

	    System.out.println("After remove elements Hash Set is empty: " + isEmptyTrue);

	}
}
	
