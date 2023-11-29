package replitnew;

import java.util.ArrayList;

public class ArrayListCompare2ArrayList9116 {
	 public static void main(String[] args) {
	        ArrayList<String> colorsList1 = new ArrayList<String>();
	        colorsList1.add("Red");
	        colorsList1.add("Green");
	        colorsList1.add("Black");
	        colorsList1.add("White");
	        colorsList1.add("Pink");
	        ArrayList<String> colorsList2 = new ArrayList<String>();
	        colorsList2.add("Red");
	        colorsList2.add("Green");
	        colorsList2.add("Black");
	        colorsList2.add("Pink");

	        ArrayList<String> result = compareLists(colorsList1, colorsList2);
	        System.out.println(result);

	    }
	    public static ArrayList <String> compareLists(ArrayList<String> list1, ArrayList<String> list2) {
	        ArrayList<String> reuslyArrayList = new ArrayList<String>();

	        for (String color : list1) {
	            if (list2.contains(color)) {
	                reuslyArrayList.add("Yes");
	            } else {
	                reuslyArrayList.add("No");
	            }

	        }
	        return reuslyArrayList;
	    }

	}


