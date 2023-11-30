package replitnew;

import java.util.TreeSet;

public class TreeSeatPrintFirstAndLastElement9215 {
	
	public static void main(String[] args) {
		
//		Steps
//		Add colors in TreeSet {Red, Green, Orange, White, Black}
//		print the TreeSet
//		Print first element of TreeSet
//		Print last element of TreeSet
//		Note: Add data type to your collection objects and import required class for execute your code.
//
//		Expected Output
//		Tree set: [Black, Green, Orange, Red, White]
//		First Element is: Black
//		Last Element is: White
		
		
		
    TreeSet<String> colorSet = new TreeSet<>();
      colorSet.add("Red");
      colorSet.add("Green");
      colorSet.add("Orange");
      colorSet.add("White");
      colorSet.add("Black");

      System.out.println("Tree set: " + colorSet);
      System.out.println("First Element is: " + colorSet.first());
      System.out.println("Last Element is: " + colorSet.last());


      
	}

}
