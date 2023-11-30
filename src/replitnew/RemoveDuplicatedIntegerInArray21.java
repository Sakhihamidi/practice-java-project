package replitnew;

import java.util.LinkedHashSet;


/*= * = * = * = * = * = * = (Duplicate Integer in Array) = * = * = * = * = * = * = = * = * =
I.. You're giving an array of integer.
  1.  {1, 1, 2, 2, 2, 3, 3, 4, 5, 6, 8}
II. Write a java program to remove duplicate numbers in above array using HashSet.
Expected Output
[1, 2, 3, 4, 5, 6, 8]*/
	

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