package replitnew;

import java.util.HashSet;

public class HashSetIsEmpty925 {
	public static void main(String[] args) {
		
		
//		Steps
//		add colors in HashSet [Red, Green, Black, White, Pink, Yellow]
//		print HashSet
//		remove all elements
//		print HashSet after remove all elements
//		Expected Output
//		Original Hash Set: [Red, White, Pink, Yellow, Black, Green]
//		Checking the above Hash Set is empty: false
//		After remove elements Hash Set is empty: true
//		
		
		
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
	
