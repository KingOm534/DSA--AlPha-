public class SumOfDigit {
    public static int sum(int n) {
        int sumOfDigit = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sumOfDigit += lastDigit;
            n /= 10;
        }
        return sumOfDigit;
    }

    public static void main(String[] args) {
        System.out.println(sum(1254783));
    }
}
