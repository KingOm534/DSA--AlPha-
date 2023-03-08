import java.util.*;

public class BinarySearch {
    public static int binarySearch(int key, int array[]) {
        int start = 0, end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == key) {// found
                return array[mid];
            }
            if (array[mid] < key) {// right
                start = mid + 1;
            } else {// left
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int array[] = { 2, 3, 6, 9 };
        System.out.println(binarySearch(9, array));
    }
}
