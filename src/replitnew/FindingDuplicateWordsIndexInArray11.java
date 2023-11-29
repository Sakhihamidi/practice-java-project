package replitnew;


public class FindingDuplicateWordsIndexInArray11 {

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
        
