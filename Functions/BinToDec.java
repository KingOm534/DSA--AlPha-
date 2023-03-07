public class BinToDec {

    public static void binToDec(int binNum) {
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * ((int) Math.pow(2, pow)));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println(decNum);
    }

    public static void decToBin(int n) {
        int pow = 0;
        int binNum = 0;
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (int) Math.pow(10, pow);
            pow++;
            n /= 2;
        }
        System.out.println(binNum);
    }

    public static void main(String[] args) {
        // binToDec(1010100101);
        decToBin(999);
    }
}