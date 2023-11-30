package replitnew;

import java.util.HashSet;

public class HashSetCompare2Set_RetainMatches9210 {
	public static void main(String[] args) {
		
//		Steps
//		dd colors in HashSet [Red, Green, Black, White]
//		add colors in another HashSet [Red, Pink, Black, Orange]
//		Compare this 2 HashSet and print matched elements
//		Expected Output
//		Frist HashSet content: [Red, White, Black, Green]
//		Second HashSet content: [Red, Pink, Black, Orange]
//		HashSet content:
//		[Red, Black]
//				
				
	
    HashSet<String> colorSet1 = new HashSet<>();
      colorSet1.add("Red");
      colorSet1.add("Green");
      colorSet1.add("Black");
      colorSet1.add("White");
      System.out.println("Frist HashSet content: " + colorSet1);

      HashSet<String> colorSet2 = new HashSet<>();
      colorSet2.add("Red");
      colorSet2.add("Pink");
      colorSet2.add("Black");
      colorSet2.add("Orange");
      System.out.println("Second HashSet content: " + colorSet2);

      
      //first approach
		
      System.out.println("HashSet content:");
      colorSet1.retainAll(colorSet2);
      System.out.println(colorSet1);
		 
      
      
      //Second approach
		/*
		 * System.out.println("HashSet content: ");
		 * 
		 * for (final String element : colorSet1) {
		 * 
		 * if (colorSet2.contains(element)) { System.out.println(element); } }
		 */

      
	}
}
