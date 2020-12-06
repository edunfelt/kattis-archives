import java.util.Scanner;

public class GrassSeedInc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        int l = sc.nextInt();
        double cost = 0;

        for(int i = 0; i < l; i++) {
            double w = sc.nextDouble();
            double h = sc.nextDouble();
            cost += w*h*c;
        }

        sc.close();

        System.out.println(cost);
    }
}
