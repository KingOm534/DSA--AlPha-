public class Rev {
    public static void main(String[] args) {
        int a = 534;
        int rev = 0;

        while (a > 0) {
            int lastDigit = a % 10;
            rev = rev * 10 + lastDigit;
            a /= 10;
        }
        System.out.println(rev);
    }
}
