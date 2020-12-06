import java.util.Scanner;

public class Spavanac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        if(m >= 45) {
            System.out.println(h + " " + (m - 45));
        } else {
            if(h == 0) {
                System.out.println(23 + " " + (59 - (45 - m - 1)));
            } else {
                System.out.println((h - 1) + " " + (59 - (45 - m - 1)));
            }
        }
    }
}
