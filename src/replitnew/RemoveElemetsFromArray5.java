package replitnew;

import java.util.Arrays;

public class RemoveElemetsFromArray5 {
	
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

        return j;
        
		
		
	}

}
