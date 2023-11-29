package replitnew;

import java.util.HashMap;
import java.util.Map;

public class HashaMapIfKeyContain936 {
	public static void main(String[] args) {
		
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

