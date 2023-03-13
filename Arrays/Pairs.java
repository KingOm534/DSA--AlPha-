public class Pairs {
    public static void pairArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("(" + arr[i] + "," + arr[j] + ")");
            }
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 6 };
        pairArray(arr1);
    }
}
