import java.util.Scanner;

public class BatterUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;
        int walks = 0;

        for(int i = 0; i < n; i++) {
            int cur = sc.nextInt();
            if(cur != -1) {
                total += cur;
            } else {
                walks++;
            }
        }

        sc.close();

        double percentage = total/(n - walks);

        System.out.println(percentage);
    }
}
