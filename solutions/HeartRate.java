import java.util.Scanner;

public class HeartRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int b = sc.nextInt();
            double p = sc.nextDouble();

            System.out.println((60/(p/(b-1))) + " " + ((60*b)/p) + " " + (60/(p/(b+1))));
        }

        sc.close();
    }
}
