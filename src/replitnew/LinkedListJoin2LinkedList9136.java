package replitnew;

import java.util.LinkedList;

public class LinkedListJoin2LinkedList9136 {
	public static void main(String[] args) {
		
		/*
		 * Steps add colors in first LinkedList [Red, Green, Black, White, Pink]
		 * print first LinkedList
		 * add colors in second LinkedList [Red, Green, Black, Pink]
		 * print second LinkedList
		 * Join first and second LinkedList
		 * print LinkedList after join
		 * Expected Output List of first linked list: [Red, Green, Black, White, Pink]
		 * List of second linked list: [Red, Green, Black, Pink] New linked list: [Red,
		 * Green, Black, White, Pink, Red, Green, Black, Pink]
		 */
				
		
		  LinkedList<String> colorsList = new LinkedList<>();
	      colorsList.add("Red");
	      colorsList.add("Green");
	      colorsList.add("Black");
	      colorsList.add("White");
	      colorsList.add("Pink");
	      System.out.println("List of first linked list: " + colorsList);
		  LinkedList<String> colorsList2 = new LinkedList<>();
		  colorsList2.add("Red");
		  colorsList2.add("Green");
		  colorsList2.add("Black");
		  colorsList2.add("Pink");	      
		  System.out.println("List of second linked list: " + colorsList2);
		  
		  joinLinkedLists(colorsList, colorsList2);
		  System.out.println("New linked list: " + colorsList);

	}
		 public static void joinLinkedLists(LinkedList<String> list1, LinkedList<String> list2) {
			 list1.addAll(list2);
 		    	
	}
}

