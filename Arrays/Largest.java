import java.util.*;

public class Largest {
    public static int largeNumber(int array[]) {
        int larger = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (larger < array[i]) {
                larger = array[i];
            }
        }
        return larger;
    }

    // public static int smallNumber(int array[]) {
    // int smaller = Integer.MAX_VALUE;
    // for (int i = 0; i < array.length; i++) {
    // if (smaller > array[i]) {
    // smaller = array[i];
    // }
    // }
    // return smaller;
    // }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(largeNumber(array));
        // System.out.println(smallNumber(array));
    }
}
