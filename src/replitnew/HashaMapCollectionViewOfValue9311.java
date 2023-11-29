package replitnew;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashaMapCollectionViewOfValue9311 {
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
