package replitnew;

import java.util.HashMap;
import java.util.Map;

public class HashMapAddByKeyAndValue931 {
	
//	Steps
//	Add elements in HashMap by key and value (1, Red) (2, Green) (3, Black) (4, White) (5, Blue)
//	Print HashMap
//	Note: Add data type to your collection objects and import required class for execute your code.
//
//	Expected Output
//	1 Red
//	2 Green
//	3 Black
//	4 White
//	5 Blue
	
	

	public static void main(String[] args) {
		 Map<Integer, String> colorMap = new HashMap<>();
		 colorMap.put(1, "Red");
		 colorMap.put(2, "Green");
		 colorMap.put(3, "Black");
		 colorMap.put(4, "White");
		 colorMap.put(5, "Blue");

	     // System.out.println(colorMap);
	      
	      for (Map.Entry<Integer, String> entry : colorMap.entrySet()) {
	          System.out.println(entry.getKey() + " " + entry.getValue());

	        }
	      
	      
	}

}
