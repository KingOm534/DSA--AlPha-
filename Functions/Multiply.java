package Functions;

import java.util.*;

public class Multiply {

    public static void multiply(int a, int b) {
        int prod = a * b;
        System.out.println(prod);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        multiply(a, b);
    }
}
