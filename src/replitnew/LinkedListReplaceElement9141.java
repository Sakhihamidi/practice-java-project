package replitnew;

import java.util.LinkedList;

public class LinkedListReplaceElement9141 {
	
	  public static void main(String[] args) {
		  
//		  Steps
//		  add colors in LinkedList [Red, Green, Black, White, Pink]
//		  print LinkedList
//		  replace Orange color with Green color
//		  print LinkedList after replace element
//		  Expected Output
//		  Original linked list: [Red, Green, Black, White, Pink] New linked list: [Red, Orange, Black, White, Pink]
//				  
				  
		    LinkedList<String> colorsList = new LinkedList<>();
		    colorsList.add("Red");
		    colorsList.add("Green");
		    colorsList.add("Black");
		    colorsList.add("White");
		    colorsList.add("Pink");
		    System.out.println("Original linked list: " + colorsList);

		    colorsList.set(1, "Orange");
		    System.out.println("New linked list: " + colorsList);

		  }
	  

}
