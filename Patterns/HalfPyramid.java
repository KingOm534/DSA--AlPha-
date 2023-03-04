// 1
// 12
// 123
// 1234

package Patterns;

public class HalfPyramid {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int num = 1; num <= i; num++) {
                System.out.print(num);
            }
            System.out.println();
        }

    }
}
