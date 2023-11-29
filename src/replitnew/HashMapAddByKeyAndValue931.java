package replitnew;

import java.util.HashMap;
import java.util.Map;

public class HashMapAddByKeyAndValue931 {
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
