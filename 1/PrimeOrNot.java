import java.util.*;

class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int div = 2;
        while (div < n) {
            if (n % div == 0) {
                System.out.println("Not a prime");
                return;
            } else
                div++;
        }
        System.out.println("Prime");
        int $ = 32;
        System.out.println($);
    }
}