import java.lang.reflect.Array;

public class RevArray {
    public static void revArray(int array[]) {
        int start = 0, last = array.length - 1;
        while (start < last) {
            // swap
            int temp = array[last];
            array[last] = array[start];
            array[start] = temp;

            start++;
            last--;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int array[] = { 2, 5, 6, 4, 7, 8 };
        revArray(array);
    }

}
