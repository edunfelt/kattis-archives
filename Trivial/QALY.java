import java.util.Scanner;

public class QALY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double qaly = 0;

        for(int i = 0; i < n; i++) {
            double q = sc.nextDouble();
            double y = sc.nextDouble();
            qaly += q*y;
        }

        sc.close();

        System.out.println(qaly);
    }
}
