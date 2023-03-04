// A
// BC
// DEF
// GHIJ
package Patterns;

public class CharPattern {
    public static void main(String[] args) {

        int n = 4;
        char c = 'A';
        for (int line = 1; line <= n; line++) {
            for (int ch = 1; ch <= line; ch++) {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }

    }
}
