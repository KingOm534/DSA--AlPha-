import java.util.*;

public class SubArray {
    public static void subArray(int arr[]) {
        // int sum = 0, ts = 0;
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
                    // System.out.print(arr[k] + " ");
                    currSum += arr[k];

                    // ts++;
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
                if (minSum > currSum) {
                    minSum = currSum;
                }

                // System.out.println();
            }
        }
        System.out.println("max sum = " + maxSum);
        System.out.println("min sum = " + minSum);

        // System.out.println(ts);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        subArray(arr);
    }
}
