package Functions;

import java.util.*;

public class Binomial {

    public static int facto(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = (facto(n) / (facto(r) * facto(n - r)));
        System.out.println(c);
    }
}
