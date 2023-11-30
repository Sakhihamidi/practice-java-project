package replitnew;

import java.util.HashMap;
import java.util.Map;

public class HashaMapIfKeyContain936 {
	public static void main(String[] args) {
		
//		Steps
//		Add elements in HashMap by key and value (Red , 1) (Green , 2) (Black , 3) (White , 4) (Blue , 5)
//		Print HashMap
//		check if key contain Green then print answer by Yes or No and print value if answer is Yes
//		check if key contain Orange then print answer by Yes or No and print value if answer is Yes
//		Note: Add data type to your collection objects and import required class for execute your code.
//
//		Expected Output
//		The Original map: {Red=1, White=4, Blue=5, Black=3, Green=2}
//		Is key 'Green' exists?
//		yes - 2
//		Is key 'Orange' exists?
//		No
//		
		
		
		 String greenKey = "Green";
	     String orangeKey = "Orange";

	 
		 
		 Map<String, Integer> colorkeyIntegerMap = new HashMap<>();
		 	colorkeyIntegerMap.put("Red", 1);
		    colorkeyIntegerMap.put("Green", 2);
		    colorkeyIntegerMap.put("Black", 3);
		    colorkeyIntegerMap.put("White", 4);
		    colorkeyIntegerMap.put("Blue", 5);
		 System.out.println("The Original map: "+colorkeyIntegerMap);
		 
	        System.out.println("Is key '" + greenKey + "' exists?");
	        if (colorkeyIntegerMap.containsKey(greenKey)) {
	            System.out.println("Yes - " + colorkeyIntegerMap.get(greenKey));
	        } else {
	            System.out.println("No");
	        }
	        
	        

	        System.out.println("Is key '" + orangeKey + "' exists?");
	        if (colorkeyIntegerMap.containsKey(orangeKey)) {
	            System.out.println("Yes - " + colorkeyIntegerMap.get(orangeKey));
	        } else {
	            System.out.println("No");
	        }
	        
		 
	}
}

