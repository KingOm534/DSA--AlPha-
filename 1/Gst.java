import java.util.*;

public class Gst {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter Price of Pencil");
        int p = a.nextInt();
        System.out.println("Enter Price of Scale");
        int s = a.nextInt();
        System.out.println("Enter Price of Eraser");
        int e = a.nextInt();
        int Total = p + s + e;
        float tutol = Total + (0.18f * Total);
        System.out.println(tutol);
    }
}
