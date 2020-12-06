import java.util.Scanner;

public class FreeFood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] days = new int[366];
        int total = 0;

        for(int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            for(int j = s; j <= t; j++) {
                days[j] = 1;
            }
        }

        sc.close();

        for(int i: days) {
            total += i;
        }

        System.out.println(total);
    }
}
