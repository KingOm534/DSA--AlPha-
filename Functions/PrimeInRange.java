package Functions;

public class PrimeInRange {

    public static boolean IsPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i >= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static int PrimesInRange(int n) {
        return 3;
    }

    public static void main(String[] args) {
        System.out.println(IsPrime(123));
    }
}