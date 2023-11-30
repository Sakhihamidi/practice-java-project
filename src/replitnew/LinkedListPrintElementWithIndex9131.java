package replitnew;

import java.util.LinkedList;

public class LinkedListPrintElementWithIndex9131 {
	public static void main(String[] args) {
		
		
//		Steps
//		Add colors in LinkedList {Red, Green, Black, Pink, orange}
//		print the LinkedList
//		print Index # and element by using loop
//		Expected Output
//		Original linked list:[Red, Green, Black, Pink, orange] Element at index 0: Red Element at index 1: Green Element at index 2: Black Element at index 3: Pink Element at index 4: orange
//		
//		
		
	  LinkedList<String> colorsList = new LinkedList<>();
      colorsList.add("Red");
      colorsList.add("Green");
      colorsList.add("Black");
      colorsList.add("Pink");
      colorsList.add("Orange");
      System.out.println("Original linked list:" + colorsList);
      
      for (int i = 0; i < colorsList.size(); i++) {
          System.out.println("Element at index " + i + ": " + colorsList.get(i));
      } 
      
	}
}
