package replitnew;

import java.util.LinkedList;

public class LinkedListPrintElementWithIndex9131 {
	public static void main(String[] args) {
		
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
