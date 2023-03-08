public class Basic {
public static void main(String[] args) {

int myMarks[] = new int[5];
// input
Scanner sc = new Scanner(System.in);
for (int i = 0; i < myMarks.length; i++) {
myMarks[i] = sc.nextInt();
}
// print
for (int i = 0; i < myMarks.length; i++) {
System.out.print(myMarks[i] + " ");
}
}
}