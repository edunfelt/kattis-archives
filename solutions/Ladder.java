import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int v = sc.nextInt();
        sc.close();

        System.out.println((int) Math.ceil(h / Math.sin(Math.toRadians(v))));
    }
}
