package replitnew;


public class FindingDuplicateWordsIndexInArray11 {
	/*
	 * = * = * = * = * = (Finding Duplicate words index in Array) = * = * == * = * =
	 * I.. Write Java program to find duplicate words in a given array and show
	 * index number of the duplicate words in array.
	 * 1. array = { "test", "take", "nice", "pass", "test", "nice" }
	 * Expected Output Duplicate value found: test on indexes 0 and 4 Duplicate
	 * value found: nice on indexes 2 and
	 */
			
			
	public static void main(String[] args) {
		String []array = { "test", "take", "nice", "pass", "test", "nice" };

		int pointer=0;
		String currentindex;
		while(pointer<array.length)
		{   
		  currentindex=array[pointer];
		  for(int i=0;i<array.length;i++){          
		    if(currentindex==array[i] && i>pointer){
		        System.out.println("Duplicate value found: "+currentindex + " on indexes "+ pointer+ " and " +i);
		        break;
		    }
		  }   
		  pointer++;
		}
	}
}
        
