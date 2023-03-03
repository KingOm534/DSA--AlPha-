import java.util.*;

public class LeapOrNot {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = a.nextInt();
        boolean x = year % 4 == 0;
        boolean y = year % 100 == 0;
        boolean z = year % 400 == 0;
        if (x && (y || z)) {
            System.out.println(" year is a leap year");
        } else
            System.out.println("given year is not a leap year");

    }
}