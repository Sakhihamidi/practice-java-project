package replitnew;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListReverseElementByIteration9126 {
	
	public static void main(String[] args) {
        LinkedList<String> colorsList = new LinkedList<>();
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Black");
        colorsList.add("Pink");
        colorsList.add("Orange");

        System.out.println("Original LinkedList:" + colorsList);
        System.out.println("Elements in Reverse Order:");
        
        //one way of reversing
		/*
		 * for (int i = colorsList.size(); i-- > 0; ) {
		 * System.out.println(colorsList.get(i)); }
		 */
        
        
        // onother way of reversing
        Collections.reverse(colorsList);
        for (String item : colorsList) {
            System.out.println(item);
        }

        
	}   
}
