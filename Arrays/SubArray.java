import java.util.*;

public class SubArray {
    public static void subArray(int arr[]) {
        int ts = 0;
        // Loop1->finds start
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            // loop2-> finds end
            for (int j = i; j < arr.length; j++) {
                int end = j;
                // loop3
                for (int k = start; k < end; k++) {
                    System.out.print(arr[k] + " ");
                    ts++;
                }
                System.out.println();
            }
        }
        System.out.println("Total subArrays = " + ts);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        subArray(arr);
    }
}
