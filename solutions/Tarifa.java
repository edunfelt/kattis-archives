import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int usage = 0;

        for(int i = 0; i < n; i++){
            usage += sc.nextInt();
        }

        sc.close();

        System.out.println(x * (n + 1) - usage);
    }
}
