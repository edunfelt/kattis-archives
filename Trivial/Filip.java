import java.util.Scanner;

public class Filip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = Integer.toString(sc.nextInt()).split("");
        String[] b = Integer.toString(sc.nextInt()).split("");


        int c = Integer.parseInt(a[2] + a[1] + a[0]);
        int d = Integer.parseInt(b[2] + b[1] + b[0]);

        sc.close();

        System.out.println(Math.max(c, d));
    }
}
