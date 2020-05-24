import java.util.Arrays;
import java.util.Scanner;

public class LastFactorialDigit {
    private static int factorial(int n) {
        if(n == 1) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] tests = new int[t];

        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            tests[i] = factorial(n)%10;
        }

        sc.close();

        Arrays.stream(tests).forEach(System.out::println);
    }
}
