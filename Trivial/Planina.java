import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = (int)Math.pow(Math.pow(2, sc.nextInt()) + 1, 2);
        sc.close();

        System.out.println(n);
    }
}

