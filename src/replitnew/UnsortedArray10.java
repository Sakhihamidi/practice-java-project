package replitnew;

public class UnsortedArray10 {
	public static void main(String[] args) {
		
		int largest = Integer.MIN_VALUE;
	    int secondLargest = Integer.MIN_VALUE;
	    int thirdLargest = Integer.MIN_VALUE;
	        
	        
        // Define an integer array arr containing the input values
        int[] arr = {1, 5, 4, 3, 2, 1};

        // Call the findSecondAndThirdLargest function with the input array arr
        if (!findSecondAndThirdLargest(arr)) {
            // If the input array has less than 3 elements, print the message and return
            System.out.println("Array has less than 3 elements.");
            return;
        }

        // If the input array has 3 or more elements, print the result
        System.out.println("For unsorted array: Second largest = " + secondLargest +
                ", third largest = " + thirdLargest);
    }

    // Implement a function findSecondAndThirdLargest that takes an integer array arr as input
    // and finds the second and third largest integers in the array for unsorted input.
    private static boolean findSecondAndThirdLargest(int[] arr) {
        // Get the length of the input array n
        int n = arr.length;

        // Check if n is less than 3
        if (n < 3) {
            return false;
        }

    	int largest = Integer.MIN_VALUE;
	    int secondLargest = Integer.MIN_VALUE;
	    int thirdLargest = Integer.MIN_VALUE;
	    
	    
        // Traverse the input array
        for (int i = 0; i < n; i++) {
            // Compare each element with the current values of largest, secondLargest, and thirdLargest
            int element = arr[i];

            if (element > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = element;
            } else if (element > secondLargest && element != largest) {
                thirdLargest = secondLargest;
                secondLargest = element;
            } else if (element > thirdLargest && element != secondLargest && element != largest) {
                thirdLargest = element;
            }
        }

        return true;
    }
}


