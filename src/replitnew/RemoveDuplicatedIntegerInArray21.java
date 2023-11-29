package replitnew;

import java.util.LinkedHashSet;

public class RemoveDuplicatedIntegerInArray21 {
	
	  public static void main(String[] args){
	        int array[] = {1, 1, 2, 2, 2, 3, 3, 4, 5, 6, 8};
	     
	        removeDuplicates(array);
	    }
			 
	    public static void removeDuplicates(int[] array){
	        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
	 
	        for (int i = 0; i < array.length; i++)
	            set.add(array[i]);
	 
	        System.out.print(set);
	    }
	 
	  
	}