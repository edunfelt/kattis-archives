import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zamka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        ArrayList<Integer> sums = new ArrayList<>();

        sc.close();

        for(int i = l; i <= d; i++) {
            int cur = i;
            int sum = 0;

            while(cur > 0) {
                sum += cur % 10;
                cur /= 10;
            }

            if(sum == x) {
                sums.add(i);
            }
        }

        System.out.println(Collections.min(sums));
        System.out.println(Collections.max(sums));
    }
}
