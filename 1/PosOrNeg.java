import java.util.*;

public class PosOrNeg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = s.nextInt();
        // if (i >= 0)
        // System.out.println("Number is positive");
        // else
        // System.out.println("Number is Negative");
        String var = i >= 0 ? "Number is positive" : "Number is negative";
    }
}
