package replitnew;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort9111 {
	  public static void main(String[] args) {
		    ArrayList<String> colors = new ArrayList<String>();
		    colors.add("Red");
		    colors.add("Green");
		    colors.add("Orange");
		    colors.add("White");
		    colors.add("Black");
		    System.out.println("List before sort: "+colors);
		    
		    sortArrayListAlphabetically(colors);
		    System.out.println("List after sort: " +colors);

		    
	  }
		    public static void sortArrayListAlphabetically(ArrayList<String> list) {
		        Collections.sort(list);
		    }

}
	  

