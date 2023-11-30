package replitnew;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashaMapCollectionViewOfValue9311 {
//	
//	Steps
//	Add elements in HashMap by key and value (1, Red) (2, Green) (3, Black) (4, White) (5, Blue)
//	Print Collection view of the values contained in this map
//	Note: Add data type to your collection objects and import required class for execute your code.
//
//	Expected Output
//	Collection view is: [Red, Green, Black, White, Blue]

	
	public static void main(String[] args) {
		Map<Integer, String> colorMap = new HashMap<>();
		 colorMap.put(1, "Red");
		 colorMap.put(2, "Green");
		 colorMap.put(3, "Black");
		 colorMap.put(4, "White");
		 colorMap.put(5, "Blue");
		 
	     Collection<String> values = colorMap.values();

		 System.out.println("Collection view is: " + values);
	}

}
