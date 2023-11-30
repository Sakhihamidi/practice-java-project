package replitnew;

import java.util.Arrays;

public class RemoveElemetsFromArray5 {
	
//	I. Given an integer array nums and an integer val, remove all occurrences of val in the array nums in-place, and return the new length of the array.
//
//  1.Declare an integer variable j and initialize it to 0.
//	2.Loop through the array nums starting from index 0 to the end.
//	3. For each element, check if it is equal to the value val.
//	If the element is not equal to val, copy it to the jth position in the array and increment j by 1.
//	5. Continue the loop until the end of the array is reached.
//	6. The array should now contain all the elements except the occurrences of val, with the size of the array being equal to j.
//	7. Declare a new integer array result of size j.
//	8. Use the System.arraycopy() method to copy the first j elements from the modified nums array to the result array.
//	9. Return the result array.
//
//			Expected Output
//			Input: nums = [1, 2, 3, 4, 5], val = 3
//			Output: [1, 2, 4, 5]
//			Explanation: Your function should remove all occurrences of 3 in the input array nums and return the new length of the array, which is 4. The result array should contain the remaining elements [1, 2, 4, 5]. The output in the given code is the elements of the result array printed to the console.
//					
					
	
	public static void main(String[] args) {
		
        int[] nums = {1, 2, 3, 4, 5};
        int val = 3;

        int newLength = removeElement(nums, val);

        System.out.println(Arrays.toString(Arrays.copyOf(nums, newLength)));
    }

    private static int removeElement(int[] nums, int val) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }

        int[] result = new int[j];

        System.arraycopy(nums, 0, result, 0, j);
        // source Array, Starting position, result array, starting position

        return j;
        
		
		
	}

}
