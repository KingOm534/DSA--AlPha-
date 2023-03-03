import java.util.*;

public class PrimeOrNot2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n == 2) {
            System.out.println("Number is prime");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true)
                System.out.println("Number is Prime");
            else
                System.out.println("Number is not Prime");

        }
    }
}
