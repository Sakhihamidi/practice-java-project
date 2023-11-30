package replitnew;

import java.util.ArrayList;

public class ArrayListReplaceElement9121 {
	
//	Steps
//	add colors in arraylist [Red, Green, Black, Pink]
//	print arraylist
//	replace Black with White
//	Print arraylist after Replace
//	Expected Output
//	Original array list: [Red, Green, Black, Pink]
//	array list after replace: [Red, Green, White, Pink]
//			
//			
	public static void main(String[] args) {
	    ArrayList<String> colors = new ArrayList<String>();
	    colors.add("Red");
	    colors.add("Green");
	    colors.add("Black");
	    colors.add("Pink");
	    System.out.println("Original array list: " + colors);
	    colors.set(2, "White");
	    System.out.println("array list after replace: " +colors);


	}
	
}
