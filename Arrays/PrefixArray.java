/*
 * this is an optimized solution for a finding maximum sum of a subarray
 * Time complexity is O(n^2) ---->Better than brute force
 */

public class PrefixArray {
    public static void subArray(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int preArray[] = new int[arr.length];

        // calculating prefix Array
        for (int i = 1; i < preArray.length; i++) {
            preArray[i] = preArray[i - 1] + arr[i];
        }
        // Loop1->finds start
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            // loop2-> finds end
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = start == 0 ? preArray[end] : preArray[end] - preArray[start = 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        subArray(array);
    }
}
