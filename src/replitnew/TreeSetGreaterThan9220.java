package replitnew;

import java.util.TreeSet;

public class TreeSetGreaterThan9220 {
	public static void main(String[] args) {
		
//		Steps
//		Add numbers in TreeSet 10, 22, 25, 36, 16, 70, 82, 89, 14
//		Print TreeSet
//		print number Strictly greater than 76
//		print number Strictly greater than 31
//		Note: Add data type to your collection objects and import required class for execute your code.
//
//		Expected Output
//		TreeSet: [10, 14, 16, 22, 25, 36, 70, 82, 89]
//		Strictly greater than 76 : 82
//		Strictly greater than 31 : 36
//		
		
		
	TreeSet<Integer> numbers = new TreeSet<>();

	numbers.add(10);
	numbers.add(22);
	numbers.add(25);
	numbers.add(36);
	numbers.add(16);
	numbers.add(70);
	numbers.add(82);
	numbers.add(89);
	numbers.add(14);
	
	System.out.println("Tree set: " + numbers);
	// first Method will print the set of bigger that number
	System.out.println("Strictly greater than 76 : " +numbers.tailSet(76+1));
	System.out.println("Strictly greater than 31 : " +numbers.tailSet(31+1));

	//sedond method
	System.out.println("Strictly greater than 76 : " +numbers.higher(76));
	System.out.println("Strictly greater than 31 : " +numbers.higher(31));
	
	
}
}
