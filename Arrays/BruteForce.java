/* 
 *  Sum of all possible subarrays and finds the maximum and minimum sum of a subarray
 *  The "Brute-Force" algorithm is actually the most
    straight forward approach to solving a problem.
    This technique usually involves direct computation
    based on the problem's statement and the
    definition of the concepts involved.    
 */

//Time complexity is O(n^3)----> very bad

import java.util.*;

public class BruteForce {
    public static void subArray(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        // Loop1->finds start
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            // loop2-> finds end
            for (int j = i; j < arr.length; j++) {
                int end = j;
                // loop3
                for (int k = start; k < end; k++) {
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
                if (minSum > currSum) {
                    minSum = currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
        System.out.println("min sum = " + minSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        subArray(arr);
    }
}
