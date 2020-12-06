import java.util.Scanner;

public class HumanCannonball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            double v = sc.nextDouble();
            double theta = sc.nextDouble();
            double x = sc.nextDouble();
            double h1 = sc.nextDouble();
            double h2 = sc.nextDouble();

            double t = x / (v * Math.cos(Math.toRadians(theta)));
            double y = v * t * Math.sin(Math.toRadians(theta)) - (9.81 * Math.pow(t, 2)) / 2;

            if((y - h1 >= 1) && (h2 - y >= 1)) {
                System.out.println("Safe");
            } else {
                System.out.println("Not Safe");
            }
        }

        sc.close();
    }
}
