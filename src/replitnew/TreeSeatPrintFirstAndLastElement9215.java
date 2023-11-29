package replitnew;

import java.util.TreeSet;

public class TreeSeatPrintFirstAndLastElement9215 {
	
	public static void main(String[] args) {
		
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
