import java.util.Scanner;

public class Cetvrta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), x2 = sc.nextInt();
        int y1 = sc.nextInt(), y2 = sc.nextInt();
        int z1 = sc.nextInt(), z2 = sc.nextInt();
        int out1, out2;

        sc.close();

        if(x1 == y1) {
            out1 = z1;
        } else if(x1 == z1) {
            out1 = y1;
        } else {
            out1 = x1;
        }

        if(x2 == y2) {
            out2 = z2;
        } else if(x2 == z2) {
            out2 = y2;
        } else {
            out2 = x2;
        }

        System.out.println(out1 + " " + out2);
    }
}
