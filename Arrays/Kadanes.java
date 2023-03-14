/*
 * this is an optimized solution for a finding maximum sum of a subarray
 * #Kadane's algorithm. It basically says that sum of negative Subarray is zero always!!
 * Time complexity is O(n) ---->Better than brute force & prefixArray
 */

public class Kadanes {

    public static void kadanes(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("MaxSum of a subArray is " + maxSum);

    }

    public static void main(String[] args) {
        int arr[] = { -1, -2, -3, -5, -4 };
        kadanes(arr);
    }

}
