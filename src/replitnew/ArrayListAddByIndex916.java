package replitnew;

import java.util.ArrayList;

public class ArrayListAddByIndex916 {
	
	/*
	 * Steps
	 *  Add colors in ArrayList {Red, Green, Orange, White, Black} 
	 *  print theArrayList 
	 *  Add Pink color in position 
	 *  Add Yellow in Last position 
	 *  print ArrayList 
	 *  Expected Output 
	 *  [Red, Green, Orange, White, Black] 
	 *  [Pink, Red,Green, Orange, White, Yellow, Black]
	 */
			
			
	  public static void main(String[] args) {
		    ArrayList<String> colors = new ArrayList<String>();
		    colors.add("Red");
		    colors.add("Green");
		    colors.add("Orange");
		    colors.add("White");
		    colors.add("Black");
		    System.out.println(colors);
		    colors.add(0, "Pink");
		    colors.add(5, "Yellow");
		    System.out.println(colors);

		  }
		}
	
	
	


