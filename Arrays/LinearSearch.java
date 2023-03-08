public class LinearSearch {

    public static int linerSearch(int key, int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 3, 4, 6 };
        int key = 2;
        int index = linerSearch(key, array);
        if (index == -1) {
            System.out.println("no is not present");
        } else {
            System.out.println("We got the key!!!!!");
        }
    }
}
