public class IsPallindrome {
    public static boolean isPallindrome(int n) {
        int num = n;
        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        if (rev == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPallindrome(121));
    }
}
